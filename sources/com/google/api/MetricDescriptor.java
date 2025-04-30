package com.google.api;

import a4.AbstractC0384t0;
import a4.EnumC0367k0;
import a4.EnumC0386u0;
import a4.EnumC0388v0;
import a4.InterfaceC0365j0;
import com.google.protobuf.AbstractC1880c;
import com.google.protobuf.C1912g3;
import com.google.protobuf.D2;
import com.google.protobuf.Duration;
import com.google.protobuf.E2;
import com.google.protobuf.H;
import com.google.protobuf.H1;
import com.google.protobuf.InterfaceC1891d3;
import com.google.protobuf.InterfaceC1948l4;
import com.google.protobuf.K2;
import com.google.protobuf.L2;
import com.google.protobuf.O3;
import com.google.protobuf.S;
import com.google.protobuf.W1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes2.dex */
public final class MetricDescriptor extends L2 implements o {
    private static final MetricDescriptor DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 6;
    public static final int DISPLAY_NAME_FIELD_NUMBER = 7;
    public static final int LABELS_FIELD_NUMBER = 2;
    public static final int LAUNCH_STAGE_FIELD_NUMBER = 12;
    public static final int METADATA_FIELD_NUMBER = 10;
    public static final int METRIC_KIND_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 8;
    public static final int UNIT_FIELD_NUMBER = 5;
    public static final int VALUE_TYPE_FIELD_NUMBER = 4;
    private int launchStage_;
    private MetricDescriptorMetadata metadata_;
    private int metricKind_;
    private int valueType_;
    private String name_ = "";
    private String type_ = "";
    private InterfaceC1891d3 labels_ = L2.emptyProtobufList();
    private String unit_ = "";
    private String description_ = "";
    private String displayName_ = "";

    /* loaded from: classes2.dex */
    public static final class MetricDescriptorMetadata extends L2 implements O3 {
        private static final MetricDescriptorMetadata DEFAULT_INSTANCE;
        public static final int INGEST_DELAY_FIELD_NUMBER = 3;
        public static final int LAUNCH_STAGE_FIELD_NUMBER = 1;
        private static volatile InterfaceC1948l4 PARSER = null;
        public static final int SAMPLE_PERIOD_FIELD_NUMBER = 2;
        private Duration ingestDelay_;
        private int launchStage_;
        private Duration samplePeriod_;

        static {
            MetricDescriptorMetadata metricDescriptorMetadata = new MetricDescriptorMetadata();
            DEFAULT_INSTANCE = metricDescriptorMetadata;
            L2.registerDefaultInstance(MetricDescriptorMetadata.class, metricDescriptorMetadata);
        }

