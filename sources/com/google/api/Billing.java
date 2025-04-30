package com.google.api;

import a4.AbstractC0387v;
import a4.InterfaceC0389w;
import com.google.protobuf.AbstractC1880c;
import com.google.protobuf.C1912g3;
import com.google.protobuf.D2;
import com.google.protobuf.E2;
import com.google.protobuf.H;
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
public final class Billing extends L2 implements O3 {
    public static final int CONSUMER_DESTINATIONS_FIELD_NUMBER = 8;
    private static final Billing DEFAULT_INSTANCE;
    private static volatile InterfaceC1948l4 PARSER;
    private InterfaceC1891d3 consumerDestinations_ = L2.emptyProtobufList();

    /* loaded from: classes2.dex */
    public static final class BillingDestination extends L2 implements InterfaceC0389w {
        private static final BillingDestination DEFAULT_INSTANCE;
        public static final int METRICS_FIELD_NUMBER = 2;
        public static final int MONITORED_RESOURCE_FIELD_NUMBER = 1;
        private static volatile InterfaceC1948l4 PARSER;
        private String monitoredResource_ = "";
        private InterfaceC1891d3 metrics_ = L2.emptyProtobufList();

        static {
            BillingDestination billingDestination = new BillingDestination();
            DEFAULT_INSTANCE = billingDestination;
            L2.registerDefaultInstance(BillingDestination.class, billingDestination);
        }

