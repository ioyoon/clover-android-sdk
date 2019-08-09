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

package com.clover.sdk.v3.remotepay;

import com.clover.sdk.GenericClient;
import com.clover.sdk.GenericParcelable;

/**
 * This is an auto-generated Clover data object.
 * <p>
 * <h3>Fields</h3>
 * <ul>
 * <li>{@link #getStatus status}</li>
 * </ul>
 */
@SuppressWarnings("all")
public class TransactionTypeEnum extends GenericParcelable implements com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  public com.clover.sdk.v3.remotepay.TransactionType getStatus() {
    return genClient.cacheGet(CacheKey.status);
  }




  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<TransactionTypeEnum> {
    status {
      @Override
      public Object extractValue(TransactionTypeEnum instance) {
        return instance.genClient.extractEnum("status", com.clover.sdk.v3.remotepay.TransactionType.class);
      }
    },
      ;
  }

  private GenericClient<TransactionTypeEnum> genClient;

  /**
   * Constructs a new empty instance.
   */
  public TransactionTypeEnum() {
    genClient = new GenericClient<TransactionTypeEnum>(this);
  }

  @Override
  protected GenericClient getGenericClient() {
    return genClient;
  }

  /**
   * Constructs a new empty instance.
   */
  protected TransactionTypeEnum(boolean noInit) {
    genClient = null;
  }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public TransactionTypeEnum(String json) throws IllegalArgumentException {
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
  public TransactionTypeEnum(org.json.JSONObject jsonObject) {
    this();
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public TransactionTypeEnum(TransactionTypeEnum src) {
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

  /** Checks whether the 'status' field is set and is not null */
  public boolean isNotNullStatus() {
    return genClient.cacheValueIsNotNull(CacheKey.status);
  }



  /** Checks whether the 'status' field has been set, however the value could be null */
  public boolean hasStatus() {
    return genClient.cacheHasKey(CacheKey.status);
  }


  /**
   * Sets the field 'status'.
   */
  public TransactionTypeEnum setStatus(com.clover.sdk.v3.remotepay.TransactionType status) {
    return genClient.setOther(status, CacheKey.status);
  }


  /** Clears the 'status' field, the 'has' method for this field will now return false */
  public void clearStatus() {
    genClient.clear(CacheKey.status);
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
  public TransactionTypeEnum copyChanges() {
    TransactionTypeEnum copy = new TransactionTypeEnum();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(TransactionTypeEnum src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new TransactionTypeEnum(src).getJSONObject(), src.genClient);
    }
  }

  public static final android.os.Parcelable.Creator<TransactionTypeEnum> CREATOR = new android.os.Parcelable.Creator<TransactionTypeEnum>() {
    @Override
    public TransactionTypeEnum createFromParcel(android.os.Parcel in) {
      TransactionTypeEnum instance = new TransactionTypeEnum(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public TransactionTypeEnum[] newArray(int size) {
      return new TransactionTypeEnum[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<TransactionTypeEnum> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<TransactionTypeEnum>() {
    @Override
    public TransactionTypeEnum create(org.json.JSONObject jsonObject) {
      return new TransactionTypeEnum(jsonObject);
    }
  };

  public interface Constraints {

    public static final boolean STATUS_IS_REQUIRED = false;

  }

}
