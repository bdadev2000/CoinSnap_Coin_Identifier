package com.google.rpc;

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
import w5.r;
import w5.s;

/* loaded from: classes3.dex */
public final class ResourceInfo extends L2 implements O3 {
    private static final ResourceInfo DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 4;
    public static final int OWNER_FIELD_NUMBER = 3;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int RESOURCE_NAME_FIELD_NUMBER = 2;
    public static final int RESOURCE_TYPE_FIELD_NUMBER = 1;
    private String resourceType_ = "";
    private String resourceName_ = "";
    private String owner_ = "";
    private String description_ = "";

    static {
        ResourceInfo resourceInfo = new ResourceInfo();
        DEFAULT_INSTANCE = resourceInfo;
        L2.registerDefaultInstance(ResourceInfo.class, resourceInfo);
    }

    private ResourceInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDescription() {
        this.description_ = getDefaultInstance().getDescription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOwner() {
        this.owner_ = getDefaultInstance().getOwner();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResourceName() {
        this.resourceName_ = getDefaultInstance().getResourceName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResourceType() {
        this.resourceType_ = getDefaultInstance().getResourceType();
    }

    public static ResourceInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static s newBuilder() {
        return (s) DEFAULT_INSTANCE.createBuilder();
    }

    public static ResourceInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ResourceInfo) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ResourceInfo parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (ResourceInfo) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
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
    public void setOwner(String str) {
        str.getClass();
        this.owner_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOwnerBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.owner_ = h6.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResourceName(String str) {
        str.getClass();
        this.resourceName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResourceNameBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.resourceName_ = h6.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResourceType(String str) {
        str.getClass();
        this.resourceType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResourceTypeBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.resourceType_ = h6.toStringUtf8();
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (r.f23991a[k22.ordinal()]) {
            case 1:
                return new ResourceInfo();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"resourceType_", "resourceName_", "owner_", "description_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (ResourceInfo.class) {
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

    public String getOwner() {
        return this.owner_;
    }

    public H getOwnerBytes() {
        return H.copyFromUtf8(this.owner_);
    }

    public String getResourceName() {
        return this.resourceName_;
    }

    public H getResourceNameBytes() {
        return H.copyFromUtf8(this.resourceName_);
    }

    public String getResourceType() {
        return this.resourceType_;
    }

    public H getResourceTypeBytes() {
        return H.copyFromUtf8(this.resourceType_);
    }

    public static s newBuilder(ResourceInfo resourceInfo) {
        return (s) DEFAULT_INSTANCE.createBuilder(resourceInfo);
    }

    public static ResourceInfo parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (ResourceInfo) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static ResourceInfo parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (ResourceInfo) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static ResourceInfo parseFrom(H h6) throws C1912g3 {
        return (ResourceInfo) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public static ResourceInfo parseFrom(H h6, W1 w1) throws C1912g3 {
        return (ResourceInfo) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static ResourceInfo parseFrom(byte[] bArr) throws C1912g3 {
        return (ResourceInfo) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ResourceInfo parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (ResourceInfo) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static ResourceInfo parseFrom(InputStream inputStream) throws IOException {
        return (ResourceInfo) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ResourceInfo parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (ResourceInfo) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static ResourceInfo parseFrom(S s5) throws IOException {
        return (ResourceInfo) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static ResourceInfo parseFrom(S s5, W1 w1) throws IOException {
        return (ResourceInfo) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
