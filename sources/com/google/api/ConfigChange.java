package com.google.api;

import a4.AbstractC0393y;
import a4.C0395z;
import a4.EnumC0391x;
import a4.InterfaceC0350c;
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
public final class ConfigChange extends L2 implements O3 {
    public static final int ADVICES_FIELD_NUMBER = 5;
    public static final int CHANGE_TYPE_FIELD_NUMBER = 4;
    private static final ConfigChange DEFAULT_INSTANCE;
    public static final int ELEMENT_FIELD_NUMBER = 1;
    public static final int NEW_VALUE_FIELD_NUMBER = 3;
    public static final int OLD_VALUE_FIELD_NUMBER = 2;
    private static volatile InterfaceC1948l4 PARSER;
    private int changeType_;
    private String element_ = "";
    private String oldValue_ = "";
    private String newValue_ = "";
    private InterfaceC1891d3 advices_ = L2.emptyProtobufList();

    static {
        ConfigChange configChange = new ConfigChange();
        DEFAULT_INSTANCE = configChange;
        L2.registerDefaultInstance(ConfigChange.class, configChange);
    }

    private ConfigChange() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAdvices(Advice advice) {
        advice.getClass();
        ensureAdvicesIsMutable();
        this.advices_.add(advice);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAdvices(Iterable<? extends Advice> iterable) {
        ensureAdvicesIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.advices_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdvices() {
        this.advices_ = L2.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChangeType() {
        this.changeType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearElement() {
        this.element_ = getDefaultInstance().getElement();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNewValue() {
        this.newValue_ = getDefaultInstance().getNewValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOldValue() {
        this.oldValue_ = getDefaultInstance().getOldValue();
    }

    private void ensureAdvicesIsMutable() {
        InterfaceC1891d3 interfaceC1891d3 = this.advices_;
        if (!interfaceC1891d3.isModifiable()) {
            this.advices_ = L2.mutableCopy(interfaceC1891d3);
        }
    }

    public static ConfigChange getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C0395z newBuilder() {
        return (C0395z) DEFAULT_INSTANCE.createBuilder();
    }

    public static ConfigChange parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ConfigChange) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ConfigChange parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (ConfigChange) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAdvices(int i9) {
        ensureAdvicesIsMutable();
        this.advices_.remove(i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdvices(int i9, Advice advice) {
        advice.getClass();
        ensureAdvicesIsMutable();
        this.advices_.set(i9, advice);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChangeType(EnumC0391x enumC0391x) {
        this.changeType_ = enumC0391x.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChangeTypeValue(int i9) {
        this.changeType_ = i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setElement(String str) {
        str.getClass();
        this.element_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setElementBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.element_ = h6.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNewValue(String str) {
        str.getClass();
        this.newValue_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNewValueBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.newValue_ = h6.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOldValue(String str) {
        str.getClass();
        this.oldValue_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOldValueBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.oldValue_ = h6.toStringUtf8();
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (AbstractC0393y.f4071a[k22.ordinal()]) {
            case 1:
                return new ConfigChange();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\f\u0005\u001b", new Object[]{"element_", "oldValue_", "newValue_", "changeType_", "advices_", Advice.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (ConfigChange.class) {
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

    public Advice getAdvices(int i9) {
        return (Advice) this.advices_.get(i9);
    }

    public int getAdvicesCount() {
        return this.advices_.size();
    }

    public List<Advice> getAdvicesList() {
        return this.advices_;
    }

    public InterfaceC0350c getAdvicesOrBuilder(int i9) {
        return (InterfaceC0350c) this.advices_.get(i9);
    }

    public List<? extends InterfaceC0350c> getAdvicesOrBuilderList() {
        return this.advices_;
    }

    public EnumC0391x getChangeType() {
        EnumC0391x enumC0391x;
        int i9 = this.changeType_;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        enumC0391x = null;
                    } else {
                        enumC0391x = EnumC0391x.MODIFIED;
                    }
                } else {
                    enumC0391x = EnumC0391x.REMOVED;
                }
            } else {
                enumC0391x = EnumC0391x.ADDED;
            }
        } else {
            enumC0391x = EnumC0391x.CHANGE_TYPE_UNSPECIFIED;
        }
        if (enumC0391x == null) {
            return EnumC0391x.UNRECOGNIZED;
        }
        return enumC0391x;
    }

    public int getChangeTypeValue() {
        return this.changeType_;
    }

    public String getElement() {
        return this.element_;
    }

    public H getElementBytes() {
        return H.copyFromUtf8(this.element_);
    }

    public String getNewValue() {
        return this.newValue_;
    }

    public H getNewValueBytes() {
        return H.copyFromUtf8(this.newValue_);
    }

    public String getOldValue() {
        return this.oldValue_;
    }

    public H getOldValueBytes() {
        return H.copyFromUtf8(this.oldValue_);
    }

    public static C0395z newBuilder(ConfigChange configChange) {
        return (C0395z) DEFAULT_INSTANCE.createBuilder(configChange);
    }

    public static ConfigChange parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (ConfigChange) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static ConfigChange parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (ConfigChange) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static ConfigChange parseFrom(H h6) throws C1912g3 {
        return (ConfigChange) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAdvices(int i9, Advice advice) {
        advice.getClass();
        ensureAdvicesIsMutable();
        this.advices_.add(i9, advice);
    }

    public static ConfigChange parseFrom(H h6, W1 w1) throws C1912g3 {
        return (ConfigChange) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static ConfigChange parseFrom(byte[] bArr) throws C1912g3 {
        return (ConfigChange) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ConfigChange parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (ConfigChange) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static ConfigChange parseFrom(InputStream inputStream) throws IOException {
        return (ConfigChange) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ConfigChange parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (ConfigChange) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static ConfigChange parseFrom(S s5) throws IOException {
        return (ConfigChange) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static ConfigChange parseFrom(S s5, W1 w1) throws IOException {
        return (ConfigChange) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
