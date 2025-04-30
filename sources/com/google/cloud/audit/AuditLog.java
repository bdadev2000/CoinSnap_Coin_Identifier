package com.google.cloud.audit;

import b4.AbstractC0569a;
import b4.C0570b;
import b4.C0572d;
import b4.g;
import b4.i;
import com.google.protobuf.AbstractC1880c;
import com.google.protobuf.Any;
import com.google.protobuf.C1912g3;
import com.google.protobuf.C1915h;
import com.google.protobuf.D2;
import com.google.protobuf.E2;
import com.google.protobuf.H;
import com.google.protobuf.InterfaceC1891d3;
import com.google.protobuf.InterfaceC1948l4;
import com.google.protobuf.K2;
import com.google.protobuf.L2;
import com.google.protobuf.O3;
import com.google.protobuf.S;
import com.google.protobuf.S4;
import com.google.protobuf.Struct;
import com.google.protobuf.W1;
import com.google.rpc.Status;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import w5.w;

/* loaded from: classes2.dex */
public final class AuditLog extends L2 implements O3 {
    public static final int AUTHENTICATION_INFO_FIELD_NUMBER = 3;
    public static final int AUTHORIZATION_INFO_FIELD_NUMBER = 9;
    private static final AuditLog DEFAULT_INSTANCE;
    public static final int METHOD_NAME_FIELD_NUMBER = 8;
    public static final int NUM_RESPONSE_ITEMS_FIELD_NUMBER = 12;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int REQUEST_FIELD_NUMBER = 16;
    public static final int REQUEST_METADATA_FIELD_NUMBER = 4;
    public static final int RESOURCE_NAME_FIELD_NUMBER = 11;
    public static final int RESPONSE_FIELD_NUMBER = 17;
    public static final int SERVICE_DATA_FIELD_NUMBER = 15;
    public static final int SERVICE_NAME_FIELD_NUMBER = 7;
    public static final int STATUS_FIELD_NUMBER = 2;
    private AuthenticationInfo authenticationInfo_;
    private long numResponseItems_;
    private RequestMetadata requestMetadata_;
    private Struct request_;
    private Struct response_;
    private Any serviceData_;
    private Status status_;
    private String serviceName_ = "";
    private String methodName_ = "";
    private String resourceName_ = "";
    private InterfaceC1891d3 authorizationInfo_ = L2.emptyProtobufList();

    static {
        AuditLog auditLog = new AuditLog();
        DEFAULT_INSTANCE = auditLog;
        L2.registerDefaultInstance(AuditLog.class, auditLog);
    }

