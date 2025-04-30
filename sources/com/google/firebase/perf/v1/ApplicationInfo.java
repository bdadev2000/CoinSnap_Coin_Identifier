package com.google.firebase.perf.v1;

import com.google.protobuf.C1912g3;
import com.google.protobuf.D2;
import com.google.protobuf.E2;
import com.google.protobuf.G3;
import com.google.protobuf.H;
import com.google.protobuf.InterfaceC1948l4;
import com.google.protobuf.K2;
import com.google.protobuf.L2;
import com.google.protobuf.O3;
import com.google.protobuf.S;
import com.google.protobuf.W1;
import i5.AbstractC2351f;
import i5.AbstractC2353h;
import i5.C2347b;
import i5.C2352g;
import i5.C2354i;
import i5.EnumC2355j;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public final class ApplicationInfo extends L2 implements O3 {
    public static final int ANDROID_APP_INFO_FIELD_NUMBER = 3;
    public static final int APPLICATION_PROCESS_STATE_FIELD_NUMBER = 5;
    public static final int APP_INSTANCE_ID_FIELD_NUMBER = 2;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 6;
    private static final ApplicationInfo DEFAULT_INSTANCE;
    public static final int GOOGLE_APP_ID_FIELD_NUMBER = 1;
    private static volatile InterfaceC1948l4 PARSER;
    private AndroidApplicationInfo androidAppInfo_;
    private int applicationProcessState_;
    private int bitField0_;
    private G3 customAttributes_ = G3.emptyMapField();
    private String googleAppId_ = "";
    private String appInstanceId_ = "";

    static {
        ApplicationInfo applicationInfo = new ApplicationInfo();
        DEFAULT_INSTANCE = applicationInfo;
        L2.registerDefaultInstance(ApplicationInfo.class, applicationInfo);
    }

    private ApplicationInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAndroidAppInfo() {
        this.androidAppInfo_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppInstanceId() {
        this.bitField0_ &= -3;
        this.appInstanceId_ = getDefaultInstance().getAppInstanceId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearApplicationProcessState() {
        this.bitField0_ &= -9;
        this.applicationProcessState_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGoogleAppId() {
        this.bitField0_ &= -2;
        this.googleAppId_ = getDefaultInstance().getGoogleAppId();
    }

    public static ApplicationInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> getMutableCustomAttributesMap() {
        return internalGetMutableCustomAttributes();
    }

    private G3 internalGetCustomAttributes() {
        return this.customAttributes_;
    }

    private G3 internalGetMutableCustomAttributes() {
        if (!this.customAttributes_.isMutable()) {
            this.customAttributes_ = this.customAttributes_.mutableCopy();
        }
        return this.customAttributes_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAndroidAppInfo(AndroidApplicationInfo androidApplicationInfo) {
        androidApplicationInfo.getClass();
        AndroidApplicationInfo androidApplicationInfo2 = this.androidAppInfo_;
        if (androidApplicationInfo2 != null && androidApplicationInfo2 != AndroidApplicationInfo.getDefaultInstance()) {
            this.androidAppInfo_ = (AndroidApplicationInfo) ((C2347b) AndroidApplicationInfo.newBuilder(this.androidAppInfo_).mergeFrom((L2) androidApplicationInfo)).buildPartial();
        } else {
            this.androidAppInfo_ = androidApplicationInfo;
        }
        this.bitField0_ |= 4;
    }

    public static C2352g newBuilder() {
        return (C2352g) DEFAULT_INSTANCE.createBuilder();
    }

    public static ApplicationInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ApplicationInfo) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ApplicationInfo parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (ApplicationInfo) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAndroidAppInfo(AndroidApplicationInfo androidApplicationInfo) {
        androidApplicationInfo.getClass();
        this.androidAppInfo_ = androidApplicationInfo;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppInstanceId(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.appInstanceId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppInstanceIdBytes(H h6) {
        this.appInstanceId_ = h6.toStringUtf8();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setApplicationProcessState(EnumC2355j enumC2355j) {
        this.applicationProcessState_ = enumC2355j.b;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGoogleAppId(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.googleAppId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGoogleAppIdBytes(H h6) {
        this.googleAppId_ = h6.toStringUtf8();
        this.bitField0_ |= 1;
    }

    public boolean containsCustomAttributes(String str) {
        str.getClass();
        return internalGetCustomAttributes().containsKey(str);
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (AbstractC2351f.f20672a[k22.ordinal()]) {
            case 1:
                return new ApplicationInfo();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0005ဌ\u0003\u00062", new Object[]{"bitField0_", "googleAppId_", "appInstanceId_", "androidAppInfo_", "applicationProcessState_", C2354i.b, "customAttributes_", AbstractC2353h.f20673a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (ApplicationInfo.class) {
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

    public AndroidApplicationInfo getAndroidAppInfo() {
        AndroidApplicationInfo androidApplicationInfo = this.androidAppInfo_;
        if (androidApplicationInfo == null) {
            return AndroidApplicationInfo.getDefaultInstance();
        }
        return androidApplicationInfo;
    }

    public String getAppInstanceId() {
        return this.appInstanceId_;
    }

    public H getAppInstanceIdBytes() {
        return H.copyFromUtf8(this.appInstanceId_);
    }

    public EnumC2355j getApplicationProcessState() {
        EnumC2355j a6 = EnumC2355j.a(this.applicationProcessState_);
        if (a6 == null) {
            return EnumC2355j.APPLICATION_PROCESS_STATE_UNKNOWN;
        }
        return a6;
    }

    @Deprecated
    public Map<String, String> getCustomAttributes() {
        return getCustomAttributesMap();
    }

    public int getCustomAttributesCount() {
        return internalGetCustomAttributes().size();
    }

    public Map<String, String> getCustomAttributesMap() {
        return Collections.unmodifiableMap(internalGetCustomAttributes());
    }

    public String getCustomAttributesOrDefault(String str, String str2) {
        str.getClass();
        G3 internalGetCustomAttributes = internalGetCustomAttributes();
        if (internalGetCustomAttributes.containsKey(str)) {
            return (String) internalGetCustomAttributes.get(str);
        }
        return str2;
    }

    public String getCustomAttributesOrThrow(String str) {
        str.getClass();
        G3 internalGetCustomAttributes = internalGetCustomAttributes();
        if (internalGetCustomAttributes.containsKey(str)) {
            return (String) internalGetCustomAttributes.get(str);
        }
        throw new IllegalArgumentException();
    }

    public String getGoogleAppId() {
        return this.googleAppId_;
    }

    public H getGoogleAppIdBytes() {
        return H.copyFromUtf8(this.googleAppId_);
    }

    public boolean hasAndroidAppInfo() {
        if ((this.bitField0_ & 4) != 0) {
            return true;
        }
        return false;
    }

    public boolean hasAppInstanceId() {
        if ((this.bitField0_ & 2) != 0) {
            return true;
        }
        return false;
    }

    public boolean hasApplicationProcessState() {
        if ((this.bitField0_ & 8) != 0) {
            return true;
        }
        return false;
    }

    public boolean hasGoogleAppId() {
        if ((this.bitField0_ & 1) != 0) {
            return true;
        }
        return false;
    }

    public static C2352g newBuilder(ApplicationInfo applicationInfo) {
        return (C2352g) DEFAULT_INSTANCE.createBuilder(applicationInfo);
    }

    public static ApplicationInfo parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (ApplicationInfo) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static ApplicationInfo parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (ApplicationInfo) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static ApplicationInfo parseFrom(H h6) throws C1912g3 {
        return (ApplicationInfo) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public static ApplicationInfo parseFrom(H h6, W1 w1) throws C1912g3 {
        return (ApplicationInfo) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static ApplicationInfo parseFrom(byte[] bArr) throws C1912g3 {
        return (ApplicationInfo) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ApplicationInfo parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (ApplicationInfo) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static ApplicationInfo parseFrom(InputStream inputStream) throws IOException {
        return (ApplicationInfo) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ApplicationInfo parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (ApplicationInfo) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static ApplicationInfo parseFrom(S s5) throws IOException {
        return (ApplicationInfo) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static ApplicationInfo parseFrom(S s5, W1 w1) throws IOException {
        return (ApplicationInfo) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
