/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */


/*
 * Copyright (C) 2016 Clover Network, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.clover.sdk.v3.report;

import com.clover.sdk.GenericClient;
import com.clover.sdk.GenericParcelable;

/**
 * This is an auto-generated Clover data object.
 * <p>
 * Combines a collection of rows with a total to form a section in payments API's
 * <p>
 * <h3>Fields</h3>
 * <ul>
 * <li>{@link #getRows rows}</li>
 * <li>{@link #getTotal total}</li>
 * </ul>
 */
@SuppressWarnings("all")
public class SummarySection extends GenericParcelable implements com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  /**
   * The detail rows of a particular section of a payments API
   */
  public java.util.List<com.clover.sdk.v3.report.Summary> getRows() {
    return genClient.cacheGet(CacheKey.rows);
  }

  /**
   * The sum of the above rows
   */
  public com.clover.sdk.v3.report.Summary getTotal() {
    return genClient.cacheGet(CacheKey.total);
  }




  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<SummarySection> {
    rows {
      @Override
      public Object extractValue(SummarySection instance) {
        return instance.genClient.extractListRecord("rows", com.clover.sdk.v3.report.Summary.JSON_CREATOR);
      }
    },
    total {
      @Override
      public Object extractValue(SummarySection instance) {
        return instance.genClient.extractRecord("total", com.clover.sdk.v3.report.Summary.JSON_CREATOR);
      }
    },
      ;
  }

  private GenericClient<SummarySection> genClient;

  /**
  * Constructs a new empty instance.
  */
  public SummarySection() {
    genClient = new GenericClient<SummarySection>(this);
  }

  @Override
  protected GenericClient getGenericClient() {
    return genClient;
  }

  /**
  * Constructs a new empty instance.
  */
  protected SummarySection(boolean noInit) {
    genClient = null;
  }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public SummarySection(String json) throws IllegalArgumentException {
    this();
    try {
      genClient.setJsonObject(new org.json.JSONObject(json));
    } catch (org.json.JSONException e) {
      throw new IllegalArgumentException("invalid json", e);
    }
  }

  /**
   * Construct a new instance backed by the given JSONObject, the parameter is not copied so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public SummarySection(org.json.JSONObject jsonObject) {
    this();
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public SummarySection(SummarySection src) {
    this();
    if (src.genClient.getJsonObject() != null) {
      genClient.setJsonObject(com.clover.sdk.v3.JsonHelper.deepCopy(src.genClient.getJSONObject()));
    }
  }

  /**
   * Returns the internal JSONObject backing this instance, the return value is not a copy so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public org.json.JSONObject getJSONObject() {
    return genClient.getJSONObject();
  }

  @Override
  public void validate() {
  }

  /** Checks whether the 'rows' field is set and is not null */
  public boolean isNotNullRows() {
    return genClient.cacheValueIsNotNull(CacheKey.rows);
  }

  /** Checks whether the 'rows' field is set and is not null and is not empty */
  public boolean isNotEmptyRows() { return isNotNullRows() && !getRows().isEmpty(); }

  /** Checks whether the 'total' field is set and is not null */
  public boolean isNotNullTotal() {
    return genClient.cacheValueIsNotNull(CacheKey.total);
  }



  /** Checks whether the 'rows' field has been set, however the value could be null */
  public boolean hasRows() {
    return genClient.cacheHasKey(CacheKey.rows);
  }

  /** Checks whether the 'total' field has been set, however the value could be null */
  public boolean hasTotal() {
    return genClient.cacheHasKey(CacheKey.total);
  }


  /**
   * Sets the field 'rows'.
   *
   * Nulls in the given List are skipped. List parameter is copied, so it will not reflect any changes, but objects inside it will.
   */
  public SummarySection setRows(java.util.List<com.clover.sdk.v3.report.Summary> rows) {
    return genClient.setArrayRecord(rows, CacheKey.rows);
  }

  /**
   * Sets the field 'total'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public SummarySection setTotal(com.clover.sdk.v3.report.Summary total) {
    return genClient.setRecord(total, CacheKey.total);
  }


  /** Clears the 'rows' field, the 'has' method for this field will now return false */
  public void clearRows() {
    genClient.clear(CacheKey.rows);
  }
  /** Clears the 'total' field, the 'has' method for this field will now return false */
  public void clearTotal() {
    genClient.clear(CacheKey.total);
  }


  /**
   * Returns true if this instance has any changes.
   */
  public boolean containsChanges() {
    return genClient.containsChanges();
  }

  /**
   * Reset the log of changes made to this instance, calling copyChanges() after this would return an empty instance.
   */
  public void resetChangeLog() {
    genClient.resetChangeLog();
  }

  /**
   * Create a copy of this instance that contains only fields that were set after the constructor was called.
   */
  public SummarySection copyChanges() {
    SummarySection copy = new SummarySection();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(SummarySection src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new SummarySection(src).getJSONObject(), src.genClient);
    }
  }

  public static final android.os.Parcelable.Creator<SummarySection> CREATOR = new android.os.Parcelable.Creator<SummarySection>() {
    @Override
    public SummarySection createFromParcel(android.os.Parcel in) {
      SummarySection instance = new SummarySection(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public SummarySection[] newArray(int size) {
      return new SummarySection[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<SummarySection> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<SummarySection>() {
    @Override
    public SummarySection create(org.json.JSONObject jsonObject) {
      return new SummarySection(jsonObject);
    }
  };

  public interface Constraints {

    public static final boolean ROWS_IS_REQUIRED = false;
    public static final boolean TOTAL_IS_REQUIRED = false;

  }

}