        private BillingDestination() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllMetrics(Iterable<String> iterable) {
            ensureMetricsIsMutable();
            AbstractC1880c.addAll((Iterable) iterable, (List) this.metrics_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMetrics(String str) {
            str.getClass();
            ensureMetricsIsMutable();
            this.metrics_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMetricsBytes(H h6) {
            AbstractC1880c.checkByteStringIsUtf8(h6);
            ensureMetricsIsMutable();
            this.metrics_.add(h6.toStringUtf8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMetrics() {
            this.metrics_ = L2.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMonitoredResource() {
            this.monitoredResource_ = getDefaultInstance().getMonitoredResource();
        }

        private void ensureMetricsIsMutable() {
            InterfaceC1891d3 interfaceC1891d3 = this.metrics_;
            if (!interfaceC1891d3.isModifiable()) {
                this.metrics_ = L2.mutableCopy(interfaceC1891d3);
            }
        }

        public static BillingDestination getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return (a) DEFAULT_INSTANCE.createBuilder();
        }

        public static BillingDestination parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (BillingDestination) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BillingDestination parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
            return (BillingDestination) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static InterfaceC1948l4 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMetrics(int i9, String str) {
            str.getClass();
            ensureMetricsIsMutable();
            this.metrics_.set(i9, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMonitoredResource(String str) {
            str.getClass();
            this.monitoredResource_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMonitoredResourceBytes(H h6) {
            AbstractC1880c.checkByteStringIsUtf8(h6);
            this.monitoredResource_ = h6.toStringUtf8();
        }

        @Override // com.google.protobuf.L2
        public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
            switch (AbstractC0387v.f4054a[k22.ordinal()]) {
                case 1:
                    return new BillingDestination();
                case 2:
                    return new D2(DEFAULT_INSTANCE);
                case 3:
                    return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002Ț", new Object[]{"monitoredResource_", "metrics_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    InterfaceC1948l4 interfaceC1948l4 = PARSER;
                    if (interfaceC1948l4 == null) {
                        synchronized (BillingDestination.class) {
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

        public String getMetrics(int i9) {
            return (String) this.metrics_.get(i9);
        }

        public H getMetricsBytes(int i9) {
            return H.copyFromUtf8((String) this.metrics_.get(i9));
        }

        public int getMetricsCount() {
            return this.metrics_.size();
        }

        public List<String> getMetricsList() {
            return this.metrics_;
        }

        public String getMonitoredResource() {
            return this.monitoredResource_;
        }

        public H getMonitoredResourceBytes() {
            return H.copyFromUtf8(this.monitoredResource_);
        }

        public static a newBuilder(BillingDestination billingDestination) {
            return (a) DEFAULT_INSTANCE.createBuilder(billingDestination);
        }

        public static BillingDestination parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
            return (BillingDestination) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
        }

        public static BillingDestination parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
            return (BillingDestination) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
        }

        public static BillingDestination parseFrom(H h6) throws C1912g3 {
            return (BillingDestination) L2.parseFrom(DEFAULT_INSTANCE, h6);
        }

        public static BillingDestination parseFrom(H h6, W1 w1) throws C1912g3 {
            return (BillingDestination) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
        }

        public static BillingDestination parseFrom(byte[] bArr) throws C1912g3 {
            return (BillingDestination) L2.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static BillingDestination parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
            return (BillingDestination) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
        }

        public static BillingDestination parseFrom(InputStream inputStream) throws IOException {
            return (BillingDestination) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BillingDestination parseFrom(InputStream inputStream, W1 w1) throws IOException {
            return (BillingDestination) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
        }

        public static BillingDestination parseFrom(S s5) throws IOException {
            return (BillingDestination) L2.parseFrom(DEFAULT_INSTANCE, s5);
        }

        public static BillingDestination parseFrom(S s5, W1 w1) throws IOException {
            return (BillingDestination) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
        }
    }

    static {
        Billing billing = new Billing();
        DEFAULT_INSTANCE = billing;
        L2.registerDefaultInstance(Billing.class, billing);
    }

    private Billing() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllConsumerDestinations(Iterable<? extends BillingDestination> iterable) {
        ensureConsumerDestinationsIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.consumerDestinations_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addConsumerDestinations(BillingDestination billingDestination) {
        billingDestination.getClass();
        ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.add(billingDestination);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConsumerDestinations() {
        this.consumerDestinations_ = L2.emptyProtobufList();
    }

    private void ensureConsumerDestinationsIsMutable() {
        InterfaceC1891d3 interfaceC1891d3 = this.consumerDestinations_;
        if (!interfaceC1891d3.isModifiable()) {
            this.consumerDestinations_ = L2.mutableCopy(interfaceC1891d3);
        }
    }

    public static Billing getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static b newBuilder() {
        return (b) DEFAULT_INSTANCE.createBuilder();
    }

    public static Billing parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Billing) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Billing parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (Billing) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeConsumerDestinations(int i9) {
        ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.remove(i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConsumerDestinations(int i9, BillingDestination billingDestination) {
        billingDestination.getClass();
        ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.set(i9, billingDestination);
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (AbstractC0387v.f4054a[k22.ordinal()]) {
            case 1:
                return new Billing();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\b\b\u0001\u0000\u0001\u0000\b\u001b", new Object[]{"consumerDestinations_", BillingDestination.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (Billing.class) {
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

    public BillingDestination getConsumerDestinations(int i9) {
        return (BillingDestination) this.consumerDestinations_.get(i9);
    }

    public int getConsumerDestinationsCount() {
        return this.consumerDestinations_.size();
    }

    public List<BillingDestination> getConsumerDestinationsList() {
        return this.consumerDestinations_;
    }

    public InterfaceC0389w getConsumerDestinationsOrBuilder(int i9) {
        return (InterfaceC0389w) this.consumerDestinations_.get(i9);
    }

    public List<? extends InterfaceC0389w> getConsumerDestinationsOrBuilderList() {
        return this.consumerDestinations_;
    }

    public static b newBuilder(Billing billing) {
        return (b) DEFAULT_INSTANCE.createBuilder(billing);
    }

    public static Billing parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Billing) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Billing parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (Billing) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static Billing parseFrom(H h6) throws C1912g3 {
        return (Billing) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addConsumerDestinations(int i9, BillingDestination billingDestination) {
        billingDestination.getClass();
        ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.add(i9, billingDestination);
    }

    public static Billing parseFrom(H h6, W1 w1) throws C1912g3 {
        return (Billing) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static Billing parseFrom(byte[] bArr) throws C1912g3 {
        return (Billing) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Billing parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (Billing) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static Billing parseFrom(InputStream inputStream) throws IOException {
        return (Billing) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Billing parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Billing) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Billing parseFrom(S s5) throws IOException {
        return (Billing) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static Billing parseFrom(S s5, W1 w1) throws IOException {
        return (Billing) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
