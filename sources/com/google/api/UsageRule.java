package com.google.api;

import a4.v1;
import a4.w1;
import a4.x1;
import com.google.protobuf.AbstractC1880c;
import com.google.protobuf.C1912g3;
import com.google.protobuf.D2;
import com.google.protobuf.E2;
import com.google.protobuf.H;
import com.google.protobuf.InterfaceC1948l4;
import com.google.protobuf.K2;
import com.google.protobuf.L2;
import com.google.protobuf.S;
import com.google.protobuf.W1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class UsageRule extends L2 implements x1 {
    public static final int ALLOW_UNREGISTERED_CALLS_FIELD_NUMBER = 2;
    private static final UsageRule DEFAULT_INSTANCE;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    public static final int SKIP_SERVICE_CONTROL_FIELD_NUMBER = 3;
    private boolean allowUnregisteredCalls_;
    private String selector_ = "";
    private boolean skipServiceControl_;

    static {
        UsageRule usageRule = new UsageRule();
        DEFAULT_INSTANCE = usageRule;
        L2.registerDefaultInstance(UsageRule.class, usageRule);
    }

    private UsageRule() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAllowUnregisteredCalls() {
        this.allowUnregisteredCalls_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSelector() {
        this.selector_ = getDefaultInstance().getSelector();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSkipServiceControl() {
        this.skipServiceControl_ = false;
    }

    public static UsageRule getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static w1 newBuilder() {
        return (w1) DEFAULT_INSTANCE.createBuilder();
    }

    public static UsageRule parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (UsageRule) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UsageRule parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (UsageRule) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAllowUnregisteredCalls(boolean z8) {
        this.allowUnregisteredCalls_ = z8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelector(String str) {
        str.getClass();
        this.selector_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelectorBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.selector_ = h6.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSkipServiceControl(boolean z8) {
        this.skipServiceControl_ = z8;
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (v1.f4063a[k22.ordinal()]) {
            case 1:
                return new UsageRule();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0007\u0003\u0007", new Object[]{"selector_", "allowUnregisteredCalls_", "skipServiceControl_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (UsageRule.class) {
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

    public boolean getAllowUnregisteredCalls() {
        return this.allowUnregisteredCalls_;
    }

    public String getSelector() {
        return this.selector_;
    }

    public H getSelectorBytes() {
        return H.copyFromUtf8(this.selector_);
    }

    public boolean getSkipServiceControl() {
        return this.skipServiceControl_;
    }

    public static w1 newBuilder(UsageRule usageRule) {
        return (w1) DEFAULT_INSTANCE.createBuilder(usageRule);
    }

    public static UsageRule parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (UsageRule) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static UsageRule parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (UsageRule) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static UsageRule parseFrom(H h6) throws C1912g3 {
        return (UsageRule) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public static UsageRule parseFrom(H h6, W1 w1) throws C1912g3 {
        return (UsageRule) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static UsageRule parseFrom(byte[] bArr) throws C1912g3 {
        return (UsageRule) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static UsageRule parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (UsageRule) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static UsageRule parseFrom(InputStream inputStream) throws IOException {
        return (UsageRule) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UsageRule parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (UsageRule) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static UsageRule parseFrom(S s5) throws IOException {
        return (UsageRule) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static UsageRule parseFrom(S s5, W1 w1) throws IOException {
        return (UsageRule) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
