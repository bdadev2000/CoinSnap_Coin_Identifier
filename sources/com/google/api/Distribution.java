package com.google.api;

import a4.J;
import a4.K;
import com.google.protobuf.AbstractC1880c;
import com.google.protobuf.AbstractC1894e;
import com.google.protobuf.Any;
import com.google.protobuf.C1;
import com.google.protobuf.C1907f5;
import com.google.protobuf.C1912g3;
import com.google.protobuf.C2044z3;
import com.google.protobuf.D2;
import com.google.protobuf.E2;
import com.google.protobuf.H;
import com.google.protobuf.InterfaceC1884c3;
import com.google.protobuf.InterfaceC1891d3;
import com.google.protobuf.InterfaceC1922i;
import com.google.protobuf.InterfaceC1948l4;
import com.google.protobuf.K2;
import com.google.protobuf.L2;
import com.google.protobuf.O3;
import com.google.protobuf.S;
import com.google.protobuf.Timestamp;
import com.google.protobuf.U2;
import com.google.protobuf.W1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes2.dex */
public final class Distribution extends L2 implements O3 {
    public static final int BUCKET_COUNTS_FIELD_NUMBER = 7;
    public static final int BUCKET_OPTIONS_FIELD_NUMBER = 6;
    public static final int COUNT_FIELD_NUMBER = 1;
    private static final Distribution DEFAULT_INSTANCE;
    public static final int EXEMPLARS_FIELD_NUMBER = 10;
    public static final int MEAN_FIELD_NUMBER = 2;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int RANGE_FIELD_NUMBER = 4;
    public static final int SUM_OF_SQUARED_DEVIATION_FIELD_NUMBER = 3;
    private BucketOptions bucketOptions_;
    private long count_;
    private double mean_;
    private Range range_;
    private double sumOfSquaredDeviation_;
    private int bucketCountsMemoizedSerializedSize = -1;
    private InterfaceC1884c3 bucketCounts_ = L2.emptyLongList();
    private InterfaceC1891d3 exemplars_ = L2.emptyProtobufList();

    /* loaded from: classes2.dex */
    public static final class BucketOptions extends L2 implements O3 {
        private static final BucketOptions DEFAULT_INSTANCE;
        public static final int EXPLICIT_BUCKETS_FIELD_NUMBER = 3;
        public static final int EXPONENTIAL_BUCKETS_FIELD_NUMBER = 2;
        public static final int LINEAR_BUCKETS_FIELD_NUMBER = 1;
        private static volatile InterfaceC1948l4 PARSER;
        private int optionsCase_ = 0;
        private Object options_;

        /* loaded from: classes2.dex */
        public static final class Explicit extends L2 implements O3 {
            public static final int BOUNDS_FIELD_NUMBER = 1;
            private static final Explicit DEFAULT_INSTANCE;
            private static volatile InterfaceC1948l4 PARSER;
            private int boundsMemoizedSerializedSize = -1;
            private U2 bounds_ = L2.emptyDoubleList();

            static {
                Explicit explicit = new Explicit();
                DEFAULT_INSTANCE = explicit;
                L2.registerDefaultInstance(Explicit.class, explicit);
            }

