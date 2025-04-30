package com.google.rpc.context;

import com.google.protobuf.AbstractC1880c;
import com.google.protobuf.C1907f5;
import com.google.protobuf.C1912g3;
import com.google.protobuf.D2;
import com.google.protobuf.E2;
import com.google.protobuf.G3;
import com.google.protobuf.H;
import com.google.protobuf.InterfaceC1891d3;
import com.google.protobuf.InterfaceC1948l4;
import com.google.protobuf.K2;
import com.google.protobuf.L2;
import com.google.protobuf.O3;
import com.google.protobuf.S;
import com.google.protobuf.S4;
import com.google.protobuf.Struct;
import com.google.protobuf.Timestamp;
import com.google.protobuf.W1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import x5.AbstractC2924a;

/* loaded from: classes3.dex */
public final class AttributeContext extends L2 implements O3 {
    public static final int API_FIELD_NUMBER = 6;
    private static final AttributeContext DEFAULT_INSTANCE;
    public static final int DESTINATION_FIELD_NUMBER = 2;
    public static final int ORIGIN_FIELD_NUMBER = 7;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int REQUEST_FIELD_NUMBER = 3;
    public static final int RESOURCE_FIELD_NUMBER = 5;
    public static final int RESPONSE_FIELD_NUMBER = 4;
    public static final int SOURCE_FIELD_NUMBER = 1;
    private Api api_;
    private Peer destination_;
    private Peer origin_;
    private Request request_;
    private Resource resource_;
    private Response response_;
    private Peer source_;

    /* loaded from: classes3.dex */
    public static final class Api extends L2 implements O3 {
        private static final Api DEFAULT_INSTANCE;
        public static final int OPERATION_FIELD_NUMBER = 2;
        private static volatile InterfaceC1948l4 PARSER = null;
        public static final int PROTOCOL_FIELD_NUMBER = 3;
        public static final int SERVICE_FIELD_NUMBER = 1;
        public static final int VERSION_FIELD_NUMBER = 4;
        private String service_ = "";
        private String operation_ = "";
        private String protocol_ = "";
        private String version_ = "";

        static {
            Api api = new Api();
            DEFAULT_INSTANCE = api;
            L2.registerDefaultInstance(Api.class, api);
        }

