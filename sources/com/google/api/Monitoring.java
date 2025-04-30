package com.google.api;

import a4.J0;
import a4.K0;
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
public final class Monitoring extends L2 implements O3 {
    public static final int CONSUMER_DESTINATIONS_FIELD_NUMBER = 2;
    private static final Monitoring DEFAULT_INSTANCE;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int PRODUCER_DESTINATIONS_FIELD_NUMBER = 1;
    private InterfaceC1891d3 producerDestinations_ = L2.emptyProtobufList();
    private InterfaceC1891d3 consumerDestinations_ = L2.emptyProtobufList();

    /* loaded from: classes2.dex */
    public static final class MonitoringDestination extends L2 implements K0 {
        private static final MonitoringDestination DEFAULT_INSTANCE;
        public static final int METRICS_FIELD_NUMBER = 2;
        public static final int MONITORED_RESOURCE_FIELD_NUMBER = 1;
        private static volatile InterfaceC1948l4 PARSER;
        private String monitoredResource_ = "";
        private InterfaceC1891d3 metrics_ = L2.emptyProtobufList();

        static {
            MonitoringDestination monitoringDestination = new MonitoringDestination();
            DEFAULT_INSTANCE = monitoringDestination;
            L2.registerDefaultInstance(MonitoringDestination.class, monitoringDestination);
        }

