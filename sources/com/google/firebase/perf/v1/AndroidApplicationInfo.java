package com.google.firebase.perf.v1;

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
import i5.AbstractC2346a;
import i5.C2347b;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class AndroidApplicationInfo extends L2 implements O3 {
    private static final AndroidApplicationInfo DEFAULT_INSTANCE;
    public static final int PACKAGE_NAME_FIELD_NUMBER = 1;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int SDK_VERSION_FIELD_NUMBER = 2;
    public static final int VERSION_NAME_FIELD_NUMBER = 3;
    private int bitField0_;
    private String packageName_ = "";
    private String sdkVersion_ = "";
    private String versionName_ = "";

    static {
        AndroidApplicationInfo androidApplicationInfo = new AndroidApplicationInfo();
        DEFAULT_INSTANCE = androidApplicationInfo;
        L2.registerDefaultInstance(AndroidApplicationInfo.class, androidApplicationInfo);
    }

    private AndroidApplicationInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPackageName() {
        this.bitField0_ &= -2;
        this.packageName_ = getDefaultInstance().getPackageName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSdkVersion() {
        this.bitField0_ &= -3;
        this.sdkVersion_ = getDefaultInstance().getSdkVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersionName() {
        this.bitField0_ &= -5;
        this.versionName_ = getDefaultInstance().getVersionName();
    }

    public static AndroidApplicationInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C2347b newBuilder() {
        return (C2347b) DEFAULT_INSTANCE.createBuilder();
    }

    public static AndroidApplicationInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AndroidApplicationInfo) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AndroidApplicationInfo parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (AndroidApplicationInfo) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPackageName(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.packageName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPackageNameBytes(H h6) {
        this.packageName_ = h6.toStringUtf8();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSdkVersion(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.sdkVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSdkVersionBytes(H h6) {
        this.sdkVersion_ = h6.toStringUtf8();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersionName(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.versionName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersionNameBytes(H h6) {
        this.versionName_ = h6.toStringUtf8();
        this.bitField0_ |= 4;
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (AbstractC2346a.f20670a[k22.ordinal()]) {
            case 1:
                return new AndroidApplicationInfo();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "packageName_", "sdkVersion_", "versionName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (AndroidApplicationInfo.class) {
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

    public String getPackageName() {
        return this.packageName_;
    }

    public H getPackageNameBytes() {
        return H.copyFromUtf8(this.packageName_);
    }

    public String getSdkVersion() {
        return this.sdkVersion_;
    }

    public H getSdkVersionBytes() {
        return H.copyFromUtf8(this.sdkVersion_);
    }

    public String getVersionName() {
        return this.versionName_;
    }

    public H getVersionNameBytes() {
        return H.copyFromUtf8(this.versionName_);
    }

    public boolean hasPackageName() {
        if ((this.bitField0_ & 1) != 0) {
            return true;
        }
        return false;
    }

    public boolean hasSdkVersion() {
        if ((this.bitField0_ & 2) != 0) {
            return true;
        }
        return false;
    }

    public boolean hasVersionName() {
        if ((this.bitField0_ & 4) != 0) {
            return true;
        }
        return false;
    }

    public static C2347b newBuilder(AndroidApplicationInfo androidApplicationInfo) {
        return (C2347b) DEFAULT_INSTANCE.createBuilder(androidApplicationInfo);
    }

    public static AndroidApplicationInfo parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (AndroidApplicationInfo) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static AndroidApplicationInfo parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (AndroidApplicationInfo) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static AndroidApplicationInfo parseFrom(H h6) throws C1912g3 {
        return (AndroidApplicationInfo) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public static AndroidApplicationInfo parseFrom(H h6, W1 w1) throws C1912g3 {
        return (AndroidApplicationInfo) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static AndroidApplicationInfo parseFrom(byte[] bArr) throws C1912g3 {
        return (AndroidApplicationInfo) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AndroidApplicationInfo parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (AndroidApplicationInfo) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static AndroidApplicationInfo parseFrom(InputStream inputStream) throws IOException {
        return (AndroidApplicationInfo) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AndroidApplicationInfo parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (AndroidApplicationInfo) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static AndroidApplicationInfo parseFrom(S s5) throws IOException {
        return (AndroidApplicationInfo) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static AndroidApplicationInfo parseFrom(S s5, W1 w1) throws IOException {
        return (AndroidApplicationInfo) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
