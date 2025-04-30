package com.google.api;

import a4.AbstractC0375o0;
import a4.InterfaceC0377p0;
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
public final class Logging extends L2 implements O3 {
    public static final int CONSUMER_DESTINATIONS_FIELD_NUMBER = 2;
    private static final Logging DEFAULT_INSTANCE;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int PRODUCER_DESTINATIONS_FIELD_NUMBER = 1;
    private InterfaceC1891d3 producerDestinations_ = L2.emptyProtobufList();
    private InterfaceC1891d3 consumerDestinations_ = L2.emptyProtobufList();

    /* loaded from: classes2.dex */
    public static final class LoggingDestination extends L2 implements InterfaceC0377p0 {
        private static final LoggingDestination DEFAULT_INSTANCE;
        public static final int LOGS_FIELD_NUMBER = 1;
        public static final int MONITORED_RESOURCE_FIELD_NUMBER = 3;
        private static volatile InterfaceC1948l4 PARSER;
        private String monitoredResource_ = "";
        private InterfaceC1891d3 logs_ = L2.emptyProtobufList();

        static {
            LoggingDestination loggingDestination = new LoggingDestination();
            DEFAULT_INSTANCE = loggingDestination;
            L2.registerDefaultInstance(LoggingDestination.class, loggingDestination);
        }