            private Explicit() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addAllBounds(Iterable<? extends Double> iterable) {
                ensureBoundsIsMutable();
                AbstractC1880c.addAll((Iterable) iterable, (List) this.bounds_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addBounds(double d2) {
                ensureBoundsIsMutable();
                ((C1) this.bounds_).addDouble(d2);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearBounds() {
                this.bounds_ = L2.emptyDoubleList();
            }

            /* JADX WARN: Multi-variable type inference failed */
            private void ensureBoundsIsMutable() {
                U2 u22 = this.bounds_;
                if (!((AbstractC1894e) u22).isModifiable()) {
                    this.bounds_ = L2.mutableCopy(u22);
                }
            }

            public static Explicit getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static d newBuilder() {
                return (d) DEFAULT_INSTANCE.createBuilder();
            }

            public static Explicit parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Explicit) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Explicit parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
                return (Explicit) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static InterfaceC1948l4 parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setBounds(int i9, double d2) {
                ensureBoundsIsMutable();
                ((C1) this.bounds_).setDouble(i9, d2);
            }

            @Override // com.google.protobuf.L2
            public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
                switch (J.f3968a[k22.ordinal()]) {
                    case 1:
                        return new Explicit();
                    case 2:
                        return new D2(DEFAULT_INSTANCE);
                    case 3:
                        return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001#", new Object[]{"bounds_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        InterfaceC1948l4 interfaceC1948l4 = PARSER;
                        if (interfaceC1948l4 == null) {
                            synchronized (Explicit.class) {
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

            public double getBounds(int i9) {
                return ((C1) this.bounds_).getDouble(i9);
            }

            public int getBoundsCount() {
                return this.bounds_.size();
            }

            public List<Double> getBoundsList() {
                return this.bounds_;
            }

            public static d newBuilder(Explicit explicit) {
                return (d) DEFAULT_INSTANCE.createBuilder(explicit);
            }

            public static Explicit parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
                return (Explicit) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
            }

            public static Explicit parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
                return (Explicit) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
            }

            public static Explicit parseFrom(H h6) throws C1912g3 {
                return (Explicit) L2.parseFrom(DEFAULT_INSTANCE, h6);
            }

            public static Explicit parseFrom(H h6, W1 w1) throws C1912g3 {
                return (Explicit) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
            }

            public static Explicit parseFrom(byte[] bArr) throws C1912g3 {
                return (Explicit) L2.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Explicit parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
                return (Explicit) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
            }

            public static Explicit parseFrom(InputStream inputStream) throws IOException {
                return (Explicit) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Explicit parseFrom(InputStream inputStream, W1 w1) throws IOException {
                return (Explicit) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
            }

            public static Explicit parseFrom(S s5) throws IOException {
                return (Explicit) L2.parseFrom(DEFAULT_INSTANCE, s5);
            }

            public static Explicit parseFrom(S s5, W1 w1) throws IOException {
                return (Explicit) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
            }
        }

        /* loaded from: classes2.dex */
        public static final class Exponential extends L2 implements O3 {
            private static final Exponential DEFAULT_INSTANCE;
            public static final int GROWTH_FACTOR_FIELD_NUMBER = 2;
            public static final int NUM_FINITE_BUCKETS_FIELD_NUMBER = 1;
            private static volatile InterfaceC1948l4 PARSER = null;
            public static final int SCALE_FIELD_NUMBER = 3;
            private double growthFactor_;
            private int numFiniteBuckets_;
            private double scale_;

            static {
                Exponential exponential = new Exponential();
                DEFAULT_INSTANCE = exponential;
                L2.registerDefaultInstance(Exponential.class, exponential);
            }

            private Exponential() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearGrowthFactor() {
                this.growthFactor_ = 0.0d;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearNumFiniteBuckets() {
                this.numFiniteBuckets_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearScale() {
                this.scale_ = 0.0d;
            }

            public static Exponential getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static e newBuilder() {
                return (e) DEFAULT_INSTANCE.createBuilder();
            }

            public static Exponential parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Exponential) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Exponential parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
                return (Exponential) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static InterfaceC1948l4 parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setGrowthFactor(double d2) {
                this.growthFactor_ = d2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setNumFiniteBuckets(int i9) {
                this.numFiniteBuckets_ = i9;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setScale(double d2) {
                this.scale_ = d2;
            }

            @Override // com.google.protobuf.L2
            public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
                switch (J.f3968a[k22.ordinal()]) {
                    case 1:
                        return new Exponential();
                    case 2:
                        return new D2(DEFAULT_INSTANCE);
                    case 3:
                        return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0000\u0003\u0000", new Object[]{"numFiniteBuckets_", "growthFactor_", "scale_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        InterfaceC1948l4 interfaceC1948l4 = PARSER;
                        if (interfaceC1948l4 == null) {
                            synchronized (Exponential.class) {
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

            public double getGrowthFactor() {
                return this.growthFactor_;
            }

            public int getNumFiniteBuckets() {
                return this.numFiniteBuckets_;
            }

            public double getScale() {
                return this.scale_;
            }

            public static e newBuilder(Exponential exponential) {
                return (e) DEFAULT_INSTANCE.createBuilder(exponential);
            }

            public static Exponential parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
                return (Exponential) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
            }

            public static Exponential parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
                return (Exponential) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
            }

            public static Exponential parseFrom(H h6) throws C1912g3 {
                return (Exponential) L2.parseFrom(DEFAULT_INSTANCE, h6);
            }

            public static Exponential parseFrom(H h6, W1 w1) throws C1912g3 {
                return (Exponential) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
            }

            public static Exponential parseFrom(byte[] bArr) throws C1912g3 {
                return (Exponential) L2.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Exponential parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
                return (Exponential) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
            }

            public static Exponential parseFrom(InputStream inputStream) throws IOException {
                return (Exponential) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Exponential parseFrom(InputStream inputStream, W1 w1) throws IOException {
                return (Exponential) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
            }

            public static Exponential parseFrom(S s5) throws IOException {
                return (Exponential) L2.parseFrom(DEFAULT_INSTANCE, s5);
            }

            public static Exponential parseFrom(S s5, W1 w1) throws IOException {
                return (Exponential) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
            }
        }

        /* loaded from: classes2.dex */
        public static final class Linear extends L2 implements O3 {
            private static final Linear DEFAULT_INSTANCE;
            public static final int NUM_FINITE_BUCKETS_FIELD_NUMBER = 1;
            public static final int OFFSET_FIELD_NUMBER = 3;
            private static volatile InterfaceC1948l4 PARSER = null;
            public static final int WIDTH_FIELD_NUMBER = 2;
            private int numFiniteBuckets_;
            private double offset_;
            private double width_;

            static {
                Linear linear = new Linear();
                DEFAULT_INSTANCE = linear;
                L2.registerDefaultInstance(Linear.class, linear);
            }

            private Linear() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearNumFiniteBuckets() {
                this.numFiniteBuckets_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearOffset() {
                this.offset_ = 0.0d;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearWidth() {
                this.width_ = 0.0d;
            }

            public static Linear getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static f newBuilder() {
                return (f) DEFAULT_INSTANCE.createBuilder();
            }

            public static Linear parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Linear) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Linear parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
                return (Linear) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static InterfaceC1948l4 parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setNumFiniteBuckets(int i9) {
                this.numFiniteBuckets_ = i9;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setOffset(double d2) {
                this.offset_ = d2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setWidth(double d2) {
                this.width_ = d2;
            }

            @Override // com.google.protobuf.L2
            public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
                switch (J.f3968a[k22.ordinal()]) {
                    case 1:
                        return new Linear();
                    case 2:
                        return new D2(DEFAULT_INSTANCE);
                    case 3:
                        return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0000\u0003\u0000", new Object[]{"numFiniteBuckets_", "width_", "offset_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        InterfaceC1948l4 interfaceC1948l4 = PARSER;
                        if (interfaceC1948l4 == null) {
                            synchronized (Linear.class) {
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

            public int getNumFiniteBuckets() {
                return this.numFiniteBuckets_;
            }

            public double getOffset() {
                return this.offset_;
            }

            public double getWidth() {
                return this.width_;
            }

            public static f newBuilder(Linear linear) {
                return (f) DEFAULT_INSTANCE.createBuilder(linear);
            }

            public static Linear parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
                return (Linear) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
            }

            public static Linear parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
                return (Linear) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
            }

            public static Linear parseFrom(H h6) throws C1912g3 {
                return (Linear) L2.parseFrom(DEFAULT_INSTANCE, h6);
            }

            public static Linear parseFrom(H h6, W1 w1) throws C1912g3 {
                return (Linear) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
            }

            public static Linear parseFrom(byte[] bArr) throws C1912g3 {
                return (Linear) L2.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Linear parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
                return (Linear) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
            }

            public static Linear parseFrom(InputStream inputStream) throws IOException {
                return (Linear) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Linear parseFrom(InputStream inputStream, W1 w1) throws IOException {
                return (Linear) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
            }

            public static Linear parseFrom(S s5) throws IOException {
                return (Linear) L2.parseFrom(DEFAULT_INSTANCE, s5);
            }

            public static Linear parseFrom(S s5, W1 w1) throws IOException {
                return (Linear) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
            }
        }

        static {
            BucketOptions bucketOptions = new BucketOptions();
            DEFAULT_INSTANCE = bucketOptions;
            L2.registerDefaultInstance(BucketOptions.class, bucketOptions);
        }

        private BucketOptions() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearExplicitBuckets() {
            if (this.optionsCase_ == 3) {
                this.optionsCase_ = 0;
                this.options_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearExponentialBuckets() {
            if (this.optionsCase_ == 2) {
                this.optionsCase_ = 0;
                this.options_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLinearBuckets() {
            if (this.optionsCase_ == 1) {
                this.optionsCase_ = 0;
                this.options_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOptions() {
            this.optionsCase_ = 0;
            this.options_ = null;
        }

        public static BucketOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeExplicitBuckets(Explicit explicit) {
            explicit.getClass();
            if (this.optionsCase_ == 3 && this.options_ != Explicit.getDefaultInstance()) {
                this.options_ = ((d) Explicit.newBuilder((Explicit) this.options_).mergeFrom((L2) explicit)).buildPartial();
            } else {
                this.options_ = explicit;
            }
            this.optionsCase_ = 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeExponentialBuckets(Exponential exponential) {
            exponential.getClass();
            if (this.optionsCase_ == 2 && this.options_ != Exponential.getDefaultInstance()) {
                this.options_ = ((e) Exponential.newBuilder((Exponential) this.options_).mergeFrom((L2) exponential)).buildPartial();
            } else {
                this.options_ = exponential;
            }
            this.optionsCase_ = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeLinearBuckets(Linear linear) {
            linear.getClass();
            if (this.optionsCase_ == 1 && this.options_ != Linear.getDefaultInstance()) {
                this.options_ = ((f) Linear.newBuilder((Linear) this.options_).mergeFrom((L2) linear)).buildPartial();
            } else {
                this.options_ = linear;
            }
            this.optionsCase_ = 1;
        }

        public static c newBuilder() {
            return (c) DEFAULT_INSTANCE.createBuilder();
        }

        public static BucketOptions parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (BucketOptions) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BucketOptions parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
            return (BucketOptions) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static InterfaceC1948l4 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExplicitBuckets(Explicit explicit) {
            explicit.getClass();
            this.options_ = explicit;
            this.optionsCase_ = 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExponentialBuckets(Exponential exponential) {
            exponential.getClass();
            this.options_ = exponential;
            this.optionsCase_ = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLinearBuckets(Linear linear) {
            linear.getClass();
            this.options_ = linear;
            this.optionsCase_ = 1;
        }

        @Override // com.google.protobuf.L2
        public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
            switch (J.f3968a[k22.ordinal()]) {
                case 1:
                    return new BucketOptions();
                case 2:
                    return new D2(DEFAULT_INSTANCE);
                case 3:
                    return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"options_", "optionsCase_", Linear.class, Exponential.class, Explicit.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    InterfaceC1948l4 interfaceC1948l4 = PARSER;
                    if (interfaceC1948l4 == null) {
                        synchronized (BucketOptions.class) {
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

        public Explicit getExplicitBuckets() {
            if (this.optionsCase_ == 3) {
                return (Explicit) this.options_;
            }
            return Explicit.getDefaultInstance();
        }

        public Exponential getExponentialBuckets() {
            if (this.optionsCase_ == 2) {
                return (Exponential) this.options_;
            }
            return Exponential.getDefaultInstance();
        }

        public Linear getLinearBuckets() {
            if (this.optionsCase_ == 1) {
                return (Linear) this.options_;
            }
            return Linear.getDefaultInstance();
        }

        public g getOptionsCase() {
            int i9 = this.optionsCase_;
            if (i9 != 0) {
                if (i9 != 1) {
                    if (i9 != 2) {
                        if (i9 != 3) {
                            return null;
                        }
                        return g.f14247d;
                    }
                    return g.f14246c;
                }
                return g.b;
            }
            return g.f14248f;
        }

        public boolean hasExplicitBuckets() {
            if (this.optionsCase_ == 3) {
                return true;
            }
            return false;
        }

        public boolean hasExponentialBuckets() {
            if (this.optionsCase_ == 2) {
                return true;
            }
            return false;
        }

        public boolean hasLinearBuckets() {
            if (this.optionsCase_ == 1) {
                return true;
            }
            return false;
        }

        public static c newBuilder(BucketOptions bucketOptions) {
            return (c) DEFAULT_INSTANCE.createBuilder(bucketOptions);
        }

        public static BucketOptions parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
            return (BucketOptions) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
        }

        public static BucketOptions parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
            return (BucketOptions) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
        }

        public static BucketOptions parseFrom(H h6) throws C1912g3 {
            return (BucketOptions) L2.parseFrom(DEFAULT_INSTANCE, h6);
        }

        public static BucketOptions parseFrom(H h6, W1 w1) throws C1912g3 {
            return (BucketOptions) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
        }

        public static BucketOptions parseFrom(byte[] bArr) throws C1912g3 {
            return (BucketOptions) L2.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static BucketOptions parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
            return (BucketOptions) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
        }

        public static BucketOptions parseFrom(InputStream inputStream) throws IOException {
            return (BucketOptions) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BucketOptions parseFrom(InputStream inputStream, W1 w1) throws IOException {
            return (BucketOptions) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
        }

        public static BucketOptions parseFrom(S s5) throws IOException {
            return (BucketOptions) L2.parseFrom(DEFAULT_INSTANCE, s5);
        }

        public static BucketOptions parseFrom(S s5, W1 w1) throws IOException {
            return (BucketOptions) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
        }
    }

    /* loaded from: classes2.dex */
    public static final class Exemplar extends L2 implements K {
        public static final int ATTACHMENTS_FIELD_NUMBER = 3;
        private static final Exemplar DEFAULT_INSTANCE;
        private static volatile InterfaceC1948l4 PARSER = null;
        public static final int TIMESTAMP_FIELD_NUMBER = 2;
        public static final int VALUE_FIELD_NUMBER = 1;
        private InterfaceC1891d3 attachments_ = L2.emptyProtobufList();
        private Timestamp timestamp_;
        private double value_;

        static {
            Exemplar exemplar = new Exemplar();
            DEFAULT_INSTANCE = exemplar;
            L2.registerDefaultInstance(Exemplar.class, exemplar);
        }

        private Exemplar() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllAttachments(Iterable<? extends Any> iterable) {
            ensureAttachmentsIsMutable();
            AbstractC1880c.addAll((Iterable) iterable, (List) this.attachments_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAttachments(Any any) {
            any.getClass();
            ensureAttachmentsIsMutable();
            this.attachments_.add(any);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAttachments() {
            this.attachments_ = L2.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimestamp() {
            this.timestamp_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearValue() {
            this.value_ = 0.0d;
        }

        private void ensureAttachmentsIsMutable() {
            InterfaceC1891d3 interfaceC1891d3 = this.attachments_;
            if (!interfaceC1891d3.isModifiable()) {
                this.attachments_ = L2.mutableCopy(interfaceC1891d3);
            }
        }

        public static Exemplar getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeTimestamp(Timestamp timestamp) {
            timestamp.getClass();
            Timestamp timestamp2 = this.timestamp_;
            if (timestamp2 != null && timestamp2 != Timestamp.getDefaultInstance()) {
                this.timestamp_ = (Timestamp) ((C1907f5) Timestamp.newBuilder(this.timestamp_).mergeFrom((L2) timestamp)).buildPartial();
            } else {
                this.timestamp_ = timestamp;
            }
        }

        public static i newBuilder() {
            return (i) DEFAULT_INSTANCE.createBuilder();
        }

        public static Exemplar parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Exemplar) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Exemplar parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
            return (Exemplar) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static InterfaceC1948l4 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeAttachments(int i9) {
            ensureAttachmentsIsMutable();
            this.attachments_.remove(i9);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAttachments(int i9, Any any) {
            any.getClass();
            ensureAttachmentsIsMutable();
            this.attachments_.set(i9, any);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimestamp(Timestamp timestamp) {
            timestamp.getClass();
            this.timestamp_ = timestamp;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setValue(double d2) {
            this.value_ = d2;
        }

        @Override // com.google.protobuf.L2
        public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
            switch (J.f3968a[k22.ordinal()]) {
                case 1:
                    return new Exemplar();
                case 2:
                    return new D2(DEFAULT_INSTANCE);
                case 3:
                    return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0000\u0002\t\u0003\u001b", new Object[]{"value_", "timestamp_", "attachments_", Any.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    InterfaceC1948l4 interfaceC1948l4 = PARSER;
                    if (interfaceC1948l4 == null) {
                        synchronized (Exemplar.class) {
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

        public Any getAttachments(int i9) {
            return (Any) this.attachments_.get(i9);
        }

        public int getAttachmentsCount() {
            return this.attachments_.size();
        }

        public List<Any> getAttachmentsList() {
            return this.attachments_;
        }

        public InterfaceC1922i getAttachmentsOrBuilder(int i9) {
            return (InterfaceC1922i) this.attachments_.get(i9);
        }

        public List<? extends InterfaceC1922i> getAttachmentsOrBuilderList() {
            return this.attachments_;
        }

        public Timestamp getTimestamp() {
            Timestamp timestamp = this.timestamp_;
            if (timestamp == null) {
                return Timestamp.getDefaultInstance();
            }
            return timestamp;
        }

        public double getValue() {
            return this.value_;
        }

        public boolean hasTimestamp() {
            if (this.timestamp_ != null) {
                return true;
            }
            return false;
        }

        public static i newBuilder(Exemplar exemplar) {
            return (i) DEFAULT_INSTANCE.createBuilder(exemplar);
        }

        public static Exemplar parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
            return (Exemplar) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
        }

        public static Exemplar parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
            return (Exemplar) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
        }

        public static Exemplar parseFrom(H h6) throws C1912g3 {
            return (Exemplar) L2.parseFrom(DEFAULT_INSTANCE, h6);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAttachments(int i9, Any any) {
            any.getClass();
            ensureAttachmentsIsMutable();
            this.attachments_.add(i9, any);
        }

        public static Exemplar parseFrom(H h6, W1 w1) throws C1912g3 {
            return (Exemplar) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
        }

        public static Exemplar parseFrom(byte[] bArr) throws C1912g3 {
            return (Exemplar) L2.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Exemplar parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
            return (Exemplar) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
        }

        public static Exemplar parseFrom(InputStream inputStream) throws IOException {
            return (Exemplar) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Exemplar parseFrom(InputStream inputStream, W1 w1) throws IOException {
            return (Exemplar) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
        }

        public static Exemplar parseFrom(S s5) throws IOException {
            return (Exemplar) L2.parseFrom(DEFAULT_INSTANCE, s5);
        }

        public static Exemplar parseFrom(S s5, W1 w1) throws IOException {
            return (Exemplar) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
        }
    }

    /* loaded from: classes2.dex */
    public static final class Range extends L2 implements O3 {
        private static final Range DEFAULT_INSTANCE;
        public static final int MAX_FIELD_NUMBER = 2;
        public static final int MIN_FIELD_NUMBER = 1;
        private static volatile InterfaceC1948l4 PARSER;
        private double max_;
        private double min_;

        static {
            Range range = new Range();
            DEFAULT_INSTANCE = range;
            L2.registerDefaultInstance(Range.class, range);
        }

        private Range() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMax() {
            this.max_ = 0.0d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMin() {
            this.min_ = 0.0d;
        }

        public static Range getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static j newBuilder() {
            return (j) DEFAULT_INSTANCE.createBuilder();
        }

        public static Range parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Range) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Range parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
            return (Range) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static InterfaceC1948l4 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMax(double d2) {
            this.max_ = d2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMin(double d2) {
            this.min_ = d2;
        }

        @Override // com.google.protobuf.L2
        public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
            switch (J.f3968a[k22.ordinal()]) {
                case 1:
                    return new Range();
                case 2:
                    return new D2(DEFAULT_INSTANCE);
                case 3:
                    return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0000\u0002\u0000", new Object[]{"min_", "max_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    InterfaceC1948l4 interfaceC1948l4 = PARSER;
                    if (interfaceC1948l4 == null) {
                        synchronized (Range.class) {
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

        public double getMax() {
            return this.max_;
        }

        public double getMin() {
            return this.min_;
        }

        public static j newBuilder(Range range) {
            return (j) DEFAULT_INSTANCE.createBuilder(range);
        }

        public static Range parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
            return (Range) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
        }

        public static Range parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
            return (Range) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
        }

        public static Range parseFrom(H h6) throws C1912g3 {
            return (Range) L2.parseFrom(DEFAULT_INSTANCE, h6);
        }

        public static Range parseFrom(H h6, W1 w1) throws C1912g3 {
            return (Range) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
        }

        public static Range parseFrom(byte[] bArr) throws C1912g3 {
            return (Range) L2.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Range parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
            return (Range) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
        }

        public static Range parseFrom(InputStream inputStream) throws IOException {
            return (Range) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Range parseFrom(InputStream inputStream, W1 w1) throws IOException {
            return (Range) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
        }

        public static Range parseFrom(S s5) throws IOException {
            return (Range) L2.parseFrom(DEFAULT_INSTANCE, s5);
        }

        public static Range parseFrom(S s5, W1 w1) throws IOException {
            return (Range) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
        }
    }

    static {
        Distribution distribution = new Distribution();
        DEFAULT_INSTANCE = distribution;
        L2.registerDefaultInstance(Distribution.class, distribution);
    }

    private Distribution() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllBucketCounts(Iterable<? extends Long> iterable) {
        ensureBucketCountsIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.bucketCounts_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllExemplars(Iterable<? extends Exemplar> iterable) {
        ensureExemplarsIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.exemplars_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBucketCounts(long j7) {
        ensureBucketCountsIsMutable();
        ((C2044z3) this.bucketCounts_).addLong(j7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExemplars(Exemplar exemplar) {
        exemplar.getClass();
        ensureExemplarsIsMutable();
        this.exemplars_.add(exemplar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBucketCounts() {
        this.bucketCounts_ = L2.emptyLongList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBucketOptions() {
        this.bucketOptions_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCount() {
        this.count_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExemplars() {
        this.exemplars_ = L2.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMean() {
        this.mean_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRange() {
        this.range_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSumOfSquaredDeviation() {
        this.sumOfSquaredDeviation_ = 0.0d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void ensureBucketCountsIsMutable() {
        InterfaceC1884c3 interfaceC1884c3 = this.bucketCounts_;
        if (!((AbstractC1894e) interfaceC1884c3).isModifiable()) {
            this.bucketCounts_ = L2.mutableCopy(interfaceC1884c3);
        }
    }

    private void ensureExemplarsIsMutable() {
        InterfaceC1891d3 interfaceC1891d3 = this.exemplars_;
        if (!interfaceC1891d3.isModifiable()) {
            this.exemplars_ = L2.mutableCopy(interfaceC1891d3);
        }
    }

    public static Distribution getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBucketOptions(BucketOptions bucketOptions) {
        bucketOptions.getClass();
        BucketOptions bucketOptions2 = this.bucketOptions_;
        if (bucketOptions2 != null && bucketOptions2 != BucketOptions.getDefaultInstance()) {
            this.bucketOptions_ = (BucketOptions) ((c) BucketOptions.newBuilder(this.bucketOptions_).mergeFrom((L2) bucketOptions)).buildPartial();
        } else {
            this.bucketOptions_ = bucketOptions;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRange(Range range) {
        range.getClass();
        Range range2 = this.range_;
        if (range2 != null && range2 != Range.getDefaultInstance()) {
            this.range_ = (Range) ((j) Range.newBuilder(this.range_).mergeFrom((L2) range)).buildPartial();
        } else {
            this.range_ = range;
        }
    }

    public static h newBuilder() {
        return (h) DEFAULT_INSTANCE.createBuilder();
    }

    public static Distribution parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Distribution) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Distribution parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (Distribution) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeExemplars(int i9) {
        ensureExemplarsIsMutable();
        this.exemplars_.remove(i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBucketCounts(int i9, long j7) {
        ensureBucketCountsIsMutable();
        ((C2044z3) this.bucketCounts_).setLong(i9, j7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBucketOptions(BucketOptions bucketOptions) {
        bucketOptions.getClass();
        this.bucketOptions_ = bucketOptions;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCount(long j7) {
        this.count_ = j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExemplars(int i9, Exemplar exemplar) {
        exemplar.getClass();
        ensureExemplarsIsMutable();
        this.exemplars_.set(i9, exemplar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMean(double d2) {
        this.mean_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRange(Range range) {
        range.getClass();
        this.range_ = range;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSumOfSquaredDeviation(double d2) {
        this.sumOfSquaredDeviation_ = d2;
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (J.f3968a[k22.ordinal()]) {
            case 1:
                return new Distribution();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\n\u0007\u0000\u0002\u0000\u0001\u0002\u0002\u0000\u0003\u0000\u0004\t\u0006\t\u0007%\n\u001b", new Object[]{"count_", "mean_", "sumOfSquaredDeviation_", "range_", "bucketOptions_", "bucketCounts_", "exemplars_", Exemplar.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (Distribution.class) {
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

    public long getBucketCounts(int i9) {
        return ((C2044z3) this.bucketCounts_).getLong(i9);
    }

    public int getBucketCountsCount() {
        return this.bucketCounts_.size();
    }

    public List<Long> getBucketCountsList() {
        return this.bucketCounts_;
    }

    public BucketOptions getBucketOptions() {
        BucketOptions bucketOptions = this.bucketOptions_;
        if (bucketOptions == null) {
            return BucketOptions.getDefaultInstance();
        }
        return bucketOptions;
    }

    public long getCount() {
        return this.count_;
    }

    public Exemplar getExemplars(int i9) {
        return (Exemplar) this.exemplars_.get(i9);
    }

    public int getExemplarsCount() {
        return this.exemplars_.size();
    }

    public List<Exemplar> getExemplarsList() {
        return this.exemplars_;
    }

    public K getExemplarsOrBuilder(int i9) {
        return (K) this.exemplars_.get(i9);
    }

    public List<? extends K> getExemplarsOrBuilderList() {
        return this.exemplars_;
    }

    public double getMean() {
        return this.mean_;
    }

    public Range getRange() {
        Range range = this.range_;
        if (range == null) {
            return Range.getDefaultInstance();
        }
        return range;
    }

    public double getSumOfSquaredDeviation() {
        return this.sumOfSquaredDeviation_;
    }

    public boolean hasBucketOptions() {
        if (this.bucketOptions_ != null) {
            return true;
        }
        return false;
    }

    public boolean hasRange() {
        if (this.range_ != null) {
            return true;
        }
        return false;
    }

    public static h newBuilder(Distribution distribution) {
        return (h) DEFAULT_INSTANCE.createBuilder(distribution);
    }

    public static Distribution parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Distribution) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Distribution parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (Distribution) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static Distribution parseFrom(H h6) throws C1912g3 {
        return (Distribution) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExemplars(int i9, Exemplar exemplar) {
        exemplar.getClass();
        ensureExemplarsIsMutable();
        this.exemplars_.add(i9, exemplar);
    }

    public static Distribution parseFrom(H h6, W1 w1) throws C1912g3 {
        return (Distribution) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static Distribution parseFrom(byte[] bArr) throws C1912g3 {
        return (Distribution) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Distribution parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (Distribution) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static Distribution parseFrom(InputStream inputStream) throws IOException {
        return (Distribution) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Distribution parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Distribution) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Distribution parseFrom(S s5) throws IOException {
        return (Distribution) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static Distribution parseFrom(S s5, W1 w1) throws IOException {
        return (Distribution) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
