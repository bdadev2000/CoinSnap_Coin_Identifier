package com.google.api;

import a4.Y0;
import a4.Z0;
import a4.a1;
import a4.b1;
import com.google.protobuf.AbstractC1880c;
import com.google.protobuf.C1912g3;
import com.google.protobuf.D2;
import com.google.protobuf.E2;
import com.google.protobuf.G3;
import com.google.protobuf.H;
import com.google.protobuf.InterfaceC1948l4;
import com.google.protobuf.K2;
import com.google.protobuf.L2;
import com.google.protobuf.S;
import com.google.protobuf.W1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public final class QuotaLimit extends L2 implements b1 {
    private static final QuotaLimit DEFAULT_INSTANCE;
    public static final int DEFAULT_LIMIT_FIELD_NUMBER = 3;
    public static final int DESCRIPTION_FIELD_NUMBER = 2;
    public static final int DISPLAY_NAME_FIELD_NUMBER = 12;
    public static final int DURATION_FIELD_NUMBER = 5;
    public static final int FREE_TIER_FIELD_NUMBER = 7;
    public static final int MAX_LIMIT_FIELD_NUMBER = 4;
    public static final int METRIC_FIELD_NUMBER = 8;
    public static final int NAME_FIELD_NUMBER = 6;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int UNIT_FIELD_NUMBER = 9;
    public static final int VALUES_FIELD_NUMBER = 10;
    private long defaultLimit_;
    private long freeTier_;
    private long maxLimit_;
    private G3 values_ = G3.emptyMapField();
    private String name_ = "";
    private String description_ = "";
    private String duration_ = "";
    private String metric_ = "";
    private String unit_ = "";
    private String displayName_ = "";

    static {
        QuotaLimit quotaLimit = new QuotaLimit();
        DEFAULT_INSTANCE = quotaLimit;
        L2.registerDefaultInstance(QuotaLimit.class, quotaLimit);
    }

    private QuotaLimit() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDefaultLimit() {
        this.defaultLimit_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDescription() {
        this.description_ = getDefaultInstance().getDescription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisplayName() {
        this.displayName_ = getDefaultInstance().getDisplayName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDuration() {
        this.duration_ = getDefaultInstance().getDuration();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFreeTier() {
        this.freeTier_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaxLimit() {
        this.maxLimit_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMetric() {
        this.metric_ = getDefaultInstance().getMetric();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUnit() {
        this.unit_ = getDefaultInstance().getUnit();
    }

    public static QuotaLimit getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Long> getMutableValuesMap() {
        return internalGetMutableValues();
    }

    private G3 internalGetMutableValues() {
        if (!this.values_.isMutable()) {
            this.values_ = this.values_.mutableCopy();
        }
        return this.values_;
    }

    private G3 internalGetValues() {
        return this.values_;
    }

    public static Z0 newBuilder() {
        return (Z0) DEFAULT_INSTANCE.createBuilder();
    }

    public static QuotaLimit parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (QuotaLimit) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static QuotaLimit parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (QuotaLimit) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDefaultLimit(long j7) {
        this.defaultLimit_ = j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescription(String str) {
        str.getClass();
        this.description_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescriptionBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.description_ = h6.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayName(String str) {
        str.getClass();
        this.displayName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayNameBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.displayName_ = h6.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDuration(String str) {
        str.getClass();
        this.duration_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDurationBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.duration_ = h6.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFreeTier(long j7) {
        this.freeTier_ = j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxLimit(long j7) {
        this.maxLimit_ = j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetric(String str) {
        str.getClass();
        this.metric_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetricBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.metric_ = h6.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.name_ = h6.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnit(String str) {
        str.getClass();
        this.unit_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnitBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.unit_ = h6.toStringUtf8();
    }

    public boolean containsValues(String str) {
        str.getClass();
        return internalGetValues().containsKey(str);
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (Y0.f3988a[k22.ordinal()]) {
            case 1:
                return new QuotaLimit();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0002\f\n\u0001\u0000\u0000\u0002Ȉ\u0003\u0002\u0004\u0002\u0005Ȉ\u0006Ȉ\u0007\u0002\bȈ\tȈ\n2\fȈ", new Object[]{"description_", "defaultLimit_", "maxLimit_", "duration_", "name_", "freeTier_", "metric_", "unit_", "values_", a1.f3997a, "displayName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (QuotaLimit.class) {
                        try {
                            interfaceC1948l4 = PARSER;
                            if (interfaceC1948l4 == null) {
                                interfaceC1948l4 = new E2(DEFAULT_INSTANCE);
                                PARSER = interfaceC1948l4;
                            }
                        } finally {
                        }
                    }
                }
                return interfaceC1948l4;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public long getDefaultLimit() {
        return this.defaultLimit_;
    }

    public String getDescription() {
        return this.description_;
    }

    public H getDescriptionBytes() {
        return H.copyFromUtf8(this.description_);
    }

    public String getDisplayName() {
        return this.displayName_;
    }

    public H getDisplayNameBytes() {
        return H.copyFromUtf8(this.displayName_);
    }

    public String getDuration() {
        return this.duration_;
    }

    public H getDurationBytes() {
        return H.copyFromUtf8(this.duration_);
    }

    public long getFreeTier() {
        return this.freeTier_;
    }

    public long getMaxLimit() {
        return this.maxLimit_;
    }

    public String getMetric() {
        return this.metric_;
    }

    public H getMetricBytes() {
        return H.copyFromUtf8(this.metric_);
    }

    public String getName() {
        return this.name_;
    }

    public H getNameBytes() {
        return H.copyFromUtf8(this.name_);
    }

    public String getUnit() {
        return this.unit_;
    }

    public H getUnitBytes() {
        return H.copyFromUtf8(this.unit_);
    }

    @Deprecated
    public Map<String, Long> getValues() {
        return getValuesMap();
    }

    public int getValuesCount() {
        return internalGetValues().size();
    }

    public Map<String, Long> getValuesMap() {
        return Collections.unmodifiableMap(internalGetValues());
    }

    public long getValuesOrDefault(String str, long j7) {
        str.getClass();
        G3 internalGetValues = internalGetValues();
        if (internalGetValues.containsKey(str)) {
            return ((Long) internalGetValues.get(str)).longValue();
        }
        return j7;
    }

    public long getValuesOrThrow(String str) {
        str.getClass();
        G3 internalGetValues = internalGetValues();
        if (internalGetValues.containsKey(str)) {
            return ((Long) internalGetValues.get(str)).longValue();
        }
        throw new IllegalArgumentException();
    }

    public static Z0 newBuilder(QuotaLimit quotaLimit) {
        return (Z0) DEFAULT_INSTANCE.createBuilder(quotaLimit);
    }

    public static QuotaLimit parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (QuotaLimit) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static QuotaLimit parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (QuotaLimit) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static QuotaLimit parseFrom(H h6) throws C1912g3 {
        return (QuotaLimit) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public static QuotaLimit parseFrom(H h6, W1 w1) throws C1912g3 {
        return (QuotaLimit) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static QuotaLimit parseFrom(byte[] bArr) throws C1912g3 {
        return (QuotaLimit) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static QuotaLimit parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (QuotaLimit) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static QuotaLimit parseFrom(InputStream inputStream) throws IOException {
        return (QuotaLimit) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static QuotaLimit parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (QuotaLimit) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static QuotaLimit parseFrom(S s5) throws IOException {
        return (QuotaLimit) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static QuotaLimit parseFrom(S s5, W1 w1) throws IOException {
        return (QuotaLimit) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
