package com.google.api;

import a4.D0;
import a4.E0;
import a4.EnumC0367k0;
import a4.F0;
import a4.InterfaceC0365j0;
import com.google.protobuf.AbstractC1880c;
import com.google.protobuf.C1912g3;
import com.google.protobuf.D2;
import com.google.protobuf.E2;
import com.google.protobuf.H;
import com.google.protobuf.InterfaceC1891d3;
import com.google.protobuf.InterfaceC1948l4;
import com.google.protobuf.K2;
import com.google.protobuf.L2;
import com.google.protobuf.S;
import com.google.protobuf.W1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes2.dex */
public final class MonitoredResourceDescriptor extends L2 implements F0 {
    private static final MonitoredResourceDescriptor DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int DISPLAY_NAME_FIELD_NUMBER = 2;
    public static final int LABELS_FIELD_NUMBER = 4;
    public static final int LAUNCH_STAGE_FIELD_NUMBER = 7;
    public static final int NAME_FIELD_NUMBER = 5;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int launchStage_;
    private String name_ = "";
    private String type_ = "";
    private String displayName_ = "";
    private String description_ = "";
    private InterfaceC1891d3 labels_ = L2.emptyProtobufList();

    static {
        MonitoredResourceDescriptor monitoredResourceDescriptor = new MonitoredResourceDescriptor();
        DEFAULT_INSTANCE = monitoredResourceDescriptor;
        L2.registerDefaultInstance(MonitoredResourceDescriptor.class, monitoredResourceDescriptor);
    }

    private MonitoredResourceDescriptor() {
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
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = getDefaultInstance().getType();
    }

    private void ensureLabelsIsMutable() {
        InterfaceC1891d3 interfaceC1891d3 = this.labels_;
        if (!interfaceC1891d3.isModifiable()) {
            this.labels_ = L2.mutableCopy(interfaceC1891d3);
        }
    }

    public static MonitoredResourceDescriptor getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static E0 newBuilder() {
        return (E0) DEFAULT_INSTANCE.createBuilder();
    }

    public static MonitoredResourceDescriptor parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MonitoredResourceDescriptor) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MonitoredResourceDescriptor parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (MonitoredResourceDescriptor) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (D0.f3963a[k22.ordinal()]) {
            case 1:
                return new MonitoredResourceDescriptor();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0007\u0006\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u001b\u0005Ȉ\u0007\f", new Object[]{"type_", "displayName_", "description_", "labels_", LabelDescriptor.class, "name_", "launchStage_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (MonitoredResourceDescriptor.class) {
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

    public static E0 newBuilder(MonitoredResourceDescriptor monitoredResourceDescriptor) {
        return (E0) DEFAULT_INSTANCE.createBuilder(monitoredResourceDescriptor);
    }

    public static MonitoredResourceDescriptor parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (MonitoredResourceDescriptor) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static MonitoredResourceDescriptor parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (MonitoredResourceDescriptor) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static MonitoredResourceDescriptor parseFrom(H h6) throws C1912g3 {
        return (MonitoredResourceDescriptor) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLabels(int i9, LabelDescriptor labelDescriptor) {
        labelDescriptor.getClass();
        ensureLabelsIsMutable();
        this.labels_.add(i9, labelDescriptor);
    }

    public static MonitoredResourceDescriptor parseFrom(H h6, W1 w1) throws C1912g3 {
        return (MonitoredResourceDescriptor) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static MonitoredResourceDescriptor parseFrom(byte[] bArr) throws C1912g3 {
        return (MonitoredResourceDescriptor) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MonitoredResourceDescriptor parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (MonitoredResourceDescriptor) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static MonitoredResourceDescriptor parseFrom(InputStream inputStream) throws IOException {
        return (MonitoredResourceDescriptor) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MonitoredResourceDescriptor parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (MonitoredResourceDescriptor) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static MonitoredResourceDescriptor parseFrom(S s5) throws IOException {
        return (MonitoredResourceDescriptor) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static MonitoredResourceDescriptor parseFrom(S s5, W1 w1) throws IOException {
        return (MonitoredResourceDescriptor) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