    private AuditLog() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAuthorizationInfo(Iterable<? extends AuthorizationInfo> iterable) {
        ensureAuthorizationInfoIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.authorizationInfo_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAuthorizationInfo(AuthorizationInfo authorizationInfo) {
        authorizationInfo.getClass();
        ensureAuthorizationInfoIsMutable();
        this.authorizationInfo_.add(authorizationInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAuthenticationInfo() {
        this.authenticationInfo_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAuthorizationInfo() {
        this.authorizationInfo_ = L2.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMethodName() {
        this.methodName_ = getDefaultInstance().getMethodName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumResponseItems() {
        this.numResponseItems_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequest() {
        this.request_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequestMetadata() {
        this.requestMetadata_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResourceName() {
        this.resourceName_ = getDefaultInstance().getResourceName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResponse() {
        this.response_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearServiceData() {
        this.serviceData_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearServiceName() {
        this.serviceName_ = getDefaultInstance().getServiceName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatus() {
        this.status_ = null;
    }

    private void ensureAuthorizationInfoIsMutable() {
        InterfaceC1891d3 interfaceC1891d3 = this.authorizationInfo_;
        if (!interfaceC1891d3.isModifiable()) {
            this.authorizationInfo_ = L2.mutableCopy(interfaceC1891d3);
        }
    }

    public static AuditLog getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAuthenticationInfo(AuthenticationInfo authenticationInfo) {
        authenticationInfo.getClass();
        AuthenticationInfo authenticationInfo2 = this.authenticationInfo_;
        if (authenticationInfo2 != null && authenticationInfo2 != AuthenticationInfo.getDefaultInstance()) {
            this.authenticationInfo_ = (AuthenticationInfo) ((C0572d) AuthenticationInfo.newBuilder(this.authenticationInfo_).mergeFrom((L2) authenticationInfo)).buildPartial();
        } else {
            this.authenticationInfo_ = authenticationInfo;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRequest(Struct struct) {
        struct.getClass();
        Struct struct2 = this.request_;
        if (struct2 != null && struct2 != Struct.getDefaultInstance()) {
            this.request_ = (Struct) ((S4) Struct.newBuilder(this.request_).mergeFrom((L2) struct)).buildPartial();
        } else {
            this.request_ = struct;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRequestMetadata(RequestMetadata requestMetadata) {
        requestMetadata.getClass();
        RequestMetadata requestMetadata2 = this.requestMetadata_;
        if (requestMetadata2 != null && requestMetadata2 != RequestMetadata.getDefaultInstance()) {
            this.requestMetadata_ = (RequestMetadata) ((i) RequestMetadata.newBuilder(this.requestMetadata_).mergeFrom((L2) requestMetadata)).buildPartial();
        } else {
            this.requestMetadata_ = requestMetadata;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeResponse(Struct struct) {
        struct.getClass();
        Struct struct2 = this.response_;
        if (struct2 != null && struct2 != Struct.getDefaultInstance()) {
            this.response_ = (Struct) ((S4) Struct.newBuilder(this.response_).mergeFrom((L2) struct)).buildPartial();
        } else {
            this.response_ = struct;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeServiceData(Any any) {
        any.getClass();
        Any any2 = this.serviceData_;
        if (any2 != null && any2 != Any.getDefaultInstance()) {
            this.serviceData_ = (Any) ((C1915h) Any.newBuilder(this.serviceData_).mergeFrom((L2) any)).buildPartial();
        } else {
            this.serviceData_ = any;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStatus(Status status) {
        status.getClass();
        Status status2 = this.status_;
        if (status2 != null && status2 != Status.getDefaultInstance()) {
            this.status_ = (Status) ((w) Status.newBuilder(this.status_).mergeFrom((L2) status)).buildPartial();
        } else {
            this.status_ = status;
        }
    }

    public static C0570b newBuilder() {
        return (C0570b) DEFAULT_INSTANCE.createBuilder();
    }

    public static AuditLog parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AuditLog) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AuditLog parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (AuditLog) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAuthorizationInfo(int i9) {
        ensureAuthorizationInfoIsMutable();
        this.authorizationInfo_.remove(i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAuthenticationInfo(AuthenticationInfo authenticationInfo) {
        authenticationInfo.getClass();
        this.authenticationInfo_ = authenticationInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAuthorizationInfo(int i9, AuthorizationInfo authorizationInfo) {
        authorizationInfo.getClass();
        ensureAuthorizationInfoIsMutable();
        this.authorizationInfo_.set(i9, authorizationInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMethodName(String str) {
        str.getClass();
        this.methodName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMethodNameBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.methodName_ = h6.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumResponseItems(long j7) {
        this.numResponseItems_ = j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequest(Struct struct) {
        struct.getClass();
        this.request_ = struct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestMetadata(RequestMetadata requestMetadata) {
        requestMetadata.getClass();
        this.requestMetadata_ = requestMetadata;
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
    public void setResponse(Struct struct) {
        struct.getClass();
        this.response_ = struct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServiceData(Any any) {
        any.getClass();
        this.serviceData_ = any;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServiceName(String str) {
        str.getClass();
        this.serviceName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServiceNameBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.serviceName_ = h6.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(Status status) {
        status.getClass();
        this.status_ = status;
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (AbstractC0569a.f5316a[k22.ordinal()]) {
            case 1:
                return new AuditLog();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0000\u0002\u0011\u000b\u0000\u0001\u0000\u0002\t\u0003\t\u0004\t\u0007Ȉ\bȈ\t\u001b\u000bȈ\f\u0002\u000f\t\u0010\t\u0011\t", new Object[]{"status_", "authenticationInfo_", "requestMetadata_", "serviceName_", "methodName_", "authorizationInfo_", AuthorizationInfo.class, "resourceName_", "numResponseItems_", "serviceData_", "request_", "response_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (AuditLog.class) {
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

    public AuthenticationInfo getAuthenticationInfo() {
        AuthenticationInfo authenticationInfo = this.authenticationInfo_;
        if (authenticationInfo == null) {
            return AuthenticationInfo.getDefaultInstance();
        }
        return authenticationInfo;
    }

    public AuthorizationInfo getAuthorizationInfo(int i9) {
        return (AuthorizationInfo) this.authorizationInfo_.get(i9);
    }

    public int getAuthorizationInfoCount() {
        return this.authorizationInfo_.size();
    }

    public List<AuthorizationInfo> getAuthorizationInfoList() {
        return this.authorizationInfo_;
    }

    public g getAuthorizationInfoOrBuilder(int i9) {
        return (g) this.authorizationInfo_.get(i9);
    }

    public List<? extends g> getAuthorizationInfoOrBuilderList() {
        return this.authorizationInfo_;
    }

    public String getMethodName() {
        return this.methodName_;
    }

    public H getMethodNameBytes() {
        return H.copyFromUtf8(this.methodName_);
    }

    public long getNumResponseItems() {
        return this.numResponseItems_;
    }

    public Struct getRequest() {
        Struct struct = this.request_;
        if (struct == null) {
            return Struct.getDefaultInstance();
        }
        return struct;
    }

    public RequestMetadata getRequestMetadata() {
        RequestMetadata requestMetadata = this.requestMetadata_;
        if (requestMetadata == null) {
            return RequestMetadata.getDefaultInstance();
        }
        return requestMetadata;
    }

    public String getResourceName() {
        return this.resourceName_;
    }

    public H getResourceNameBytes() {
        return H.copyFromUtf8(this.resourceName_);
    }

    public Struct getResponse() {
        Struct struct = this.response_;
        if (struct == null) {
            return Struct.getDefaultInstance();
        }
        return struct;
    }

    public Any getServiceData() {
        Any any = this.serviceData_;
        if (any == null) {
            return Any.getDefaultInstance();
        }
        return any;
    }

    public String getServiceName() {
        return this.serviceName_;
    }

    public H getServiceNameBytes() {
        return H.copyFromUtf8(this.serviceName_);
    }

    public Status getStatus() {
        Status status = this.status_;
        if (status == null) {
            return Status.getDefaultInstance();
        }
        return status;
    }

    public boolean hasAuthenticationInfo() {
        if (this.authenticationInfo_ != null) {
            return true;
        }
        return false;
    }

    public boolean hasRequest() {
        if (this.request_ != null) {
            return true;
        }
        return false;
    }

    public boolean hasRequestMetadata() {
        if (this.requestMetadata_ != null) {
            return true;
        }
        return false;
    }

    public boolean hasResponse() {
        if (this.response_ != null) {
            return true;
        }
        return false;
    }

    public boolean hasServiceData() {
        if (this.serviceData_ != null) {
            return true;
        }
        return false;
    }

    public boolean hasStatus() {
        if (this.status_ != null) {
            return true;
        }
        return false;
    }

    public static C0570b newBuilder(AuditLog auditLog) {
        return (C0570b) DEFAULT_INSTANCE.createBuilder(auditLog);
    }

    public static AuditLog parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (AuditLog) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static AuditLog parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (AuditLog) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static AuditLog parseFrom(H h6) throws C1912g3 {
        return (AuditLog) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAuthorizationInfo(int i9, AuthorizationInfo authorizationInfo) {
        authorizationInfo.getClass();
        ensureAuthorizationInfoIsMutable();
        this.authorizationInfo_.add(i9, authorizationInfo);
    }

    public static AuditLog parseFrom(H h6, W1 w1) throws C1912g3 {
        return (AuditLog) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static AuditLog parseFrom(byte[] bArr) throws C1912g3 {
        return (AuditLog) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AuditLog parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (AuditLog) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static AuditLog parseFrom(InputStream inputStream) throws IOException {
        return (AuditLog) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AuditLog parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (AuditLog) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static AuditLog parseFrom(S s5) throws IOException {
        return (AuditLog) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static AuditLog parseFrom(S s5, W1 w1) throws IOException {
        return (AuditLog) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
