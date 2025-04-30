package com.google.api;

import a4.EnumC0347a0;
import a4.I;
import a4.InterfaceC0349b0;
import a4.Y;
import a4.Z;
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
public final class HttpRule extends L2 implements InterfaceC0349b0 {
    public static final int ADDITIONAL_BINDINGS_FIELD_NUMBER = 11;
    public static final int BODY_FIELD_NUMBER = 7;
    public static final int CUSTOM_FIELD_NUMBER = 8;
    private static final HttpRule DEFAULT_INSTANCE;
    public static final int DELETE_FIELD_NUMBER = 5;
    public static final int GET_FIELD_NUMBER = 2;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int PATCH_FIELD_NUMBER = 6;
    public static final int POST_FIELD_NUMBER = 4;
    public static final int PUT_FIELD_NUMBER = 3;
    public static final int RESPONSE_BODY_FIELD_NUMBER = 12;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private Object pattern_;
    private int patternCase_ = 0;
    private String selector_ = "";
    private String body_ = "";
    private String responseBody_ = "";
    private InterfaceC1891d3 additionalBindings_ = L2.emptyProtobufList();

    static {
        HttpRule httpRule = new HttpRule();
        DEFAULT_INSTANCE = httpRule;
        L2.registerDefaultInstance(HttpRule.class, httpRule);
    }