        private LoggingDestination() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllLogs(Iterable<String> iterable) {
            ensureLogsIsMutable();
            AbstractC1880c.addAll((Iterable) iterable, (List) this.logs_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addLogs(String str) {
            str.getClass();
            ensureLogsIsMutable();
            this.logs_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addLogsBytes(H h6) {
            AbstractC1880c.checkByteStringIsUtf8(h6);
            ensureLogsIsMutable();
            this.logs_.add(h6.toStringUtf8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLogs() {
            this.logs_ = L2.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMonitoredResource() {
            this.monitoredResource_ = getDefaultInstance().getMonitoredResource();
        }

        private void ensureLogsIsMutable() {
            InterfaceC1891d3 interfaceC1891d3 = this.logs_;
            if (!interfaceC1891d3.isModifiable()) {
                this.logs_ = L2.mutableCopy(interfaceC1891d3);
            }
        }

        public static LoggingDestination getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static l newBuilder() {
            return (l) DEFAULT_INSTANCE.createBuilder();
        }

        public static LoggingDestination parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LoggingDestination) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LoggingDestination parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
            return (LoggingDestination) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static InterfaceC1948l4 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLogs(int i9, String str) {
            str.getClass();
            ensureLogsIsMutable();
            this.logs_.set(i9, str);
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
            switch (AbstractC0375o0.f4032a[k22.ordinal()]) {
                case 1:
                    return new LoggingDestination();
                case 2:
                    return new D2(DEFAULT_INSTANCE);
                case 3:
                    return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0001\u0000\u0001Ț\u0003Ȉ", new Object[]{"logs_", "monitoredResource_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    InterfaceC1948l4 interfaceC1948l4 = PARSER;
                    if (interfaceC1948l4 == null) {
                        synchronized (LoggingDestination.class) {
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

        public String getLogs(int i9) {
            return (String) this.logs_.get(i9);
        }

        public H getLogsBytes(int i9) {
            return H.copyFromUtf8((String) this.logs_.get(i9));
        }

        public int getLogsCount() {
            return this.logs_.size();
        }

        public List<String> getLogsList() {
            return this.logs_;
        }

        public String getMonitoredResource() {
            return this.monitoredResource_;
        }

        public H getMonitoredResourceBytes() {
            return H.copyFromUtf8(this.monitoredResource_);
        }

        public static l newBuilder(LoggingDestination loggingDestination) {
            return (l) DEFAULT_INSTANCE.createBuilder(loggingDestination);
        }

        public static LoggingDestination parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
            return (LoggingDestination) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
        }

        public static LoggingDestination parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
            return (LoggingDestination) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
        }

        public static LoggingDestination parseFrom(H h6) throws C1912g3 {
            return (LoggingDestination) L2.parseFrom(DEFAULT_INSTANCE, h6);
        }

        public static LoggingDestination parseFrom(H h6, W1 w1) throws C1912g3 {
            return (LoggingDestination) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
        }

        public static LoggingDestination parseFrom(byte[] bArr) throws C1912g3 {
            return (LoggingDestination) L2.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LoggingDestination parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
            return (LoggingDestination) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
        }

        public static LoggingDestination parseFrom(InputStream inputStream) throws IOException {
            return (LoggingDestination) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LoggingDestination parseFrom(InputStream inputStream, W1 w1) throws IOException {
            return (LoggingDestination) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
        }

        public static LoggingDestination parseFrom(S s5) throws IOException {
            return (LoggingDestination) L2.parseFrom(DEFAULT_INSTANCE, s5);
        }

        public static LoggingDestination parseFrom(S s5, W1 w1) throws IOException {
            return (LoggingDestination) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
        }
    }

    static {
        Logging logging = new Logging();
        DEFAULT_INSTANCE = logging;
        L2.registerDefaultInstance(Logging.class, logging);
    }

    private Logging() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllConsumerDestinations(Iterable<? extends LoggingDestination> iterable) {
        ensureConsumerDestinationsIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.consumerDestinations_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllProducerDestinations(Iterable<? extends LoggingDestination> iterable) {
        ensureProducerDestinationsIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.producerDestinations_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addConsumerDestinations(LoggingDestination loggingDestination) {
        loggingDestination.getClass();
        ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.add(loggingDestination);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addProducerDestinations(LoggingDestination loggingDestination) {
        loggingDestination.getClass();
        ensureProducerDestinationsIsMutable();
        this.producerDestinations_.add(loggingDestination);
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

    public static Logging getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static k newBuilder() {
        return (k) DEFAULT_INSTANCE.createBuilder();
    }

    public static Logging parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Logging) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Logging parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (Logging) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
    public void setConsumerDestinations(int i9, LoggingDestination loggingDestination) {
        loggingDestination.getClass();
        ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.set(i9, loggingDestination);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProducerDestinations(int i9, LoggingDestination loggingDestination) {
        loggingDestination.getClass();
        ensureProducerDestinationsIsMutable();
        this.producerDestinations_.set(i9, loggingDestination);
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (AbstractC0375o0.f4032a[k22.ordinal()]) {
            case 1:
                return new Logging();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"producerDestinations_", LoggingDestination.class, "consumerDestinations_", LoggingDestination.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (Logging.class) {
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

    public LoggingDestination getConsumerDestinations(int i9) {
        return (LoggingDestination) this.consumerDestinations_.get(i9);
    }

    public int getConsumerDestinationsCount() {
        return this.consumerDestinations_.size();
    }

    public List<LoggingDestination> getConsumerDestinationsList() {
        return this.consumerDestinations_;
    }

    public InterfaceC0377p0 getConsumerDestinationsOrBuilder(int i9) {
        return (InterfaceC0377p0) this.consumerDestinations_.get(i9);
    }

    public List<? extends InterfaceC0377p0> getConsumerDestinationsOrBuilderList() {
        return this.consumerDestinations_;
    }

    public LoggingDestination getProducerDestinations(int i9) {
        return (LoggingDestination) this.producerDestinations_.get(i9);
    }

    public int getProducerDestinationsCount() {
        return this.producerDestinations_.size();
    }

    public List<LoggingDestination> getProducerDestinationsList() {
        return this.producerDestinations_;
    }

    public InterfaceC0377p0 getProducerDestinationsOrBuilder(int i9) {
        return (InterfaceC0377p0) this.producerDestinations_.get(i9);
    }

    public List<? extends InterfaceC0377p0> getProducerDestinationsOrBuilderList() {
        return this.producerDestinations_;
    }

    public static k newBuilder(Logging logging) {
        return (k) DEFAULT_INSTANCE.createBuilder(logging);
    }

    public static Logging parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Logging) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Logging parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (Logging) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static Logging parseFrom(H h6) throws C1912g3 {
        return (Logging) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addConsumerDestinations(int i9, LoggingDestination loggingDestination) {
        loggingDestination.getClass();
        ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.add(i9, loggingDestination);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addProducerDestinations(int i9, LoggingDestination loggingDestination) {
        loggingDestination.getClass();
        ensureProducerDestinationsIsMutable();
        this.producerDestinations_.add(i9, loggingDestination);
    }

    public static Logging parseFrom(H h6, W1 w1) throws C1912g3 {
        return (Logging) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static Logging parseFrom(byte[] bArr) throws C1912g3 {
        return (Logging) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Logging parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (Logging) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static Logging parseFrom(InputStream inputStream) throws IOException {
        return (Logging) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Logging parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Logging) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Logging parseFrom(S s5) throws IOException {
        return (Logging) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static Logging parseFrom(S s5, W1 w1) throws IOException {
        return (Logging) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