        private Api() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOperation() {
            this.operation_ = getDefaultInstance().getOperation();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearProtocol() {
            this.protocol_ = getDefaultInstance().getProtocol();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearService() {
            this.service_ = getDefaultInstance().getService();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVersion() {
            this.version_ = getDefaultInstance().getVersion();
        }

        public static Api getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return (a) DEFAULT_INSTANCE.createBuilder();
        }

        public static Api parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Api) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Api parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
            return (Api) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static InterfaceC1948l4 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOperation(String str) {
            str.getClass();
            this.operation_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOperationBytes(H h6) {
            AbstractC1880c.checkByteStringIsUtf8(h6);
            this.operation_ = h6.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProtocol(String str) {
            str.getClass();
            this.protocol_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProtocolBytes(H h6) {
            AbstractC1880c.checkByteStringIsUtf8(h6);
            this.protocol_ = h6.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setService(String str) {
            str.getClass();
            this.service_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setServiceBytes(H h6) {
            AbstractC1880c.checkByteStringIsUtf8(h6);
            this.service_ = h6.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVersion(String str) {
            str.getClass();
            this.version_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVersionBytes(H h6) {
            AbstractC1880c.checkByteStringIsUtf8(h6);
            this.version_ = h6.toStringUtf8();
        }

        @Override // com.google.protobuf.L2
        public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
            switch (AbstractC2924a.f24235a[k22.ordinal()]) {
                case 1:
                    return new Api();
                case 2:
                    return new D2(DEFAULT_INSTANCE);
                case 3:
                    return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"service_", "operation_", "protocol_", "version_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    InterfaceC1948l4 interfaceC1948l4 = PARSER;
                    if (interfaceC1948l4 == null) {
                        synchronized (Api.class) {
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

        public String getOperation() {
            return this.operation_;
        }

        public H getOperationBytes() {
            return H.copyFromUtf8(this.operation_);
        }

        public String getProtocol() {
            return this.protocol_;
        }

        public H getProtocolBytes() {
            return H.copyFromUtf8(this.protocol_);
        }

        public String getService() {
            return this.service_;
        }

        public H getServiceBytes() {
            return H.copyFromUtf8(this.service_);
        }

        public String getVersion() {
            return this.version_;
        }

        public H getVersionBytes() {
            return H.copyFromUtf8(this.version_);
        }

        public static a newBuilder(Api api) {
            return (a) DEFAULT_INSTANCE.createBuilder(api);
        }

        public static Api parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
            return (Api) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
        }

        public static Api parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
            return (Api) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
        }

        public static Api parseFrom(H h6) throws C1912g3 {
            return (Api) L2.parseFrom(DEFAULT_INSTANCE, h6);
        }

        public static Api parseFrom(H h6, W1 w1) throws C1912g3 {
            return (Api) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
        }

        public static Api parseFrom(byte[] bArr) throws C1912g3 {
            return (Api) L2.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Api parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
            return (Api) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
        }

        public static Api parseFrom(InputStream inputStream) throws IOException {
            return (Api) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Api parseFrom(InputStream inputStream, W1 w1) throws IOException {
            return (Api) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
        }

        public static Api parseFrom(S s5) throws IOException {
            return (Api) L2.parseFrom(DEFAULT_INSTANCE, s5);
        }

        public static Api parseFrom(S s5, W1 w1) throws IOException {
            return (Api) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
        }
    }

    /* loaded from: classes3.dex */
    public static final class Auth extends L2 implements O3 {
        public static final int ACCESS_LEVELS_FIELD_NUMBER = 5;
        public static final int AUDIENCES_FIELD_NUMBER = 2;
        public static final int CLAIMS_FIELD_NUMBER = 4;
        private static final Auth DEFAULT_INSTANCE;
        private static volatile InterfaceC1948l4 PARSER = null;
        public static final int PRESENTER_FIELD_NUMBER = 3;
        public static final int PRINCIPAL_FIELD_NUMBER = 1;
        private Struct claims_;
        private String principal_ = "";
        private InterfaceC1891d3 audiences_ = L2.emptyProtobufList();
        private String presenter_ = "";
        private InterfaceC1891d3 accessLevels_ = L2.emptyProtobufList();

        static {
            Auth auth = new Auth();
            DEFAULT_INSTANCE = auth;
            L2.registerDefaultInstance(Auth.class, auth);
        }

        private Auth() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAccessLevels(String str) {
            str.getClass();
            ensureAccessLevelsIsMutable();
            this.accessLevels_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAccessLevelsBytes(H h6) {
            AbstractC1880c.checkByteStringIsUtf8(h6);
            ensureAccessLevelsIsMutable();
            this.accessLevels_.add(h6.toStringUtf8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllAccessLevels(Iterable<String> iterable) {
            ensureAccessLevelsIsMutable();
            AbstractC1880c.addAll((Iterable) iterable, (List) this.accessLevels_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllAudiences(Iterable<String> iterable) {
            ensureAudiencesIsMutable();
            AbstractC1880c.addAll((Iterable) iterable, (List) this.audiences_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAudiences(String str) {
            str.getClass();
            ensureAudiencesIsMutable();
            this.audiences_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAudiencesBytes(H h6) {
            AbstractC1880c.checkByteStringIsUtf8(h6);
            ensureAudiencesIsMutable();
            this.audiences_.add(h6.toStringUtf8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAccessLevels() {
            this.accessLevels_ = L2.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAudiences() {
            this.audiences_ = L2.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearClaims() {
            this.claims_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPresenter() {
            this.presenter_ = getDefaultInstance().getPresenter();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPrincipal() {
            this.principal_ = getDefaultInstance().getPrincipal();
        }

        private void ensureAccessLevelsIsMutable() {
            InterfaceC1891d3 interfaceC1891d3 = this.accessLevels_;
            if (!interfaceC1891d3.isModifiable()) {
                this.accessLevels_ = L2.mutableCopy(interfaceC1891d3);
            }
        }

        private void ensureAudiencesIsMutable() {
            InterfaceC1891d3 interfaceC1891d3 = this.audiences_;
            if (!interfaceC1891d3.isModifiable()) {
                this.audiences_ = L2.mutableCopy(interfaceC1891d3);
            }
        }

        public static Auth getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeClaims(Struct struct) {
            struct.getClass();
            Struct struct2 = this.claims_;
            if (struct2 != null && struct2 != Struct.getDefaultInstance()) {
                this.claims_ = (Struct) ((S4) Struct.newBuilder(this.claims_).mergeFrom((L2) struct)).buildPartial();
            } else {
                this.claims_ = struct;
            }
        }

        public static b newBuilder() {
            return (b) DEFAULT_INSTANCE.createBuilder();
        }

        public static Auth parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Auth) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Auth parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
            return (Auth) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static InterfaceC1948l4 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAccessLevels(int i9, String str) {
            str.getClass();
            ensureAccessLevelsIsMutable();
            this.accessLevels_.set(i9, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAudiences(int i9, String str) {
            str.getClass();
            ensureAudiencesIsMutable();
            this.audiences_.set(i9, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClaims(Struct struct) {
            struct.getClass();
            this.claims_ = struct;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPresenter(String str) {
            str.getClass();
            this.presenter_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPresenterBytes(H h6) {
            AbstractC1880c.checkByteStringIsUtf8(h6);
            this.presenter_ = h6.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPrincipal(String str) {
            str.getClass();
            this.principal_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPrincipalBytes(H h6) {
            AbstractC1880c.checkByteStringIsUtf8(h6);
            this.principal_ = h6.toStringUtf8();
        }

        @Override // com.google.protobuf.L2
        public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
            switch (AbstractC2924a.f24235a[k22.ordinal()]) {
                case 1:
                    return new Auth();
                case 2:
                    return new D2(DEFAULT_INSTANCE);
                case 3:
                    return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0002\u0000\u0001Ȉ\u0002Ț\u0003Ȉ\u0004\t\u0005Ț", new Object[]{"principal_", "audiences_", "presenter_", "claims_", "accessLevels_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    InterfaceC1948l4 interfaceC1948l4 = PARSER;
                    if (interfaceC1948l4 == null) {
                        synchronized (Auth.class) {
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

        public String getAccessLevels(int i9) {
            return (String) this.accessLevels_.get(i9);
        }

        public H getAccessLevelsBytes(int i9) {
            return H.copyFromUtf8((String) this.accessLevels_.get(i9));
        }

        public int getAccessLevelsCount() {
            return this.accessLevels_.size();
        }

        public List<String> getAccessLevelsList() {
            return this.accessLevels_;
        }

        public String getAudiences(int i9) {
            return (String) this.audiences_.get(i9);
        }

        public H getAudiencesBytes(int i9) {
            return H.copyFromUtf8((String) this.audiences_.get(i9));
        }

        public int getAudiencesCount() {
            return this.audiences_.size();
        }

        public List<String> getAudiencesList() {
            return this.audiences_;
        }

        public Struct getClaims() {
            Struct struct = this.claims_;
            if (struct == null) {
                return Struct.getDefaultInstance();
            }
            return struct;
        }

        public String getPresenter() {
            return this.presenter_;
        }

        public H getPresenterBytes() {
            return H.copyFromUtf8(this.presenter_);
        }

        public String getPrincipal() {
            return this.principal_;
        }

        public H getPrincipalBytes() {
            return H.copyFromUtf8(this.principal_);
        }

        public boolean hasClaims() {
            if (this.claims_ != null) {
                return true;
            }
            return false;
        }

        public static b newBuilder(Auth auth) {
            return (b) DEFAULT_INSTANCE.createBuilder(auth);
        }

        public static Auth parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
            return (Auth) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
        }

        public static Auth parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
            return (Auth) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
        }

        public static Auth parseFrom(H h6) throws C1912g3 {
            return (Auth) L2.parseFrom(DEFAULT_INSTANCE, h6);
        }

        public static Auth parseFrom(H h6, W1 w1) throws C1912g3 {
            return (Auth) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
        }

        public static Auth parseFrom(byte[] bArr) throws C1912g3 {
            return (Auth) L2.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Auth parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
            return (Auth) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
        }

        public static Auth parseFrom(InputStream inputStream) throws IOException {
            return (Auth) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Auth parseFrom(InputStream inputStream, W1 w1) throws IOException {
            return (Auth) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
        }

        public static Auth parseFrom(S s5) throws IOException {
            return (Auth) L2.parseFrom(DEFAULT_INSTANCE, s5);
        }

        public static Auth parseFrom(S s5, W1 w1) throws IOException {
            return (Auth) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
        }
    }

    /* loaded from: classes3.dex */
    public static final class Peer extends L2 implements O3 {
        private static final Peer DEFAULT_INSTANCE;
        public static final int IP_FIELD_NUMBER = 1;
        public static final int LABELS_FIELD_NUMBER = 6;
        private static volatile InterfaceC1948l4 PARSER = null;
        public static final int PORT_FIELD_NUMBER = 2;
        public static final int PRINCIPAL_FIELD_NUMBER = 7;
        public static final int REGION_CODE_FIELD_NUMBER = 8;
        private long port_;
        private G3 labels_ = G3.emptyMapField();
        private String ip_ = "";
        private String principal_ = "";
        private String regionCode_ = "";

        static {
            Peer peer = new Peer();
            DEFAULT_INSTANCE = peer;
            L2.registerDefaultInstance(Peer.class, peer);
        }

        private Peer() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIp() {
            this.ip_ = getDefaultInstance().getIp();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPort() {
            this.port_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPrincipal() {
            this.principal_ = getDefaultInstance().getPrincipal();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRegionCode() {
            this.regionCode_ = getDefaultInstance().getRegionCode();
        }

        public static Peer getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<String, String> getMutableLabelsMap() {
            return internalGetMutableLabels();
        }

        private G3 internalGetLabels() {
            return this.labels_;
        }

        private G3 internalGetMutableLabels() {
            if (!this.labels_.isMutable()) {
                this.labels_ = this.labels_.mutableCopy();
            }
            return this.labels_;
        }

        public static d newBuilder() {
            return (d) DEFAULT_INSTANCE.createBuilder();
        }

        public static Peer parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Peer) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Peer parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
            return (Peer) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static InterfaceC1948l4 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIp(String str) {
            str.getClass();
            this.ip_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIpBytes(H h6) {
            AbstractC1880c.checkByteStringIsUtf8(h6);
            this.ip_ = h6.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPort(long j7) {
            this.port_ = j7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPrincipal(String str) {
            str.getClass();
            this.principal_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPrincipalBytes(H h6) {
            AbstractC1880c.checkByteStringIsUtf8(h6);
            this.principal_ = h6.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRegionCode(String str) {
            str.getClass();
            this.regionCode_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRegionCodeBytes(H h6) {
            AbstractC1880c.checkByteStringIsUtf8(h6);
            this.regionCode_ = h6.toStringUtf8();
        }

        public boolean containsLabels(String str) {
            str.getClass();
            return internalGetLabels().containsKey(str);
        }

        @Override // com.google.protobuf.L2
        public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
            switch (AbstractC2924a.f24235a[k22.ordinal()]) {
                case 1:
                    return new Peer();
                case 2:
                    return new D2(DEFAULT_INSTANCE);
                case 3:
                    return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\b\u0005\u0001\u0000\u0000\u0001Ȉ\u0002\u0002\u00062\u0007Ȉ\bȈ", new Object[]{"ip_", "port_", "labels_", e.f14382a, "principal_", "regionCode_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    InterfaceC1948l4 interfaceC1948l4 = PARSER;
                    if (interfaceC1948l4 == null) {
                        synchronized (Peer.class) {
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

        public String getIp() {
            return this.ip_;
        }

        public H getIpBytes() {
            return H.copyFromUtf8(this.ip_);
        }

        @Deprecated
        public Map<String, String> getLabels() {
            return getLabelsMap();
        }

        public int getLabelsCount() {
            return internalGetLabels().size();
        }

        public Map<String, String> getLabelsMap() {
            return Collections.unmodifiableMap(internalGetLabels());
        }

        public String getLabelsOrDefault(String str, String str2) {
            str.getClass();
            G3 internalGetLabels = internalGetLabels();
            if (internalGetLabels.containsKey(str)) {
                return (String) internalGetLabels.get(str);
            }
            return str2;
        }

        public String getLabelsOrThrow(String str) {
            str.getClass();
            G3 internalGetLabels = internalGetLabels();
            if (internalGetLabels.containsKey(str)) {
                return (String) internalGetLabels.get(str);
            }
            throw new IllegalArgumentException();
        }

        public long getPort() {
            return this.port_;
        }

        public String getPrincipal() {
            return this.principal_;
        }

        public H getPrincipalBytes() {
            return H.copyFromUtf8(this.principal_);
        }

        public String getRegionCode() {
            return this.regionCode_;
        }

        public H getRegionCodeBytes() {
            return H.copyFromUtf8(this.regionCode_);
        }

        public static d newBuilder(Peer peer) {
            return (d) DEFAULT_INSTANCE.createBuilder(peer);
        }

        public static Peer parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
            return (Peer) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
        }

        public static Peer parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
            return (Peer) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
        }

        public static Peer parseFrom(H h6) throws C1912g3 {
            return (Peer) L2.parseFrom(DEFAULT_INSTANCE, h6);
        }

        public static Peer parseFrom(H h6, W1 w1) throws C1912g3 {
            return (Peer) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
        }

        public static Peer parseFrom(byte[] bArr) throws C1912g3 {
            return (Peer) L2.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Peer parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
            return (Peer) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
        }

        public static Peer parseFrom(InputStream inputStream) throws IOException {
            return (Peer) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Peer parseFrom(InputStream inputStream, W1 w1) throws IOException {
            return (Peer) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
        }

        public static Peer parseFrom(S s5) throws IOException {
            return (Peer) L2.parseFrom(DEFAULT_INSTANCE, s5);
        }

        public static Peer parseFrom(S s5, W1 w1) throws IOException {
            return (Peer) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
        }
    }

    /* loaded from: classes3.dex */
    public static final class Request extends L2 implements O3 {
        public static final int AUTH_FIELD_NUMBER = 13;
        private static final Request DEFAULT_INSTANCE;
        public static final int HEADERS_FIELD_NUMBER = 3;
        public static final int HOST_FIELD_NUMBER = 5;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int METHOD_FIELD_NUMBER = 2;
        private static volatile InterfaceC1948l4 PARSER = null;
        public static final int PATH_FIELD_NUMBER = 4;
        public static final int PROTOCOL_FIELD_NUMBER = 11;
        public static final int QUERY_FIELD_NUMBER = 7;
        public static final int REASON_FIELD_NUMBER = 12;
        public static final int SCHEME_FIELD_NUMBER = 6;
        public static final int SIZE_FIELD_NUMBER = 10;
        public static final int TIME_FIELD_NUMBER = 9;
        private Auth auth_;
        private long size_;
        private Timestamp time_;
        private G3 headers_ = G3.emptyMapField();
        private String id_ = "";
        private String method_ = "";
        private String path_ = "";
        private String host_ = "";
        private String scheme_ = "";
        private String query_ = "";
        private String protocol_ = "";
        private String reason_ = "";

        static {
            Request request = new Request();
            DEFAULT_INSTANCE = request;
            L2.registerDefaultInstance(Request.class, request);
        }

        private Request() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAuth() {
            this.auth_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHost() {
            this.host_ = getDefaultInstance().getHost();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearId() {
            this.id_ = getDefaultInstance().getId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMethod() {
            this.method_ = getDefaultInstance().getMethod();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPath() {
            this.path_ = getDefaultInstance().getPath();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearProtocol() {
            this.protocol_ = getDefaultInstance().getProtocol();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearQuery() {
            this.query_ = getDefaultInstance().getQuery();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearReason() {
            this.reason_ = getDefaultInstance().getReason();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearScheme() {
            this.scheme_ = getDefaultInstance().getScheme();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSize() {
            this.size_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTime() {
            this.time_ = null;
        }

        public static Request getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<String, String> getMutableHeadersMap() {
            return internalGetMutableHeaders();
        }

        private G3 internalGetHeaders() {
            return this.headers_;
        }

        private G3 internalGetMutableHeaders() {
            if (!this.headers_.isMutable()) {
                this.headers_ = this.headers_.mutableCopy();
            }
            return this.headers_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeAuth(Auth auth) {
            auth.getClass();
            Auth auth2 = this.auth_;
            if (auth2 != null && auth2 != Auth.getDefaultInstance()) {
                this.auth_ = (Auth) ((b) Auth.newBuilder(this.auth_).mergeFrom((L2) auth)).buildPartial();
            } else {
                this.auth_ = auth;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeTime(Timestamp timestamp) {
            timestamp.getClass();
            Timestamp timestamp2 = this.time_;
            if (timestamp2 != null && timestamp2 != Timestamp.getDefaultInstance()) {
                this.time_ = (Timestamp) ((C1907f5) Timestamp.newBuilder(this.time_).mergeFrom((L2) timestamp)).buildPartial();
            } else {
                this.time_ = timestamp;
            }
        }

        public static f newBuilder() {
            return (f) DEFAULT_INSTANCE.createBuilder();
        }

        public static Request parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Request) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Request parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
            return (Request) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static InterfaceC1948l4 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAuth(Auth auth) {
            auth.getClass();
            this.auth_ = auth;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHost(String str) {
            str.getClass();
            this.host_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHostBytes(H h6) {
            AbstractC1880c.checkByteStringIsUtf8(h6);
            this.host_ = h6.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setId(String str) {
            str.getClass();
            this.id_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdBytes(H h6) {
            AbstractC1880c.checkByteStringIsUtf8(h6);
            this.id_ = h6.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMethod(String str) {
            str.getClass();
            this.method_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMethodBytes(H h6) {
            AbstractC1880c.checkByteStringIsUtf8(h6);
            this.method_ = h6.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPath(String str) {
            str.getClass();
            this.path_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPathBytes(H h6) {
            AbstractC1880c.checkByteStringIsUtf8(h6);
            this.path_ = h6.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProtocol(String str) {
            str.getClass();
            this.protocol_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProtocolBytes(H h6) {
            AbstractC1880c.checkByteStringIsUtf8(h6);
            this.protocol_ = h6.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setQuery(String str) {
            str.getClass();
            this.query_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setQueryBytes(H h6) {
            AbstractC1880c.checkByteStringIsUtf8(h6);
            this.query_ = h6.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReason(String str) {
            str.getClass();
            this.reason_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReasonBytes(H h6) {
            AbstractC1880c.checkByteStringIsUtf8(h6);
            this.reason_ = h6.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setScheme(String str) {
            str.getClass();
            this.scheme_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSchemeBytes(H h6) {
            AbstractC1880c.checkByteStringIsUtf8(h6);
            this.scheme_ = h6.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSize(long j7) {
            this.size_ = j7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTime(Timestamp timestamp) {
            timestamp.getClass();
            this.time_ = timestamp;
        }

        public boolean containsHeaders(String str) {
            str.getClass();
            return internalGetHeaders().containsKey(str);
        }

        @Override // com.google.protobuf.L2
        public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
            switch (AbstractC2924a.f24235a[k22.ordinal()]) {
                case 1:
                    return new Request();
                case 2:
                    return new D2(DEFAULT_INSTANCE);
                case 3:
                    return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0000\u0000\u0001\r\f\u0001\u0000\u0000\u0001Ȉ\u0002Ȉ\u00032\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\t\t\n\u0002\u000bȈ\fȈ\r\t", new Object[]{"id_", "method_", "headers_", g.f14383a, "path_", "host_", "scheme_", "query_", "time_", "size_", "protocol_", "reason_", "auth_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    InterfaceC1948l4 interfaceC1948l4 = PARSER;
                    if (interfaceC1948l4 == null) {
                        synchronized (Request.class) {
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

        public Auth getAuth() {
            Auth auth = this.auth_;
            if (auth == null) {
                return Auth.getDefaultInstance();
            }
            return auth;
        }

        @Deprecated
        public Map<String, String> getHeaders() {
            return getHeadersMap();
        }

        public int getHeadersCount() {
            return internalGetHeaders().size();
        }

        public Map<String, String> getHeadersMap() {
            return Collections.unmodifiableMap(internalGetHeaders());
        }

        public String getHeadersOrDefault(String str, String str2) {
            str.getClass();
            G3 internalGetHeaders = internalGetHeaders();
            if (internalGetHeaders.containsKey(str)) {
                return (String) internalGetHeaders.get(str);
            }
            return str2;
        }

        public String getHeadersOrThrow(String str) {
            str.getClass();
            G3 internalGetHeaders = internalGetHeaders();
            if (internalGetHeaders.containsKey(str)) {
                return (String) internalGetHeaders.get(str);
            }
            throw new IllegalArgumentException();
        }

        public String getHost() {
            return this.host_;
        }

        public H getHostBytes() {
            return H.copyFromUtf8(this.host_);
        }

        public String getId() {
            return this.id_;
        }

        public H getIdBytes() {
            return H.copyFromUtf8(this.id_);
        }

        public String getMethod() {
            return this.method_;
        }

        public H getMethodBytes() {
            return H.copyFromUtf8(this.method_);
        }

        public String getPath() {
            return this.path_;
        }

        public H getPathBytes() {
            return H.copyFromUtf8(this.path_);
        }

        public String getProtocol() {
            return this.protocol_;
        }

        public H getProtocolBytes() {
            return H.copyFromUtf8(this.protocol_);
        }

        public String getQuery() {
            return this.query_;
        }

        public H getQueryBytes() {
            return H.copyFromUtf8(this.query_);
        }

        public String getReason() {
            return this.reason_;
        }

        public H getReasonBytes() {
            return H.copyFromUtf8(this.reason_);
        }

        public String getScheme() {
            return this.scheme_;
        }

        public H getSchemeBytes() {
            return H.copyFromUtf8(this.scheme_);
        }

        public long getSize() {
            return this.size_;
        }

        public Timestamp getTime() {
            Timestamp timestamp = this.time_;
            if (timestamp == null) {
                return Timestamp.getDefaultInstance();
            }
            return timestamp;
        }

        public boolean hasAuth() {
            if (this.auth_ != null) {
                return true;
            }
            return false;
        }

        public boolean hasTime() {
            if (this.time_ != null) {
                return true;
            }
            return false;
        }

        public static f newBuilder(Request request) {
            return (f) DEFAULT_INSTANCE.createBuilder(request);
        }

        public static Request parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
            return (Request) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
        }

        public static Request parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
            return (Request) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
        }

        public static Request parseFrom(H h6) throws C1912g3 {
            return (Request) L2.parseFrom(DEFAULT_INSTANCE, h6);
        }

        public static Request parseFrom(H h6, W1 w1) throws C1912g3 {
            return (Request) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
        }

        public static Request parseFrom(byte[] bArr) throws C1912g3 {
            return (Request) L2.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Request parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
            return (Request) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
        }

        public static Request parseFrom(InputStream inputStream) throws IOException {
            return (Request) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Request parseFrom(InputStream inputStream, W1 w1) throws IOException {
            return (Request) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
        }

        public static Request parseFrom(S s5) throws IOException {
            return (Request) L2.parseFrom(DEFAULT_INSTANCE, s5);
        }

        public static Request parseFrom(S s5, W1 w1) throws IOException {
            return (Request) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
        }
    }

    /* loaded from: classes3.dex */
    public static final class Resource extends L2 implements O3 {
        private static final Resource DEFAULT_INSTANCE;
        public static final int LABELS_FIELD_NUMBER = 4;
        public static final int NAME_FIELD_NUMBER = 2;
        private static volatile InterfaceC1948l4 PARSER = null;
        public static final int SERVICE_FIELD_NUMBER = 1;
        public static final int TYPE_FIELD_NUMBER = 3;
        private G3 labels_ = G3.emptyMapField();
        private String service_ = "";
        private String name_ = "";
        private String type_ = "";

        static {
            Resource resource = new Resource();
            DEFAULT_INSTANCE = resource;
            L2.registerDefaultInstance(Resource.class, resource);
        }

        private Resource() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.name_ = getDefaultInstance().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearService() {
            this.service_ = getDefaultInstance().getService();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = getDefaultInstance().getType();
        }

        public static Resource getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<String, String> getMutableLabelsMap() {
            return internalGetMutableLabels();
        }

        private G3 internalGetLabels() {
            return this.labels_;
        }

        private G3 internalGetMutableLabels() {
            if (!this.labels_.isMutable()) {
                this.labels_ = this.labels_.mutableCopy();
            }
            return this.labels_;
        }

        public static h newBuilder() {
            return (h) DEFAULT_INSTANCE.createBuilder();
        }

        public static Resource parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Resource) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Resource parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
            return (Resource) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static InterfaceC1948l4 parser() {
            return DEFAULT_INSTANCE.getParserForType();
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
        public void setService(String str) {
            str.getClass();
            this.service_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setServiceBytes(H h6) {
            AbstractC1880c.checkByteStringIsUtf8(h6);
            this.service_ = h6.toStringUtf8();
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

        public boolean containsLabels(String str) {
            str.getClass();
            return internalGetLabels().containsKey(str);
        }

        @Override // com.google.protobuf.L2
        public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
            switch (AbstractC2924a.f24235a[k22.ordinal()]) {
                case 1:
                    return new Resource();
                case 2:
                    return new D2(DEFAULT_INSTANCE);
                case 3:
                    return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u00042", new Object[]{"service_", "name_", "type_", "labels_", i.f14384a});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    InterfaceC1948l4 interfaceC1948l4 = PARSER;
                    if (interfaceC1948l4 == null) {
                        synchronized (Resource.class) {
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

        @Deprecated
        public Map<String, String> getLabels() {
            return getLabelsMap();
        }

        public int getLabelsCount() {
            return internalGetLabels().size();
        }

        public Map<String, String> getLabelsMap() {
            return Collections.unmodifiableMap(internalGetLabels());
        }

        public String getLabelsOrDefault(String str, String str2) {
            str.getClass();
            G3 internalGetLabels = internalGetLabels();
            if (internalGetLabels.containsKey(str)) {
                return (String) internalGetLabels.get(str);
            }
            return str2;
        }

        public String getLabelsOrThrow(String str) {
            str.getClass();
            G3 internalGetLabels = internalGetLabels();
            if (internalGetLabels.containsKey(str)) {
                return (String) internalGetLabels.get(str);
            }
            throw new IllegalArgumentException();
        }

        public String getName() {
            return this.name_;
        }

        public H getNameBytes() {
            return H.copyFromUtf8(this.name_);
        }

        public String getService() {
            return this.service_;
        }

        public H getServiceBytes() {
            return H.copyFromUtf8(this.service_);
        }

        public String getType() {
            return this.type_;
        }

        public H getTypeBytes() {
            return H.copyFromUtf8(this.type_);
        }

        public static h newBuilder(Resource resource) {
            return (h) DEFAULT_INSTANCE.createBuilder(resource);
        }

        public static Resource parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
            return (Resource) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
        }

        public static Resource parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
            return (Resource) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
        }

        public static Resource parseFrom(H h6) throws C1912g3 {
            return (Resource) L2.parseFrom(DEFAULT_INSTANCE, h6);
        }

        public static Resource parseFrom(H h6, W1 w1) throws C1912g3 {
            return (Resource) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
        }

        public static Resource parseFrom(byte[] bArr) throws C1912g3 {
            return (Resource) L2.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Resource parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
            return (Resource) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
        }

        public static Resource parseFrom(InputStream inputStream) throws IOException {
            return (Resource) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Resource parseFrom(InputStream inputStream, W1 w1) throws IOException {
            return (Resource) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
        }

        public static Resource parseFrom(S s5) throws IOException {
            return (Resource) L2.parseFrom(DEFAULT_INSTANCE, s5);
        }

        public static Resource parseFrom(S s5, W1 w1) throws IOException {
            return (Resource) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
        }
    }

    /* loaded from: classes3.dex */
    public static final class Response extends L2 implements O3 {
        public static final int CODE_FIELD_NUMBER = 1;
        private static final Response DEFAULT_INSTANCE;
        public static final int HEADERS_FIELD_NUMBER = 3;
        private static volatile InterfaceC1948l4 PARSER = null;
        public static final int SIZE_FIELD_NUMBER = 2;
        public static final int TIME_FIELD_NUMBER = 4;
        private long code_;
        private G3 headers_ = G3.emptyMapField();
        private long size_;
        private Timestamp time_;

        static {
            Response response = new Response();
            DEFAULT_INSTANCE = response;
            L2.registerDefaultInstance(Response.class, response);
        }

        private Response() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCode() {
            this.code_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSize() {
            this.size_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTime() {
            this.time_ = null;
        }

        public static Response getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<String, String> getMutableHeadersMap() {
            return internalGetMutableHeaders();
        }

        private G3 internalGetHeaders() {
            return this.headers_;
        }

        private G3 internalGetMutableHeaders() {
            if (!this.headers_.isMutable()) {
                this.headers_ = this.headers_.mutableCopy();
            }
            return this.headers_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeTime(Timestamp timestamp) {
            timestamp.getClass();
            Timestamp timestamp2 = this.time_;
            if (timestamp2 != null && timestamp2 != Timestamp.getDefaultInstance()) {
                this.time_ = (Timestamp) ((C1907f5) Timestamp.newBuilder(this.time_).mergeFrom((L2) timestamp)).buildPartial();
            } else {
                this.time_ = timestamp;
            }
        }

        public static j newBuilder() {
            return (j) DEFAULT_INSTANCE.createBuilder();
        }

        public static Response parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Response) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Response parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
            return (Response) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static InterfaceC1948l4 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCode(long j7) {
            this.code_ = j7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSize(long j7) {
            this.size_ = j7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTime(Timestamp timestamp) {
            timestamp.getClass();
            this.time_ = timestamp;
        }

        public boolean containsHeaders(String str) {
            str.getClass();
            return internalGetHeaders().containsKey(str);
        }

        @Override // com.google.protobuf.L2
        public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
            switch (AbstractC2924a.f24235a[k22.ordinal()]) {
                case 1:
                    return new Response();
                case 2:
                    return new D2(DEFAULT_INSTANCE);
                case 3:
                    return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001\u0002\u0002\u0002\u00032\u0004\t", new Object[]{"code_", "size_", "headers_", k.f14385a, "time_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    InterfaceC1948l4 interfaceC1948l4 = PARSER;
                    if (interfaceC1948l4 == null) {
                        synchronized (Response.class) {
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

        public long getCode() {
            return this.code_;
        }

        @Deprecated
        public Map<String, String> getHeaders() {
            return getHeadersMap();
        }

        public int getHeadersCount() {
            return internalGetHeaders().size();
        }

        public Map<String, String> getHeadersMap() {
            return Collections.unmodifiableMap(internalGetHeaders());
        }

        public String getHeadersOrDefault(String str, String str2) {
            str.getClass();
            G3 internalGetHeaders = internalGetHeaders();
            if (internalGetHeaders.containsKey(str)) {
                return (String) internalGetHeaders.get(str);
            }
            return str2;
        }

        public String getHeadersOrThrow(String str) {
            str.getClass();
            G3 internalGetHeaders = internalGetHeaders();
            if (internalGetHeaders.containsKey(str)) {
                return (String) internalGetHeaders.get(str);
            }
            throw new IllegalArgumentException();
        }

        public long getSize() {
            return this.size_;
        }

        public Timestamp getTime() {
            Timestamp timestamp = this.time_;
            if (timestamp == null) {
                return Timestamp.getDefaultInstance();
            }
            return timestamp;
        }

        public boolean hasTime() {
            if (this.time_ != null) {
                return true;
            }
            return false;
        }

        public static j newBuilder(Response response) {
            return (j) DEFAULT_INSTANCE.createBuilder(response);
        }

        public static Response parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
            return (Response) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
        }

        public static Response parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
            return (Response) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
        }

        public static Response parseFrom(H h6) throws C1912g3 {
            return (Response) L2.parseFrom(DEFAULT_INSTANCE, h6);
        }

        public static Response parseFrom(H h6, W1 w1) throws C1912g3 {
            return (Response) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
        }

        public static Response parseFrom(byte[] bArr) throws C1912g3 {
            return (Response) L2.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Response parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
            return (Response) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
        }

        public static Response parseFrom(InputStream inputStream) throws IOException {
            return (Response) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Response parseFrom(InputStream inputStream, W1 w1) throws IOException {
            return (Response) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
        }

        public static Response parseFrom(S s5) throws IOException {
            return (Response) L2.parseFrom(DEFAULT_INSTANCE, s5);
        }

        public static Response parseFrom(S s5, W1 w1) throws IOException {
            return (Response) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
        }
    }

    static {
        AttributeContext attributeContext = new AttributeContext();
        DEFAULT_INSTANCE = attributeContext;
        L2.registerDefaultInstance(AttributeContext.class, attributeContext);
    }

    private AttributeContext() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearApi() {
        this.api_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDestination() {
        this.destination_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOrigin() {
        this.origin_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequest() {
        this.request_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResource() {
        this.resource_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResponse() {
        this.response_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSource() {
        this.source_ = null;
    }

    public static AttributeContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeApi(Api api) {
        api.getClass();
        Api api2 = this.api_;
        if (api2 != null && api2 != Api.getDefaultInstance()) {
            this.api_ = (Api) ((a) Api.newBuilder(this.api_).mergeFrom((L2) api)).buildPartial();
        } else {
            this.api_ = api;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDestination(Peer peer) {
        peer.getClass();
        Peer peer2 = this.destination_;
        if (peer2 != null && peer2 != Peer.getDefaultInstance()) {
            this.destination_ = (Peer) ((d) Peer.newBuilder(this.destination_).mergeFrom((L2) peer)).buildPartial();
        } else {
            this.destination_ = peer;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOrigin(Peer peer) {
        peer.getClass();
        Peer peer2 = this.origin_;
        if (peer2 != null && peer2 != Peer.getDefaultInstance()) {
            this.origin_ = (Peer) ((d) Peer.newBuilder(this.origin_).mergeFrom((L2) peer)).buildPartial();
        } else {
            this.origin_ = peer;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRequest(Request request) {
        request.getClass();
        Request request2 = this.request_;
        if (request2 != null && request2 != Request.getDefaultInstance()) {
            this.request_ = (Request) ((f) Request.newBuilder(this.request_).mergeFrom((L2) request)).buildPartial();
        } else {
            this.request_ = request;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeResource(Resource resource) {
        resource.getClass();
        Resource resource2 = this.resource_;
        if (resource2 != null && resource2 != Resource.getDefaultInstance()) {
            this.resource_ = (Resource) ((h) Resource.newBuilder(this.resource_).mergeFrom((L2) resource)).buildPartial();
        } else {
            this.resource_ = resource;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeResponse(Response response) {
        response.getClass();
        Response response2 = this.response_;
        if (response2 != null && response2 != Response.getDefaultInstance()) {
            this.response_ = (Response) ((j) Response.newBuilder(this.response_).mergeFrom((L2) response)).buildPartial();
        } else {
            this.response_ = response;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSource(Peer peer) {
        peer.getClass();
        Peer peer2 = this.source_;
        if (peer2 != null && peer2 != Peer.getDefaultInstance()) {
            this.source_ = (Peer) ((d) Peer.newBuilder(this.source_).mergeFrom((L2) peer)).buildPartial();
        } else {
            this.source_ = peer;
        }
    }

    public static c newBuilder() {
        return (c) DEFAULT_INSTANCE.createBuilder();
    }

    public static AttributeContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AttributeContext) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AttributeContext parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (AttributeContext) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setApi(Api api) {
        api.getClass();
        this.api_ = api;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDestination(Peer peer) {
        peer.getClass();
        this.destination_ = peer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOrigin(Peer peer) {
        peer.getClass();
        this.origin_ = peer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequest(Request request) {
        request.getClass();
        this.request_ = request;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResource(Resource resource) {
        resource.getClass();
        this.resource_ = resource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResponse(Response response) {
        response.getClass();
        this.response_ = response;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSource(Peer peer) {
        peer.getClass();
        this.source_ = peer;
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (AbstractC2924a.f24235a[k22.ordinal()]) {
            case 1:
                return new AttributeContext();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t\u0004\t\u0005\t\u0006\t\u0007\t", new Object[]{"source_", "destination_", "request_", "response_", "resource_", "api_", "origin_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (AttributeContext.class) {
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

    public Api getApi() {
        Api api = this.api_;
        if (api == null) {
            return Api.getDefaultInstance();
        }
        return api;
    }

    public Peer getDestination() {
        Peer peer = this.destination_;
        if (peer == null) {
            return Peer.getDefaultInstance();
        }
        return peer;
    }

    public Peer getOrigin() {
        Peer peer = this.origin_;
        if (peer == null) {
            return Peer.getDefaultInstance();
        }
        return peer;
    }

    public Request getRequest() {
        Request request = this.request_;
        if (request == null) {
            return Request.getDefaultInstance();
        }
        return request;
    }

    public Resource getResource() {
        Resource resource = this.resource_;
        if (resource == null) {
            return Resource.getDefaultInstance();
        }
        return resource;
    }

    public Response getResponse() {
        Response response = this.response_;
        if (response == null) {
            return Response.getDefaultInstance();
        }
        return response;
    }

    public Peer getSource() {
        Peer peer = this.source_;
        if (peer == null) {
            return Peer.getDefaultInstance();
        }
        return peer;
    }

    public boolean hasApi() {
        if (this.api_ != null) {
            return true;
        }
        return false;
    }

    public boolean hasDestination() {
        if (this.destination_ != null) {
            return true;
        }
        return false;
    }

    public boolean hasOrigin() {
        if (this.origin_ != null) {
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

    public boolean hasResource() {
        if (this.resource_ != null) {
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

    public boolean hasSource() {
        if (this.source_ != null) {
            return true;
        }
        return false;
    }

    public static c newBuilder(AttributeContext attributeContext) {
        return (c) DEFAULT_INSTANCE.createBuilder(attributeContext);
    }

    public static AttributeContext parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (AttributeContext) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static AttributeContext parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (AttributeContext) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static AttributeContext parseFrom(H h6) throws C1912g3 {
        return (AttributeContext) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public static AttributeContext parseFrom(H h6, W1 w1) throws C1912g3 {
        return (AttributeContext) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static AttributeContext parseFrom(byte[] bArr) throws C1912g3 {
        return (AttributeContext) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AttributeContext parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (AttributeContext) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static AttributeContext parseFrom(InputStream inputStream) throws IOException {
        return (AttributeContext) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AttributeContext parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (AttributeContext) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static AttributeContext parseFrom(S s5) throws IOException {
        return (AttributeContext) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static AttributeContext parseFrom(S s5, W1 w1) throws IOException {
        return (AttributeContext) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