        private MetricDescriptorMetadata() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIngestDelay() {
            this.ingestDelay_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLaunchStage() {
            this.launchStage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSamplePeriod() {
            this.samplePeriod_ = null;
        }

        public static MetricDescriptorMetadata getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeIngestDelay(Duration duration) {
            duration.getClass();
            Duration duration2 = this.ingestDelay_;
            if (duration2 != null && duration2 != Duration.getDefaultInstance()) {
                this.ingestDelay_ = (Duration) ((H1) Duration.newBuilder(this.ingestDelay_).mergeFrom((L2) duration)).buildPartial();
            } else {
                this.ingestDelay_ = duration;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeSamplePeriod(Duration duration) {
            duration.getClass();
            Duration duration2 = this.samplePeriod_;
            if (duration2 != null && duration2 != Duration.getDefaultInstance()) {
                this.samplePeriod_ = (Duration) ((H1) Duration.newBuilder(this.samplePeriod_).mergeFrom((L2) duration)).buildPartial();
            } else {
                this.samplePeriod_ = duration;
            }
        }

        public static n newBuilder() {
            return (n) DEFAULT_INSTANCE.createBuilder();
        }

        public static MetricDescriptorMetadata parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MetricDescriptorMetadata) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MetricDescriptorMetadata parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
            return (MetricDescriptorMetadata) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static InterfaceC1948l4 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIngestDelay(Duration duration) {
            duration.getClass();
            this.ingestDelay_ = duration;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLaunchStage(EnumC0367k0 enumC0367k0) {
            this.launchStage_ = enumC0367k0.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLaunchStageValue(int i9) {
            this.launchStage_ = i9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSamplePeriod(Duration duration) {
            duration.getClass();
            this.samplePeriod_ = duration;
        }

        @Override // com.google.protobuf.L2
        public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
            switch (AbstractC0384t0.f4046a[k22.ordinal()]) {
                case 1:
                    return new MetricDescriptorMetadata();
                case 2:
                    return new D2(DEFAULT_INSTANCE);
                case 3:
                    return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\t\u0003\t", new Object[]{"launchStage_", "samplePeriod_", "ingestDelay_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    InterfaceC1948l4 interfaceC1948l4 = PARSER;
                    if (interfaceC1948l4 == null) {
                        synchronized (MetricDescriptorMetadata.class) {
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

        public Duration getIngestDelay() {
            Duration duration = this.ingestDelay_;
            if (duration == null) {
                return Duration.getDefaultInstance();
            }
            return duration;
        }

        @Deprecated
        public EnumC0367k0 getLaunchStage() {
            EnumC0367k0 a6 = EnumC0367k0.a(this.launchStage_);
            if (a6 == null) {
                return EnumC0367k0.UNRECOGNIZED;
            }
            return a6;
        }

        @Deprecated
        public int getLaunchStageValue() {
            return this.launchStage_;
        }

        public Duration getSamplePeriod() {
            Duration duration = this.samplePeriod_;
            if (duration == null) {
                return Duration.getDefaultInstance();
            }
            return duration;
        }

        public boolean hasIngestDelay() {
            if (this.ingestDelay_ != null) {
                return true;
            }
            return false;
        }

        public boolean hasSamplePeriod() {
            if (this.samplePeriod_ != null) {
                return true;
            }
            return false;
        }

        public static n newBuilder(MetricDescriptorMetadata metricDescriptorMetadata) {
            return (n) DEFAULT_INSTANCE.createBuilder(metricDescriptorMetadata);
        }

        public static MetricDescriptorMetadata parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
            return (MetricDescriptorMetadata) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
        }

        public static MetricDescriptorMetadata parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
            return (MetricDescriptorMetadata) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
        }

        public static MetricDescriptorMetadata parseFrom(H h6) throws C1912g3 {
            return (MetricDescriptorMetadata) L2.parseFrom(DEFAULT_INSTANCE, h6);
        }

        public static MetricDescriptorMetadata parseFrom(H h6, W1 w1) throws C1912g3 {
            return (MetricDescriptorMetadata) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
        }

        public static MetricDescriptorMetadata parseFrom(byte[] bArr) throws C1912g3 {
            return (MetricDescriptorMetadata) L2.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MetricDescriptorMetadata parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
            return (MetricDescriptorMetadata) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
        }

        public static MetricDescriptorMetadata parseFrom(InputStream inputStream) throws IOException {
            return (MetricDescriptorMetadata) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MetricDescriptorMetadata parseFrom(InputStream inputStream, W1 w1) throws IOException {
            return (MetricDescriptorMetadata) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
        }

        public static MetricDescriptorMetadata parseFrom(S s5) throws IOException {
            return (MetricDescriptorMetadata) L2.parseFrom(DEFAULT_INSTANCE, s5);
        }

        public static MetricDescriptorMetadata parseFrom(S s5, W1 w1) throws IOException {
            return (MetricDescriptorMetadata) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
        }
    }

    static {
        MetricDescriptor metricDescriptor = new MetricDescriptor();
        DEFAULT_INSTANCE = metricDescriptor;
        L2.registerDefaultInstance(MetricDescriptor.class, metricDescriptor);
    }

    private MetricDescriptor() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLabels(Iterable<? extends LabelDescriptor> iterable) {
        ensureLabelsIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.labels_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLabels(LabelDescriptor labelDescriptor) {
        labelDescriptor.getClass();
        ensureLabelsIsMutable();
        this.labels_.add(labelDescriptor);
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
    public void clearLabels() {
        this.labels_ = L2.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLaunchStage() {
        this.launchStage_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMetadata() {
        this.metadata_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMetricKind() {
        this.metricKind_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = getDefaultInstance().getType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUnit() {
        this.unit_ = getDefaultInstance().getUnit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValueType() {
        this.valueType_ = 0;
    }

    private void ensureLabelsIsMutable() {
        InterfaceC1891d3 interfaceC1891d3 = this.labels_;
        if (!interfaceC1891d3.isModifiable()) {
            this.labels_ = L2.mutableCopy(interfaceC1891d3);
        }
    }

    public static MetricDescriptor getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMetadata(MetricDescriptorMetadata metricDescriptorMetadata) {
        metricDescriptorMetadata.getClass();
        MetricDescriptorMetadata metricDescriptorMetadata2 = this.metadata_;
        if (metricDescriptorMetadata2 != null && metricDescriptorMetadata2 != MetricDescriptorMetadata.getDefaultInstance()) {
            this.metadata_ = (MetricDescriptorMetadata) ((n) MetricDescriptorMetadata.newBuilder(this.metadata_).mergeFrom((L2) metricDescriptorMetadata)).buildPartial();
        } else {
            this.metadata_ = metricDescriptorMetadata;
        }
    }

    public static m newBuilder() {
        return (m) DEFAULT_INSTANCE.createBuilder();
    }

    public static MetricDescriptor parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MetricDescriptor) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MetricDescriptor parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (MetricDescriptor) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeLabels(int i9) {
        ensureLabelsIsMutable();
        this.labels_.remove(i9);
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
    public void setLabels(int i9, LabelDescriptor labelDescriptor) {
        labelDescriptor.getClass();
        ensureLabelsIsMutable();
        this.labels_.set(i9, labelDescriptor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLaunchStage(EnumC0367k0 enumC0367k0) {
        this.launchStage_ = enumC0367k0.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLaunchStageValue(int i9) {
        this.launchStage_ = i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetadata(MetricDescriptorMetadata metricDescriptorMetadata) {
        metricDescriptorMetadata.getClass();
        this.metadata_ = metricDescriptorMetadata;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetricKind(EnumC0386u0 enumC0386u0) {
        this.metricKind_ = enumC0386u0.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetricKindValue(int i9) {
        this.metricKind_ = i9;
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
    public void setType(String str) {
        str.getClass();
        this.type_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.type_ = h6.toStringUtf8();
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setValueType(EnumC0388v0 enumC0388v0) {
        this.valueType_ = enumC0388v0.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValueTypeValue(int i9) {
        this.valueType_ = i9;
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (AbstractC0384t0.f4046a[k22.ordinal()]) {
            case 1:
                return new MetricDescriptor();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\f\n\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003\f\u0004\f\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\n\t\f\f", new Object[]{"name_", "labels_", LabelDescriptor.class, "metricKind_", "valueType_", "unit_", "description_", "displayName_", "type_", "metadata_", "launchStage_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (MetricDescriptor.class) {
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

    public LabelDescriptor getLabels(int i9) {
        return (LabelDescriptor) this.labels_.get(i9);
    }

    public int getLabelsCount() {
        return this.labels_.size();
    }

    public List<LabelDescriptor> getLabelsList() {
        return this.labels_;
    }

    public InterfaceC0365j0 getLabelsOrBuilder(int i9) {
        return (InterfaceC0365j0) this.labels_.get(i9);
    }

    public List<? extends InterfaceC0365j0> getLabelsOrBuilderList() {
        return this.labels_;
    }

    public EnumC0367k0 getLaunchStage() {
        EnumC0367k0 a6 = EnumC0367k0.a(this.launchStage_);
        if (a6 == null) {
            return EnumC0367k0.UNRECOGNIZED;
        }
        return a6;
    }

    public int getLaunchStageValue() {
        return this.launchStage_;
    }

    public MetricDescriptorMetadata getMetadata() {
        MetricDescriptorMetadata metricDescriptorMetadata = this.metadata_;
        if (metricDescriptorMetadata == null) {
            return MetricDescriptorMetadata.getDefaultInstance();
        }
        return metricDescriptorMetadata;
    }

    public EnumC0386u0 getMetricKind() {
        EnumC0386u0 enumC0386u0;
        int i9 = this.metricKind_;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        enumC0386u0 = null;
                    } else {
                        enumC0386u0 = EnumC0386u0.CUMULATIVE;
                    }
                } else {
                    enumC0386u0 = EnumC0386u0.DELTA;
                }
            } else {
                enumC0386u0 = EnumC0386u0.GAUGE;
            }
        } else {
            enumC0386u0 = EnumC0386u0.METRIC_KIND_UNSPECIFIED;
        }
        if (enumC0386u0 == null) {
            return EnumC0386u0.UNRECOGNIZED;
        }
        return enumC0386u0;
    }

    public int getMetricKindValue() {
        return this.metricKind_;
    }

    public String getName() {
        return this.name_;
    }

    public H getNameBytes() {
        return H.copyFromUtf8(this.name_);
    }

    public String getType() {
        return this.type_;
    }

    public H getTypeBytes() {
        return H.copyFromUtf8(this.type_);
    }

    public String getUnit() {
        return this.unit_;
    }

    public H getUnitBytes() {
        return H.copyFromUtf8(this.unit_);
    }

    public EnumC0388v0 getValueType() {
        EnumC0388v0 enumC0388v0;
        switch (this.valueType_) {
            case 0:
                enumC0388v0 = EnumC0388v0.VALUE_TYPE_UNSPECIFIED;
                break;
            case 1:
                enumC0388v0 = EnumC0388v0.BOOL;
                break;
            case 2:
                enumC0388v0 = EnumC0388v0.INT64;
                break;
            case 3:
                enumC0388v0 = EnumC0388v0.DOUBLE;
                break;
            case 4:
                enumC0388v0 = EnumC0388v0.STRING;
                break;
            case 5:
                enumC0388v0 = EnumC0388v0.DISTRIBUTION;
                break;
            case 6:
                enumC0388v0 = EnumC0388v0.MONEY;
                break;
            default:
                enumC0388v0 = null;
                break;
        }
        if (enumC0388v0 == null) {
            return EnumC0388v0.UNRECOGNIZED;
        }
        return enumC0388v0;
    }

    public int getValueTypeValue() {
        return this.valueType_;
    }

    public boolean hasMetadata() {
        if (this.metadata_ != null) {
            return true;
        }
        return false;
    }

    public static m newBuilder(MetricDescriptor metricDescriptor) {
        return (m) DEFAULT_INSTANCE.createBuilder(metricDescriptor);
    }

    public static MetricDescriptor parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (MetricDescriptor) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static MetricDescriptor parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (MetricDescriptor) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static MetricDescriptor parseFrom(H h6) throws C1912g3 {
        return (MetricDescriptor) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLabels(int i9, LabelDescriptor labelDescriptor) {
        labelDescriptor.getClass();
        ensureLabelsIsMutable();
        this.labels_.add(i9, labelDescriptor);
    }

    public static MetricDescriptor parseFrom(H h6, W1 w1) throws C1912g3 {
        return (MetricDescriptor) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static MetricDescriptor parseFrom(byte[] bArr) throws C1912g3 {
        return (MetricDescriptor) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MetricDescriptor parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (MetricDescriptor) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static MetricDescriptor parseFrom(InputStream inputStream) throws IOException {
        return (MetricDescriptor) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MetricDescriptor parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (MetricDescriptor) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static MetricDescriptor parseFrom(S s5) throws IOException {
        return (MetricDescriptor) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static MetricDescriptor parseFrom(S s5, W1 w1) throws IOException {
        return (MetricDescriptor) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
