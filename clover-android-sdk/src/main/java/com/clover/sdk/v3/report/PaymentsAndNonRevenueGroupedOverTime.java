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
 * Holds summaries of payments, credits, refunds and non-revenue item sales grouped by a configurable time period, like by hour
 * <p>
 * <h3>Fields</h3>
 * <ul>
 * <li>{@link #getGrossSalesBeforeDiscounts grossSalesBeforeDiscounts}</li>
 * <li>{@link #getPayments payments}</li>
 * <li>{@link #getNonRevenue nonRevenue}</li>
 * <li>{@link #getCredits credits}</li>
 * <li>{@link #getRefunds refunds}</li>
 * <li>{@link #getDiscounts discounts}</li>
 * <li>{@link #getVoidedLineItems voidedLineItems}</li>
 * <li>{@link #getOpenOrders openOrders}</li>
 * <li>{@link #getFullyPaidOrders fullyPaidOrders}</li>
 * <li>{@link #getGiftCards giftCards}</li>
 * <li>{@link #getPeriod period}</li>
 * </ul>
 */
@SuppressWarnings("all")
public class PaymentsAndNonRevenueGroupedOverTime extends GenericParcelable implements com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  /**
   * Summaries grouped over time of what the total of order payments would have been if no discounts or refunds had occurred. This includes tax and service charge that would have been present in the absence of discounts.
   */
  public com.clover.sdk.v3.report.SummarySection getGrossSalesBeforeDiscounts() {
    return genClient.cacheGet(CacheKey.grossSalesBeforeDiscounts);
  }

  /**
   * Summaries grouped over time of payments. Does not include items marked non-revenue
   */
  public com.clover.sdk.v3.report.SummarySection getPayments() {
    return genClient.cacheGet(CacheKey.payments);
  }

  /**
   * Summaries grouped over time of sales of items marked non-revenue including modifiers and discounts
   */
  public com.clover.sdk.v3.report.SummarySection getNonRevenue() {
    return genClient.cacheGet(CacheKey.nonRevenue);
  }

  /**
   * Summaries grouped over time of credits, also known as manual or naked refunds
   */
  public com.clover.sdk.v3.report.SummarySection getCredits() {
    return genClient.cacheGet(CacheKey.credits);
  }

  /**
   * Summaries grouped over time of refunds
   */
  public com.clover.sdk.v3.report.SummarySection getRefunds() {
    return genClient.cacheGet(CacheKey.refunds);
  }

  /**
   * Summaries grouped over time of discounts. This discount amount does not include any tax or service charge that would have occurred in the absence of discounts.
   */
  public com.clover.sdk.v3.report.SummarySection getDiscounts() {
    return genClient.cacheGet(CacheKey.discounts);
  }

  /**
   * Summaries grouped over time of voided line items
   */
  public com.clover.sdk.v3.report.SummarySection getVoidedLineItems() {
    return genClient.cacheGet(CacheKey.voidedLineItems);
  }

  /**
   * Summaries grouped over time of open orders. Open orders are orders that still require more payments.
   */
  public com.clover.sdk.v3.report.SummarySection getOpenOrders() {
    return genClient.cacheGet(CacheKey.openOrders);
  }

  /**
   * Summaries grouped over time of fully paid orders. Fully paid orders are orders where the sum of payments minus the sum of refunds equals the sum of the value of line items with modifiers and discounts.
   */
  public com.clover.sdk.v3.report.SummarySection getFullyPaidOrders() {
    return genClient.cacheGet(CacheKey.fullyPaidOrders);
  }

  /**
   * Summaries grouped over time of gift cards
   */
  public com.clover.sdk.v3.report.SummarySection getGiftCards() {
    return genClient.cacheGet(CacheKey.giftCards);
  }

  /**
   * The time period that defines the size of the groups: hour, day, week, month
   */
  public com.clover.sdk.v3.report.TimePeriod getPeriod() {
    return genClient.cacheGet(CacheKey.period);
  }




  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<PaymentsAndNonRevenueGroupedOverTime> {
    grossSalesBeforeDiscounts {
      @Override
      public Object extractValue(PaymentsAndNonRevenueGroupedOverTime instance) {
        return instance.genClient.extractRecord("grossSalesBeforeDiscounts", com.clover.sdk.v3.report.SummarySection.JSON_CREATOR);
      }
    },
    payments {
      @Override
      public Object extractValue(PaymentsAndNonRevenueGroupedOverTime instance) {
        return instance.genClient.extractRecord("payments", com.clover.sdk.v3.report.SummarySection.JSON_CREATOR);
      }
    },
    nonRevenue {
      @Override
      public Object extractValue(PaymentsAndNonRevenueGroupedOverTime instance) {
        return instance.genClient.extractRecord("nonRevenue", com.clover.sdk.v3.report.SummarySection.JSON_CREATOR);
      }
    },
    credits {
      @Override
      public Object extractValue(PaymentsAndNonRevenueGroupedOverTime instance) {
        return instance.genClient.extractRecord("credits", com.clover.sdk.v3.report.SummarySection.JSON_CREATOR);
      }
    },
    refunds {
      @Override
      public Object extractValue(PaymentsAndNonRevenueGroupedOverTime instance) {
        return instance.genClient.extractRecord("refunds", com.clover.sdk.v3.report.SummarySection.JSON_CREATOR);
      }
    },
    discounts {
      @Override
      public Object extractValue(PaymentsAndNonRevenueGroupedOverTime instance) {
        return instance.genClient.extractRecord("discounts", com.clover.sdk.v3.report.SummarySection.JSON_CREATOR);
      }
    },
    voidedLineItems {
      @Override
      public Object extractValue(PaymentsAndNonRevenueGroupedOverTime instance) {
        return instance.genClient.extractRecord("voidedLineItems", com.clover.sdk.v3.report.SummarySection.JSON_CREATOR);
      }
    },
    openOrders {
      @Override
      public Object extractValue(PaymentsAndNonRevenueGroupedOverTime instance) {
        return instance.genClient.extractRecord("openOrders", com.clover.sdk.v3.report.SummarySection.JSON_CREATOR);
      }
    },
    fullyPaidOrders {
      @Override
      public Object extractValue(PaymentsAndNonRevenueGroupedOverTime instance) {
        return instance.genClient.extractRecord("fullyPaidOrders", com.clover.sdk.v3.report.SummarySection.JSON_CREATOR);
      }
    },
    giftCards {
      @Override
      public Object extractValue(PaymentsAndNonRevenueGroupedOverTime instance) {
        return instance.genClient.extractRecord("giftCards", com.clover.sdk.v3.report.SummarySection.JSON_CREATOR);
      }
    },
    period {
      @Override
      public Object extractValue(PaymentsAndNonRevenueGroupedOverTime instance) {
        return instance.genClient.extractEnum("period", com.clover.sdk.v3.report.TimePeriod.class);
      }
    },
      ;
  }

  private GenericClient<PaymentsAndNonRevenueGroupedOverTime> genClient;

  /**
  * Constructs a new empty instance.
  */
  public PaymentsAndNonRevenueGroupedOverTime() {
    genClient = new GenericClient<PaymentsAndNonRevenueGroupedOverTime>(this);
  }

  @Override
  protected GenericClient getGenericClient() {
    return genClient;
  }

  /**
  * Constructs a new empty instance.
  */
  protected PaymentsAndNonRevenueGroupedOverTime(boolean noInit) {
    genClient = null;
  }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public PaymentsAndNonRevenueGroupedOverTime(String json) throws IllegalArgumentException {
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
  public PaymentsAndNonRevenueGroupedOverTime(org.json.JSONObject jsonObject) {
    this();
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public PaymentsAndNonRevenueGroupedOverTime(PaymentsAndNonRevenueGroupedOverTime src) {
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

  /** Checks whether the 'grossSalesBeforeDiscounts' field is set and is not null */
  public boolean isNotNullGrossSalesBeforeDiscounts() {
    return genClient.cacheValueIsNotNull(CacheKey.grossSalesBeforeDiscounts);
  }

  /** Checks whether the 'payments' field is set and is not null */
  public boolean isNotNullPayments() {
    return genClient.cacheValueIsNotNull(CacheKey.payments);
  }

  /** Checks whether the 'nonRevenue' field is set and is not null */
  public boolean isNotNullNonRevenue() {
    return genClient.cacheValueIsNotNull(CacheKey.nonRevenue);
  }

  /** Checks whether the 'credits' field is set and is not null */
  public boolean isNotNullCredits() {
    return genClient.cacheValueIsNotNull(CacheKey.credits);
  }

  /** Checks whether the 'refunds' field is set and is not null */
  public boolean isNotNullRefunds() {
    return genClient.cacheValueIsNotNull(CacheKey.refunds);
  }

  /** Checks whether the 'discounts' field is set and is not null */
  public boolean isNotNullDiscounts() {
    return genClient.cacheValueIsNotNull(CacheKey.discounts);
  }

  /** Checks whether the 'voidedLineItems' field is set and is not null */
  public boolean isNotNullVoidedLineItems() {
    return genClient.cacheValueIsNotNull(CacheKey.voidedLineItems);
  }

  /** Checks whether the 'openOrders' field is set and is not null */
  public boolean isNotNullOpenOrders() {
    return genClient.cacheValueIsNotNull(CacheKey.openOrders);
  }

  /** Checks whether the 'fullyPaidOrders' field is set and is not null */
  public boolean isNotNullFullyPaidOrders() {
    return genClient.cacheValueIsNotNull(CacheKey.fullyPaidOrders);
  }

  /** Checks whether the 'giftCards' field is set and is not null */
  public boolean isNotNullGiftCards() {
    return genClient.cacheValueIsNotNull(CacheKey.giftCards);
  }

  /** Checks whether the 'period' field is set and is not null */
  public boolean isNotNullPeriod() {
    return genClient.cacheValueIsNotNull(CacheKey.period);
  }



  /** Checks whether the 'grossSalesBeforeDiscounts' field has been set, however the value could be null */
  public boolean hasGrossSalesBeforeDiscounts() {
    return genClient.cacheHasKey(CacheKey.grossSalesBeforeDiscounts);
  }

  /** Checks whether the 'payments' field has been set, however the value could be null */
  public boolean hasPayments() {
    return genClient.cacheHasKey(CacheKey.payments);
  }

  /** Checks whether the 'nonRevenue' field has been set, however the value could be null */
  public boolean hasNonRevenue() {
    return genClient.cacheHasKey(CacheKey.nonRevenue);
  }

  /** Checks whether the 'credits' field has been set, however the value could be null */
  public boolean hasCredits() {
    return genClient.cacheHasKey(CacheKey.credits);
  }

  /** Checks whether the 'refunds' field has been set, however the value could be null */
  public boolean hasRefunds() {
    return genClient.cacheHasKey(CacheKey.refunds);
  }

  /** Checks whether the 'discounts' field has been set, however the value could be null */
  public boolean hasDiscounts() {
    return genClient.cacheHasKey(CacheKey.discounts);
  }

  /** Checks whether the 'voidedLineItems' field has been set, however the value could be null */
  public boolean hasVoidedLineItems() {
    return genClient.cacheHasKey(CacheKey.voidedLineItems);
  }

  /** Checks whether the 'openOrders' field has been set, however the value could be null */
  public boolean hasOpenOrders() {
    return genClient.cacheHasKey(CacheKey.openOrders);
  }

  /** Checks whether the 'fullyPaidOrders' field has been set, however the value could be null */
  public boolean hasFullyPaidOrders() {
    return genClient.cacheHasKey(CacheKey.fullyPaidOrders);
  }

  /** Checks whether the 'giftCards' field has been set, however the value could be null */
  public boolean hasGiftCards() {
    return genClient.cacheHasKey(CacheKey.giftCards);
  }

  /** Checks whether the 'period' field has been set, however the value could be null */
  public boolean hasPeriod() {
    return genClient.cacheHasKey(CacheKey.period);
  }


  /**
   * Sets the field 'grossSalesBeforeDiscounts'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public PaymentsAndNonRevenueGroupedOverTime setGrossSalesBeforeDiscounts(com.clover.sdk.v3.report.SummarySection grossSalesBeforeDiscounts) {
    return genClient.setRecord(grossSalesBeforeDiscounts, CacheKey.grossSalesBeforeDiscounts);
  }

  /**
   * Sets the field 'payments'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public PaymentsAndNonRevenueGroupedOverTime setPayments(com.clover.sdk.v3.report.SummarySection payments) {
    return genClient.setRecord(payments, CacheKey.payments);
  }

  /**
   * Sets the field 'nonRevenue'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public PaymentsAndNonRevenueGroupedOverTime setNonRevenue(com.clover.sdk.v3.report.SummarySection nonRevenue) {
    return genClient.setRecord(nonRevenue, CacheKey.nonRevenue);
  }

  /**
   * Sets the field 'credits'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public PaymentsAndNonRevenueGroupedOverTime setCredits(com.clover.sdk.v3.report.SummarySection credits) {
    return genClient.setRecord(credits, CacheKey.credits);
  }

  /**
   * Sets the field 'refunds'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public PaymentsAndNonRevenueGroupedOverTime setRefunds(com.clover.sdk.v3.report.SummarySection refunds) {
    return genClient.setRecord(refunds, CacheKey.refunds);
  }

  /**
   * Sets the field 'discounts'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public PaymentsAndNonRevenueGroupedOverTime setDiscounts(com.clover.sdk.v3.report.SummarySection discounts) {
    return genClient.setRecord(discounts, CacheKey.discounts);
  }

  /**
   * Sets the field 'voidedLineItems'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public PaymentsAndNonRevenueGroupedOverTime setVoidedLineItems(com.clover.sdk.v3.report.SummarySection voidedLineItems) {
    return genClient.setRecord(voidedLineItems, CacheKey.voidedLineItems);
  }

  /**
   * Sets the field 'openOrders'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public PaymentsAndNonRevenueGroupedOverTime setOpenOrders(com.clover.sdk.v3.report.SummarySection openOrders) {
    return genClient.setRecord(openOrders, CacheKey.openOrders);
  }

  /**
   * Sets the field 'fullyPaidOrders'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public PaymentsAndNonRevenueGroupedOverTime setFullyPaidOrders(com.clover.sdk.v3.report.SummarySection fullyPaidOrders) {
    return genClient.setRecord(fullyPaidOrders, CacheKey.fullyPaidOrders);
  }

  /**
   * Sets the field 'giftCards'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public PaymentsAndNonRevenueGroupedOverTime setGiftCards(com.clover.sdk.v3.report.SummarySection giftCards) {
    return genClient.setRecord(giftCards, CacheKey.giftCards);
  }

  /**
   * Sets the field 'period'.
   */
  public PaymentsAndNonRevenueGroupedOverTime setPeriod(com.clover.sdk.v3.report.TimePeriod period) {
    return genClient.setOther(period, CacheKey.period);
  }


  /** Clears the 'grossSalesBeforeDiscounts' field, the 'has' method for this field will now return false */
  public void clearGrossSalesBeforeDiscounts() {
    genClient.clear(CacheKey.grossSalesBeforeDiscounts);
  }
  /** Clears the 'payments' field, the 'has' method for this field will now return false */
  public void clearPayments() {
    genClient.clear(CacheKey.payments);
  }
  /** Clears the 'nonRevenue' field, the 'has' method for this field will now return false */
  public void clearNonRevenue() {
    genClient.clear(CacheKey.nonRevenue);
  }
  /** Clears the 'credits' field, the 'has' method for this field will now return false */
  public void clearCredits() {
    genClient.clear(CacheKey.credits);
  }
  /** Clears the 'refunds' field, the 'has' method for this field will now return false */
  public void clearRefunds() {
    genClient.clear(CacheKey.refunds);
  }
  /** Clears the 'discounts' field, the 'has' method for this field will now return false */
  public void clearDiscounts() {
    genClient.clear(CacheKey.discounts);
  }
  /** Clears the 'voidedLineItems' field, the 'has' method for this field will now return false */
  public void clearVoidedLineItems() {
    genClient.clear(CacheKey.voidedLineItems);
  }
  /** Clears the 'openOrders' field, the 'has' method for this field will now return false */
  public void clearOpenOrders() {
    genClient.clear(CacheKey.openOrders);
  }
  /** Clears the 'fullyPaidOrders' field, the 'has' method for this field will now return false */
  public void clearFullyPaidOrders() {
    genClient.clear(CacheKey.fullyPaidOrders);
  }
  /** Clears the 'giftCards' field, the 'has' method for this field will now return false */
  public void clearGiftCards() {
    genClient.clear(CacheKey.giftCards);
  }
  /** Clears the 'period' field, the 'has' method for this field will now return false */
  public void clearPeriod() {
    genClient.clear(CacheKey.period);
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
  public PaymentsAndNonRevenueGroupedOverTime copyChanges() {
    PaymentsAndNonRevenueGroupedOverTime copy = new PaymentsAndNonRevenueGroupedOverTime();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(PaymentsAndNonRevenueGroupedOverTime src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new PaymentsAndNonRevenueGroupedOverTime(src).getJSONObject(), src.genClient);
    }
  }

  public static final android.os.Parcelable.Creator<PaymentsAndNonRevenueGroupedOverTime> CREATOR = new android.os.Parcelable.Creator<PaymentsAndNonRevenueGroupedOverTime>() {
    @Override
    public PaymentsAndNonRevenueGroupedOverTime createFromParcel(android.os.Parcel in) {
      PaymentsAndNonRevenueGroupedOverTime instance = new PaymentsAndNonRevenueGroupedOverTime(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public PaymentsAndNonRevenueGroupedOverTime[] newArray(int size) {
      return new PaymentsAndNonRevenueGroupedOverTime[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<PaymentsAndNonRevenueGroupedOverTime> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<PaymentsAndNonRevenueGroupedOverTime>() {
    @Override
    public PaymentsAndNonRevenueGroupedOverTime create(org.json.JSONObject jsonObject) {
      return new PaymentsAndNonRevenueGroupedOverTime(jsonObject);
    }
  };

  public interface Constraints {

    public static final boolean GROSSSALESBEFOREDISCOUNTS_IS_REQUIRED = false;
    public static final boolean PAYMENTS_IS_REQUIRED = false;
    public static final boolean NONREVENUE_IS_REQUIRED = false;
    public static final boolean CREDITS_IS_REQUIRED = false;
    public static final boolean REFUNDS_IS_REQUIRED = false;
    public static final boolean DISCOUNTS_IS_REQUIRED = false;
    public static final boolean VOIDEDLINEITEMS_IS_REQUIRED = false;
    public static final boolean OPENORDERS_IS_REQUIRED = false;
    public static final boolean FULLYPAIDORDERS_IS_REQUIRED = false;
    public static final boolean GIFTCARDS_IS_REQUIRED = false;
    public static final boolean PERIOD_IS_REQUIRED = false;

  }

}