    private HttpRule() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAdditionalBindings(HttpRule httpRule) {
        httpRule.getClass();
        ensureAdditionalBindingsIsMutable();
        this.additionalBindings_.add(httpRule);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAdditionalBindings(Iterable<? extends HttpRule> iterable) {
        ensureAdditionalBindingsIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.additionalBindings_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdditionalBindings() {
        this.additionalBindings_ = L2.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBody() {
        this.body_ = getDefaultInstance().getBody();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCustom() {
        if (this.patternCase_ == 8) {
            this.patternCase_ = 0;
            this.pattern_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDelete() {
        if (this.patternCase_ == 5) {
            this.patternCase_ = 0;
            this.pattern_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGet() {
        if (this.patternCase_ == 2) {
            this.patternCase_ = 0;
            this.pattern_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPatch() {
        if (this.patternCase_ == 6) {
            this.patternCase_ = 0;
            this.pattern_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPattern() {
        this.patternCase_ = 0;
        this.pattern_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPost() {
        if (this.patternCase_ == 4) {
            this.patternCase_ = 0;
            this.pattern_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPut() {
        if (this.patternCase_ == 3) {
            this.patternCase_ = 0;
            this.pattern_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResponseBody() {
        this.responseBody_ = getDefaultInstance().getResponseBody();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSelector() {
        this.selector_ = getDefaultInstance().getSelector();
    }

    private void ensureAdditionalBindingsIsMutable() {
        InterfaceC1891d3 interfaceC1891d3 = this.additionalBindings_;
        if (!interfaceC1891d3.isModifiable()) {
            this.additionalBindings_ = L2.mutableCopy(interfaceC1891d3);
        }
    }

    public static HttpRule getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCustom(CustomHttpPattern customHttpPattern) {
        customHttpPattern.getClass();
        if (this.patternCase_ == 8 && this.pattern_ != CustomHttpPattern.getDefaultInstance()) {
            this.pattern_ = ((I) CustomHttpPattern.newBuilder((CustomHttpPattern) this.pattern_).mergeFrom((L2) customHttpPattern)).buildPartial();
        } else {
            this.pattern_ = customHttpPattern;
        }
        this.patternCase_ = 8;
    }

    public static Z newBuilder() {
        return (Z) DEFAULT_INSTANCE.createBuilder();
    }

    public static HttpRule parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (HttpRule) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HttpRule parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (HttpRule) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAdditionalBindings(int i9) {
        ensureAdditionalBindingsIsMutable();
        this.additionalBindings_.remove(i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdditionalBindings(int i9, HttpRule httpRule) {
        httpRule.getClass();
        ensureAdditionalBindingsIsMutable();
        this.additionalBindings_.set(i9, httpRule);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBody(String str) {
        str.getClass();
        this.body_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBodyBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.body_ = h6.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCustom(CustomHttpPattern customHttpPattern) {
        customHttpPattern.getClass();
        this.pattern_ = customHttpPattern;
        this.patternCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDelete(String str) {
        str.getClass();
        this.patternCase_ = 5;
        this.pattern_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeleteBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.pattern_ = h6.toStringUtf8();
        this.patternCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGet(String str) {
        str.getClass();
        this.patternCase_ = 2;
        this.pattern_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGetBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.pattern_ = h6.toStringUtf8();
        this.patternCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPatch(String str) {
        str.getClass();
        this.patternCase_ = 6;
        this.pattern_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPatchBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.pattern_ = h6.toStringUtf8();
        this.patternCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPost(String str) {
        str.getClass();
        this.patternCase_ = 4;
        this.pattern_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPostBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.pattern_ = h6.toStringUtf8();
        this.patternCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPut(String str) {
        str.getClass();
        this.patternCase_ = 3;
        this.pattern_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPutBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.pattern_ = h6.toStringUtf8();
        this.patternCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResponseBody(String str) {
        str.getClass();
        this.responseBody_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResponseBodyBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.responseBody_ = h6.toStringUtf8();
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

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (Y.f3987a[k22.ordinal()]) {
            case 1:
                return new HttpRule();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0001\u0000\u0001\f\n\u0000\u0001\u0000\u0001Ȉ\u0002Ȼ\u0000\u0003Ȼ\u0000\u0004Ȼ\u0000\u0005Ȼ\u0000\u0006Ȼ\u0000\u0007Ȉ\b<\u0000\u000b\u001b\fȈ", new Object[]{"pattern_", "patternCase_", "selector_", "body_", CustomHttpPattern.class, "additionalBindings_", HttpRule.class, "responseBody_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (HttpRule.class) {
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

    public HttpRule getAdditionalBindings(int i9) {
        return (HttpRule) this.additionalBindings_.get(i9);
    }

    public int getAdditionalBindingsCount() {
        return this.additionalBindings_.size();
    }

    public List<HttpRule> getAdditionalBindingsList() {
        return this.additionalBindings_;
    }

    public InterfaceC0349b0 getAdditionalBindingsOrBuilder(int i9) {
        return (InterfaceC0349b0) this.additionalBindings_.get(i9);
    }

    public List<? extends InterfaceC0349b0> getAdditionalBindingsOrBuilderList() {
        return this.additionalBindings_;
    }

    public String getBody() {
        return this.body_;
    }

    public H getBodyBytes() {
        return H.copyFromUtf8(this.body_);
    }

    public CustomHttpPattern getCustom() {
        if (this.patternCase_ == 8) {
            return (CustomHttpPattern) this.pattern_;
        }
        return CustomHttpPattern.getDefaultInstance();
    }

    public String getDelete() {
        if (this.patternCase_ == 5) {
            return (String) this.pattern_;
        }
        return "";
    }

    public H getDeleteBytes() {
        String str;
        if (this.patternCase_ == 5) {
            str = (String) this.pattern_;
        } else {
            str = "";
        }
        return H.copyFromUtf8(str);
    }

    public String getGet() {
        if (this.patternCase_ == 2) {
            return (String) this.pattern_;
        }
        return "";
    }

    public H getGetBytes() {
        String str;
        if (this.patternCase_ == 2) {
            str = (String) this.pattern_;
        } else {
            str = "";
        }
        return H.copyFromUtf8(str);
    }

    public String getPatch() {
        if (this.patternCase_ == 6) {
            return (String) this.pattern_;
        }
        return "";
    }

    public H getPatchBytes() {
        String str;
        if (this.patternCase_ == 6) {
            str = (String) this.pattern_;
        } else {
            str = "";
        }
        return H.copyFromUtf8(str);
    }

    public EnumC0347a0 getPatternCase() {
        int i9 = this.patternCase_;
        if (i9 != 0) {
            if (i9 != 8) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        if (i9 != 4) {
                            if (i9 != 5) {
                                if (i9 != 6) {
                                    return null;
                                }
                                return EnumC0347a0.f3993g;
                            }
                            return EnumC0347a0.f3992f;
                        }
                        return EnumC0347a0.f3991d;
                    }
                    return EnumC0347a0.f3990c;
                }
                return EnumC0347a0.b;
            }
            return EnumC0347a0.f3994h;
        }
        return EnumC0347a0.f3995i;
    }

    public String getPost() {
        if (this.patternCase_ == 4) {
            return (String) this.pattern_;
        }
        return "";
    }

    public H getPostBytes() {
        String str;
        if (this.patternCase_ == 4) {
            str = (String) this.pattern_;
        } else {
            str = "";
        }
        return H.copyFromUtf8(str);
    }

    public String getPut() {
        if (this.patternCase_ == 3) {
            return (String) this.pattern_;
        }
        return "";
    }

    public H getPutBytes() {
        String str;
        if (this.patternCase_ == 3) {
            str = (String) this.pattern_;
        } else {
            str = "";
        }
        return H.copyFromUtf8(str);
    }

    public String getResponseBody() {
        return this.responseBody_;
    }

    public H getResponseBodyBytes() {
        return H.copyFromUtf8(this.responseBody_);
    }

    public String getSelector() {
        return this.selector_;
    }

    public H getSelectorBytes() {
        return H.copyFromUtf8(this.selector_);
    }

    public boolean hasCustom() {
        if (this.patternCase_ == 8) {
            return true;
        }
        return false;
    }

    public static Z newBuilder(HttpRule httpRule) {
        return (Z) DEFAULT_INSTANCE.createBuilder(httpRule);
    }

    public static HttpRule parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (HttpRule) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static HttpRule parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (HttpRule) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static HttpRule parseFrom(H h6) throws C1912g3 {
        return (HttpRule) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAdditionalBindings(int i9, HttpRule httpRule) {
        httpRule.getClass();
        ensureAdditionalBindingsIsMutable();
        this.additionalBindings_.add(i9, httpRule);
    }

    public static HttpRule parseFrom(H h6, W1 w1) throws C1912g3 {
        return (HttpRule) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static HttpRule parseFrom(byte[] bArr) throws C1912g3 {
        return (HttpRule) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static HttpRule parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (HttpRule) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static HttpRule parseFrom(InputStream inputStream) throws IOException {
        return (HttpRule) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HttpRule parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (HttpRule) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static HttpRule parseFrom(S s5) throws IOException {
        return (HttpRule) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static HttpRule parseFrom(S s5, W1 w1) throws IOException {
        return (HttpRule) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
