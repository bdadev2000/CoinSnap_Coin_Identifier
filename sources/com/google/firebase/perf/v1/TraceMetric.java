package com.google.firebase.perf.v1;

import com.google.protobuf.AbstractC1880c;
import com.google.protobuf.C1912g3;
import com.google.protobuf.D2;
import com.google.protobuf.E2;
import com.google.protobuf.G3;
import com.google.protobuf.H;
import com.google.protobuf.InterfaceC1891d3;
import com.google.protobuf.InterfaceC1948l4;
import com.google.protobuf.K2;
import com.google.protobuf.L2;
import com.google.protobuf.S;
import com.google.protobuf.W1;
import i5.G;
import i5.I;
import i5.J;
import i5.K;
import i5.L;
import i5.M;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class TraceMetric extends L2 implements M {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 4;
    public static final int COUNTERS_FIELD_NUMBER = 6;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 8;
    private static final TraceMetric DEFAULT_INSTANCE;
    public static final int DURATION_US_FIELD_NUMBER = 5;
    public static final int IS_AUTO_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 9;
    public static final int SUBTRACES_FIELD_NUMBER = 7;
    private int bitField0_;
    private long clientStartTimeUs_;
    private long durationUs_;
    private boolean isAuto_;
    private G3 counters_ = G3.emptyMapField();
    private G3 customAttributes_ = G3.emptyMapField();
    private String name_ = "";
    private InterfaceC1891d3 subtraces_ = L2.emptyProtobufList();
    private InterfaceC1891d3 perfSessions_ = L2.emptyProtobufList();

    static {
        TraceMetric traceMetric = new TraceMetric();
        DEFAULT_INSTANCE = traceMetric;
        L2.registerDefaultInstance(TraceMetric.class, traceMetric);
    }

    private TraceMetric() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPerfSessions(Iterable<? extends PerfSession> iterable) {
        ensurePerfSessionsIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.perfSessions_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSubtraces(Iterable<? extends TraceMetric> iterable) {
        ensureSubtracesIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.subtraces_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPerfSessions(PerfSession perfSession) {
        perfSession.getClass();
        ensurePerfSessionsIsMutable();
        this.perfSessions_.add(perfSession);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSubtraces(TraceMetric traceMetric) {
        traceMetric.getClass();
        ensureSubtracesIsMutable();
        this.subtraces_.add(traceMetric);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientStartTimeUs() {
        this.bitField0_ &= -5;
        this.clientStartTimeUs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDurationUs() {
        this.bitField0_ &= -9;
        this.durationUs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsAuto() {
        this.bitField0_ &= -3;
        this.isAuto_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -2;
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPerfSessions() {
        this.perfSessions_ = L2.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubtraces() {
        this.subtraces_ = L2.emptyProtobufList();
    }

    private void ensurePerfSessionsIsMutable() {
        InterfaceC1891d3 interfaceC1891d3 = this.perfSessions_;
        if (!interfaceC1891d3.isModifiable()) {
            this.perfSessions_ = L2.mutableCopy(interfaceC1891d3);
        }
    }

    private void ensureSubtracesIsMutable() {
        InterfaceC1891d3 interfaceC1891d3 = this.subtraces_;
        if (!interfaceC1891d3.isModifiable()) {
            this.subtraces_ = L2.mutableCopy(interfaceC1891d3);
        }
    }

    public static TraceMetric getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Long> getMutableCountersMap() {
        return internalGetMutableCounters();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> getMutableCustomAttributesMap() {
        return internalGetMutableCustomAttributes();
    }

    private G3 internalGetCounters() {
        return this.counters_;
    }

    private G3 internalGetCustomAttributes() {
        return this.customAttributes_;
    }

    private G3 internalGetMutableCounters() {
        if (!this.counters_.isMutable()) {
            this.counters_ = this.counters_.mutableCopy();
        }
        return this.counters_;
    }

    private G3 internalGetMutableCustomAttributes() {
        if (!this.customAttributes_.isMutable()) {
            this.customAttributes_ = this.customAttributes_.mutableCopy();
        }
        return this.customAttributes_;
    }

    public static J newBuilder() {
        return (J) DEFAULT_INSTANCE.createBuilder();
    }

    public static TraceMetric parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TraceMetric) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TraceMetric parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (TraceMetric) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removePerfSessions(int i9) {
        ensurePerfSessionsIsMutable();
        this.perfSessions_.remove(i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeSubtraces(int i9) {
        ensureSubtracesIsMutable();
        this.subtraces_.remove(i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientStartTimeUs(long j7) {
        this.bitField0_ |= 4;
        this.clientStartTimeUs_ = j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDurationUs(long j7) {
        this.bitField0_ |= 8;
        this.durationUs_ = j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsAuto(boolean z8) {
        this.bitField0_ |= 2;
        this.isAuto_ = z8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(H h6) {
        this.name_ = h6.toStringUtf8();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPerfSessions(int i9, PerfSession perfSession) {
        perfSession.getClass();
        ensurePerfSessionsIsMutable();
        this.perfSessions_.set(i9, perfSession);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubtraces(int i9, TraceMetric traceMetric) {
        traceMetric.getClass();
        ensureSubtracesIsMutable();
        this.subtraces_.set(i9, traceMetric);
    }

    public boolean containsCounters(String str) {
        str.getClass();
        return internalGetCounters().containsKey(str);
    }

    public boolean containsCustomAttributes(String str) {
        str.getClass();
        return internalGetCustomAttributes().containsKey(str);
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (I.f20663a[k22.ordinal()]) {
            case 1:
                return new TraceMetric();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\t\b\u0002\u0002\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0004ဂ\u0002\u0005ဂ\u0003\u00062\u0007\u001b\b2\t\u001b", new Object[]{"bitField0_", "name_", "isAuto_", "clientStartTimeUs_", "durationUs_", "counters_", K.f20664a, "subtraces_", TraceMetric.class, "customAttributes_", L.f20665a, "perfSessions_", PerfSession.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (TraceMetric.class) {
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

    public long getClientStartTimeUs() {
        return this.clientStartTimeUs_;
    }

    @Deprecated
    public Map<String, Long> getCounters() {
        return getCountersMap();
    }

    public int getCountersCount() {
        return internalGetCounters().size();
    }

    public Map<String, Long> getCountersMap() {
        return Collections.unmodifiableMap(internalGetCounters());
    }

    public long getCountersOrDefault(String str, long j7) {
        str.getClass();
        G3 internalGetCounters = internalGetCounters();
        if (internalGetCounters.containsKey(str)) {
            return ((Long) internalGetCounters.get(str)).longValue();
        }
        return j7;
    }

    public long getCountersOrThrow(String str) {
        str.getClass();
        G3 internalGetCounters = internalGetCounters();
        if (internalGetCounters.containsKey(str)) {
            return ((Long) internalGetCounters.get(str)).longValue();
        }
        throw new IllegalArgumentException();
    }

    @Deprecated
    public Map<String, String> getCustomAttributes() {
        return getCustomAttributesMap();
    }

    public int getCustomAttributesCount() {
        return internalGetCustomAttributes().size();
    }

    public Map<String, String> getCustomAttributesMap() {
        return Collections.unmodifiableMap(internalGetCustomAttributes());
    }

    public String getCustomAttributesOrDefault(String str, String str2) {
        str.getClass();
        G3 internalGetCustomAttributes = internalGetCustomAttributes();
        if (internalGetCustomAttributes.containsKey(str)) {
            return (String) internalGetCustomAttributes.get(str);
        }
        return str2;
    }

    public String getCustomAttributesOrThrow(String str) {
        str.getClass();
        G3 internalGetCustomAttributes = internalGetCustomAttributes();
        if (internalGetCustomAttributes.containsKey(str)) {
            return (String) internalGetCustomAttributes.get(str);
        }
        throw new IllegalArgumentException();
    }

    public long getDurationUs() {
        return this.durationUs_;
    }

    public boolean getIsAuto() {
        return this.isAuto_;
    }

    public String getName() {
        return this.name_;
    }

    public H getNameBytes() {
        return H.copyFromUtf8(this.name_);
    }

    public PerfSession getPerfSessions(int i9) {
        return (PerfSession) this.perfSessions_.get(i9);
    }

    public int getPerfSessionsCount() {
        return this.perfSessions_.size();
    }

    public List<PerfSession> getPerfSessionsList() {
        return this.perfSessions_;
    }

    public G getPerfSessionsOrBuilder(int i9) {
        return (G) this.perfSessions_.get(i9);
    }

    public List<? extends G> getPerfSessionsOrBuilderList() {
        return this.perfSessions_;
    }

    public TraceMetric getSubtraces(int i9) {
        return (TraceMetric) this.subtraces_.get(i9);
    }

    public int getSubtracesCount() {
        return this.subtraces_.size();
    }

    public List<TraceMetric> getSubtracesList() {
        return this.subtraces_;
    }

    public M getSubtracesOrBuilder(int i9) {
        return (M) this.subtraces_.get(i9);
    }

    public List<? extends M> getSubtracesOrBuilderList() {
        return this.subtraces_;
    }

    public boolean hasClientStartTimeUs() {
        if ((this.bitField0_ & 4) != 0) {
            return true;
        }
        return false;
    }

    public boolean hasDurationUs() {
        if ((this.bitField0_ & 8) != 0) {
            return true;
        }
        return false;
    }

    public boolean hasIsAuto() {
        if ((this.bitField0_ & 2) != 0) {
            return true;
        }
        return false;
    }

    public boolean hasName() {
        if ((this.bitField0_ & 1) != 0) {
            return true;
        }
        return false;
    }

    public static J newBuilder(TraceMetric traceMetric) {
        return (J) DEFAULT_INSTANCE.createBuilder(traceMetric);
    }

    public static TraceMetric parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (TraceMetric) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static TraceMetric parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (TraceMetric) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static TraceMetric parseFrom(H h6) throws C1912g3 {
        return (TraceMetric) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPerfSessions(int i9, PerfSession perfSession) {
        perfSession.getClass();
        ensurePerfSessionsIsMutable();
        this.perfSessions_.add(i9, perfSession);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSubtraces(int i9, TraceMetric traceMetric) {
        traceMetric.getClass();
        ensureSubtracesIsMutable();
        this.subtraces_.add(i9, traceMetric);
    }

    public static TraceMetric parseFrom(H h6, W1 w1) throws C1912g3 {
        return (TraceMetric) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static TraceMetric parseFrom(byte[] bArr) throws C1912g3 {
        return (TraceMetric) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TraceMetric parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (TraceMetric) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static TraceMetric parseFrom(InputStream inputStream) throws IOException {
        return (TraceMetric) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TraceMetric parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (TraceMetric) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static TraceMetric parseFrom(S s5) throws IOException {
        return (TraceMetric) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static TraceMetric parseFrom(S s5, W1 w1) throws IOException {
        return (TraceMetric) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
