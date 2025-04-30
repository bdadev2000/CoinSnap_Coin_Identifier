package com.google.api;

import a4.f1;
import a4.g1;
import com.google.protobuf.AbstractC1880c;
import com.google.protobuf.C1912g3;
import com.google.protobuf.D2;
import com.google.protobuf.E2;
import com.google.protobuf.H;
import com.google.protobuf.InterfaceC1948l4;
import com.google.protobuf.K2;
import com.google.protobuf.L2;
import com.google.protobuf.O3;
import com.google.protobuf.S;
import com.google.protobuf.W1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class ResourceReference extends L2 implements O3 {
    public static final int CHILD_TYPE_FIELD_NUMBER = 2;
    private static final ResourceReference DEFAULT_INSTANCE;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private String type_ = "";
    private String childType_ = "";

    static {
        ResourceReference resourceReference = new ResourceReference();
        DEFAULT_INSTANCE = resourceReference;
        L2.registerDefaultInstance(ResourceReference.class, resourceReference);
    }

    private ResourceReference() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChildType() {
        this.childType_ = getDefaultInstance().getChildType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = getDefaultInstance().getType();
    }

    public static ResourceReference getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static g1 newBuilder() {
        return (g1) DEFAULT_INSTANCE.createBuilder();
    }

    public static ResourceReference parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ResourceReference) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ResourceReference parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (ResourceReference) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChildType(String str) {
        str.getClass();
        this.childType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChildTypeBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.childType_ = h6.toStringUtf8();
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
        switch (f1.f4009a[k22.ordinal()]) {
            case 1:
                return new ResourceReference();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"type_", "childType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (ResourceReference.class) {
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

    public String getChildType() {
        return this.childType_;
    }

    public H getChildTypeBytes() {
        return H.copyFromUtf8(this.childType_);
    }

    public String getType() {
        return this.type_;
    }

    public H getTypeBytes() {
        return H.copyFromUtf8(this.type_);
    }

    public static g1 newBuilder(ResourceReference resourceReference) {
        return (g1) DEFAULT_INSTANCE.createBuilder(resourceReference);
    }

    public static ResourceReference parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (ResourceReference) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static ResourceReference parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (ResourceReference) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static ResourceReference parseFrom(H h6) throws C1912g3 {
        return (ResourceReference) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public static ResourceReference parseFrom(H h6, W1 w1) throws C1912g3 {
        return (ResourceReference) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static ResourceReference parseFrom(byte[] bArr) throws C1912g3 {
        return (ResourceReference) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ResourceReference parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (ResourceReference) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static ResourceReference parseFrom(InputStream inputStream) throws IOException {
        return (ResourceReference) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ResourceReference parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (ResourceReference) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static ResourceReference parseFrom(S s5) throws IOException {
        return (ResourceReference) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static ResourceReference parseFrom(S s5, W1 w1) throws IOException {
        return (ResourceReference) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
