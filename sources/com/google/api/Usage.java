package com.google.api;

import a4.t1;
import a4.u1;
import a4.x1;
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
public final class Usage extends L2 implements O3 {
    private static final Usage DEFAULT_INSTANCE;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int PRODUCER_NOTIFICATION_CHANNEL_FIELD_NUMBER = 7;
    public static final int REQUIREMENTS_FIELD_NUMBER = 1;
    public static final int RULES_FIELD_NUMBER = 6;
    private InterfaceC1891d3 requirements_ = L2.emptyProtobufList();
    private InterfaceC1891d3 rules_ = L2.emptyProtobufList();
    private String producerNotificationChannel_ = "";

    static {
        Usage usage = new Usage();
        DEFAULT_INSTANCE = usage;
        L2.registerDefaultInstance(Usage.class, usage);
    }

    private Usage() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRequirements(Iterable<String> iterable) {
        ensureRequirementsIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.requirements_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRules(Iterable<? extends UsageRule> iterable) {
        ensureRulesIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.rules_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRequirements(String str) {
        str.getClass();
        ensureRequirementsIsMutable();
        this.requirements_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRequirementsBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        ensureRequirementsIsMutable();
        this.requirements_.add(h6.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRules(UsageRule usageRule) {
        usageRule.getClass();
        ensureRulesIsMutable();
        this.rules_.add(usageRule);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProducerNotificationChannel() {
        this.producerNotificationChannel_ = getDefaultInstance().getProducerNotificationChannel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequirements() {
        this.requirements_ = L2.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRules() {
        this.rules_ = L2.emptyProtobufList();
    }

    private void ensureRequirementsIsMutable() {
        InterfaceC1891d3 interfaceC1891d3 = this.requirements_;
        if (!interfaceC1891d3.isModifiable()) {
            this.requirements_ = L2.mutableCopy(interfaceC1891d3);
        }
    }

    private void ensureRulesIsMutable() {
        InterfaceC1891d3 interfaceC1891d3 = this.rules_;
        if (!interfaceC1891d3.isModifiable()) {
            this.rules_ = L2.mutableCopy(interfaceC1891d3);
        }
    }

    public static Usage getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static u1 newBuilder() {
        return (u1) DEFAULT_INSTANCE.createBuilder();
    }

    public static Usage parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Usage) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Usage parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (Usage) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeRules(int i9) {
        ensureRulesIsMutable();
        this.rules_.remove(i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProducerNotificationChannel(String str) {
        str.getClass();
        this.producerNotificationChannel_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProducerNotificationChannelBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.producerNotificationChannel_ = h6.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequirements(int i9, String str) {
        str.getClass();
        ensureRequirementsIsMutable();
        this.requirements_.set(i9, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRules(int i9, UsageRule usageRule) {
        usageRule.getClass();
        ensureRulesIsMutable();
        this.rules_.set(i9, usageRule);
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (t1.f4047a[k22.ordinal()]) {
            case 1:
                return new Usage();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0007\u0003\u0000\u0002\u0000\u0001Ț\u0006\u001b\u0007Ȉ", new Object[]{"requirements_", "rules_", UsageRule.class, "producerNotificationChannel_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (Usage.class) {
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

    public String getProducerNotificationChannel() {
        return this.producerNotificationChannel_;
    }

    public H getProducerNotificationChannelBytes() {
        return H.copyFromUtf8(this.producerNotificationChannel_);
    }

    public String getRequirements(int i9) {
        return (String) this.requirements_.get(i9);
    }

    public H getRequirementsBytes(int i9) {
        return H.copyFromUtf8((String) this.requirements_.get(i9));
    }

    public int getRequirementsCount() {
        return this.requirements_.size();
    }

    public List<String> getRequirementsList() {
        return this.requirements_;
    }

    public UsageRule getRules(int i9) {
        return (UsageRule) this.rules_.get(i9);
    }

    public int getRulesCount() {
        return this.rules_.size();
    }

    public List<UsageRule> getRulesList() {
        return this.rules_;
    }

    public x1 getRulesOrBuilder(int i9) {
        return (x1) this.rules_.get(i9);
    }

    public List<? extends x1> getRulesOrBuilderList() {
        return this.rules_;
    }

    public static u1 newBuilder(Usage usage) {
        return (u1) DEFAULT_INSTANCE.createBuilder(usage);
    }

    public static Usage parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Usage) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Usage parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (Usage) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static Usage parseFrom(H h6) throws C1912g3 {
        return (Usage) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRules(int i9, UsageRule usageRule) {
        usageRule.getClass();
        ensureRulesIsMutable();
        this.rules_.add(i9, usageRule);
    }

    public static Usage parseFrom(H h6, W1 w1) throws C1912g3 {
        return (Usage) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static Usage parseFrom(byte[] bArr) throws C1912g3 {
        return (Usage) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Usage parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (Usage) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static Usage parseFrom(InputStream inputStream) throws IOException {
        return (Usage) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Usage parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Usage) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Usage parseFrom(S s5) throws IOException {
        return (Usage) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static Usage parseFrom(S s5, W1 w1) throws IOException {
        return (Usage) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