        private MonitoringDestination() {
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

        public static MonitoringDestination getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static q newBuilder() {
            return (q) DEFAULT_INSTANCE.createBuilder();
        }

        public static MonitoringDestination parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MonitoringDestination) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MonitoringDestination parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
            return (MonitoringDestination) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
            switch (J0.f3969a[k22.ordinal()]) {
                case 1:
                    return new MonitoringDestination();
                case 2:
                    return new D2(DEFAULT_INSTANCE);
                case 3:
                    return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002Ț", new Object[]{"monitoredResource_", "metrics_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    InterfaceC1948l4 interfaceC1948l4 = PARSER;
                    if (interfaceC1948l4 == null) {
                        synchronized (MonitoringDestination.class) {
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

        public static q newBuilder(MonitoringDestination monitoringDestination) {
            return (q) DEFAULT_INSTANCE.createBuilder(monitoringDestination);
        }

        public static MonitoringDestination parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
            return (MonitoringDestination) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
        }

        public static MonitoringDestination parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
            return (MonitoringDestination) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
        }

        public static MonitoringDestination parseFrom(H h6) throws C1912g3 {
            return (MonitoringDestination) L2.parseFrom(DEFAULT_INSTANCE, h6);
        }

        public static MonitoringDestination parseFrom(H h6, W1 w1) throws C1912g3 {
            return (MonitoringDestination) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
        }

        public static MonitoringDestination parseFrom(byte[] bArr) throws C1912g3 {
            return (MonitoringDestination) L2.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MonitoringDestination parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
            return (MonitoringDestination) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
        }

        public static MonitoringDestination parseFrom(InputStream inputStream) throws IOException {
            return (MonitoringDestination) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MonitoringDestination parseFrom(InputStream inputStream, W1 w1) throws IOException {
            return (MonitoringDestination) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
        }

        public static MonitoringDestination parseFrom(S s5) throws IOException {
            return (MonitoringDestination) L2.parseFrom(DEFAULT_INSTANCE, s5);
        }

        public static MonitoringDestination parseFrom(S s5, W1 w1) throws IOException {
            return (MonitoringDestination) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
        }
    }

    static {
        Monitoring monitoring = new Monitoring();
        DEFAULT_INSTANCE = monitoring;
        L2.registerDefaultInstance(Monitoring.class, monitoring);
    }

    private Monitoring() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllConsumerDestinations(Iterable<? extends MonitoringDestination> iterable) {
        ensureConsumerDestinationsIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.consumerDestinations_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllProducerDestinations(Iterable<? extends MonitoringDestination> iterable) {
        ensureProducerDestinationsIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.producerDestinations_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addConsumerDestinations(MonitoringDestination monitoringDestination) {
        monitoringDestination.getClass();
        ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.add(monitoringDestination);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addProducerDestinations(MonitoringDestination monitoringDestination) {
        monitoringDestination.getClass();
        ensureProducerDestinationsIsMutable();
        this.producerDestinations_.add(monitoringDestination);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConsumerDestinations() {
        this.consumerDestinations_ = L2.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProducerDestinations() {
        this.producerDestinations_ = L2.emptyProtobufList();
    }

    private void ensureConsumerDestinationsIsMutable() {
        InterfaceC1891d3 interfaceC1891d3 = this.consumerDestinations_;
        if (!interfaceC1891d3.isModifiable()) {
            this.consumerDestinations_ = L2.mutableCopy(interfaceC1891d3);
        }
    }

    private void ensureProducerDestinationsIsMutable() {
        InterfaceC1891d3 interfaceC1891d3 = this.producerDestinations_;
        if (!interfaceC1891d3.isModifiable()) {
            this.producerDestinations_ = L2.mutableCopy(interfaceC1891d3);
        }
    }

    public static Monitoring getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static p newBuilder() {
        return (p) DEFAULT_INSTANCE.createBuilder();
    }

    public static Monitoring parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Monitoring) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Monitoring parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (Monitoring) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
    public void removeProducerDestinations(int i9) {
        ensureProducerDestinationsIsMutable();
        this.producerDestinations_.remove(i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConsumerDestinations(int i9, MonitoringDestination monitoringDestination) {
        monitoringDestination.getClass();
        ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.set(i9, monitoringDestination);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProducerDestinations(int i9, MonitoringDestination monitoringDestination) {
        monitoringDestination.getClass();
        ensureProducerDestinationsIsMutable();
        this.producerDestinations_.set(i9, monitoringDestination);
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (J0.f3969a[k22.ordinal()]) {
            case 1:
                return new Monitoring();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"producerDestinations_", MonitoringDestination.class, "consumerDestinations_", MonitoringDestination.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (Monitoring.class) {
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

    public MonitoringDestination getConsumerDestinations(int i9) {
        return (MonitoringDestination) this.consumerDestinations_.get(i9);
    }

    public int getConsumerDestinationsCount() {
        return this.consumerDestinations_.size();
    }

    public List<MonitoringDestination> getConsumerDestinationsList() {
        return this.consumerDestinations_;
    }

    public K0 getConsumerDestinationsOrBuilder(int i9) {
        return (K0) this.consumerDestinations_.get(i9);
    }

    public List<? extends K0> getConsumerDestinationsOrBuilderList() {
        return this.consumerDestinations_;
    }

    public MonitoringDestination getProducerDestinations(int i9) {
        return (MonitoringDestination) this.producerDestinations_.get(i9);
    }

    public int getProducerDestinationsCount() {
        return this.producerDestinations_.size();
    }

    public List<MonitoringDestination> getProducerDestinationsList() {
        return this.producerDestinations_;
    }

    public K0 getProducerDestinationsOrBuilder(int i9) {
        return (K0) this.producerDestinations_.get(i9);
    }

    public List<? extends K0> getProducerDestinationsOrBuilderList() {
        return this.producerDestinations_;
    }

    public static p newBuilder(Monitoring monitoring) {
        return (p) DEFAULT_INSTANCE.createBuilder(monitoring);
    }

    public static Monitoring parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Monitoring) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Monitoring parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (Monitoring) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static Monitoring parseFrom(H h6) throws C1912g3 {
        return (Monitoring) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addConsumerDestinations(int i9, MonitoringDestination monitoringDestination) {
        monitoringDestination.getClass();
        ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.add(i9, monitoringDestination);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addProducerDestinations(int i9, MonitoringDestination monitoringDestination) {
        monitoringDestination.getClass();
        ensureProducerDestinationsIsMutable();
        this.producerDestinations_.add(i9, monitoringDestination);
    }

    public static Monitoring parseFrom(H h6, W1 w1) throws C1912g3 {
        return (Monitoring) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static Monitoring parseFrom(byte[] bArr) throws C1912g3 {
        return (Monitoring) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Monitoring parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (Monitoring) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static Monitoring parseFrom(InputStream inputStream) throws IOException {
        return (Monitoring) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Monitoring parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Monitoring) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Monitoring parseFrom(S s5) throws IOException {
        return (Monitoring) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static Monitoring parseFrom(S s5, W1 w1) throws IOException {
        return (Monitoring) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
