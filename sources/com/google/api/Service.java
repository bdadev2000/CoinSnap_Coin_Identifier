package com.google.api;

import a4.C0341B;
import a4.C0366k;
import a4.C0376p;
import a4.F0;
import a4.G;
import a4.InterfaceC0373n0;
import a4.M;
import a4.T;
import a4.V;
import a4.X0;
import a4.h1;
import a4.i1;
import a4.k1;
import a4.s1;
import a4.u1;
import com.google.protobuf.AbstractC1880c;
import com.google.protobuf.Api;
import com.google.protobuf.C1912g3;
import com.google.protobuf.C1949l5;
import com.google.protobuf.D2;
import com.google.protobuf.E2;
import com.google.protobuf.Enum;
import com.google.protobuf.H;
import com.google.protobuf.InterfaceC1891d3;
import com.google.protobuf.InterfaceC1935j5;
import com.google.protobuf.InterfaceC1943l;
import com.google.protobuf.InterfaceC1948l4;
import com.google.protobuf.K2;
import com.google.protobuf.L2;
import com.google.protobuf.O1;
import com.google.protobuf.O3;
import com.google.protobuf.S;
import com.google.protobuf.Type;
import com.google.protobuf.UInt32Value;
import com.google.protobuf.W1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes2.dex */
public final class Service extends L2 implements O3 {
    public static final int APIS_FIELD_NUMBER = 3;
    public static final int AUTHENTICATION_FIELD_NUMBER = 11;
    public static final int BACKEND_FIELD_NUMBER = 8;
    public static final int BILLING_FIELD_NUMBER = 26;
    public static final int CONFIG_VERSION_FIELD_NUMBER = 20;
    public static final int CONTEXT_FIELD_NUMBER = 12;
    public static final int CONTROL_FIELD_NUMBER = 21;
    private static final Service DEFAULT_INSTANCE;
    public static final int DOCUMENTATION_FIELD_NUMBER = 6;
    public static final int ENDPOINTS_FIELD_NUMBER = 18;
    public static final int ENUMS_FIELD_NUMBER = 5;
    public static final int HTTP_FIELD_NUMBER = 9;
    public static final int ID_FIELD_NUMBER = 33;
    public static final int LOGGING_FIELD_NUMBER = 27;
    public static final int LOGS_FIELD_NUMBER = 23;
    public static final int METRICS_FIELD_NUMBER = 24;
    public static final int MONITORED_RESOURCES_FIELD_NUMBER = 25;
    public static final int MONITORING_FIELD_NUMBER = 28;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int PRODUCER_PROJECT_ID_FIELD_NUMBER = 22;
    public static final int QUOTA_FIELD_NUMBER = 10;
    public static final int SOURCE_INFO_FIELD_NUMBER = 37;
    public static final int SYSTEM_PARAMETERS_FIELD_NUMBER = 29;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int TYPES_FIELD_NUMBER = 4;
    public static final int USAGE_FIELD_NUMBER = 15;
    private Authentication authentication_;
    private Backend backend_;
    private Billing billing_;
    private UInt32Value configVersion_;
    private Context context_;
    private Control control_;
    private Documentation documentation_;
    private Http http_;
    private Logging logging_;
    private Monitoring monitoring_;
    private Quota quota_;
    private SourceInfo sourceInfo_;
    private SystemParameters systemParameters_;
    private Usage usage_;
    private String name_ = "";
    private String id_ = "";
    private String title_ = "";
    private String producerProjectId_ = "";
    private InterfaceC1891d3 apis_ = L2.emptyProtobufList();
    private InterfaceC1891d3 types_ = L2.emptyProtobufList();
    private InterfaceC1891d3 enums_ = L2.emptyProtobufList();
    private InterfaceC1891d3 endpoints_ = L2.emptyProtobufList();
    private InterfaceC1891d3 logs_ = L2.emptyProtobufList();
    private InterfaceC1891d3 metrics_ = L2.emptyProtobufList();
    private InterfaceC1891d3 monitoredResources_ = L2.emptyProtobufList();

    static {
        Service service = new Service();
        DEFAULT_INSTANCE = service;
        L2.registerDefaultInstance(Service.class, service);
    }

    private Service() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllApis(Iterable<? extends Api> iterable) {
        ensureApisIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.apis_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEndpoints(Iterable<? extends Endpoint> iterable) {
        ensureEndpointsIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.endpoints_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEnums(Iterable<? extends Enum> iterable) {
        ensureEnumsIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.enums_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLogs(Iterable<? extends LogDescriptor> iterable) {
        ensureLogsIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.logs_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMetrics(Iterable<? extends MetricDescriptor> iterable) {
        ensureMetricsIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.metrics_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMonitoredResources(Iterable<? extends MonitoredResourceDescriptor> iterable) {
        ensureMonitoredResourcesIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.monitoredResources_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTypes(Iterable<? extends Type> iterable) {
        ensureTypesIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.types_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addApis(Api api) {
        api.getClass();
        ensureApisIsMutable();
        this.apis_.add(api);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEndpoints(Endpoint endpoint) {
        endpoint.getClass();
        ensureEndpointsIsMutable();
        this.endpoints_.add(endpoint);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEnums(Enum r22) {
        r22.getClass();
        ensureEnumsIsMutable();
        this.enums_.add(r22);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLogs(LogDescriptor logDescriptor) {
        logDescriptor.getClass();
        ensureLogsIsMutable();
        this.logs_.add(logDescriptor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMetrics(MetricDescriptor metricDescriptor) {
        metricDescriptor.getClass();
        ensureMetricsIsMutable();
        this.metrics_.add(metricDescriptor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMonitoredResources(MonitoredResourceDescriptor monitoredResourceDescriptor) {
        monitoredResourceDescriptor.getClass();
        ensureMonitoredResourcesIsMutable();
        this.monitoredResources_.add(monitoredResourceDescriptor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTypes(Type type) {
        type.getClass();
        ensureTypesIsMutable();
        this.types_.add(type);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearApis() {
        this.apis_ = L2.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAuthentication() {
        this.authentication_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBackend() {
        this.backend_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBilling() {
        this.billing_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConfigVersion() {
        this.configVersion_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContext() {
        this.context_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearControl() {
        this.control_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDocumentation() {
        this.documentation_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndpoints() {
        this.endpoints_ = L2.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnums() {
        this.enums_ = L2.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHttp() {
        this.http_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLogging() {
        this.logging_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLogs() {
        this.logs_ = L2.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMetrics() {
        this.metrics_ = L2.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMonitoredResources() {
        this.monitoredResources_ = L2.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMonitoring() {
        this.monitoring_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProducerProjectId() {
        this.producerProjectId_ = getDefaultInstance().getProducerProjectId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQuota() {
        this.quota_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSourceInfo() {
        this.sourceInfo_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSystemParameters() {
        this.systemParameters_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTypes() {
        this.types_ = L2.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUsage() {
        this.usage_ = null;
    }

    private void ensureApisIsMutable() {
        InterfaceC1891d3 interfaceC1891d3 = this.apis_;
        if (!interfaceC1891d3.isModifiable()) {
            this.apis_ = L2.mutableCopy(interfaceC1891d3);
        }
    }

    private void ensureEndpointsIsMutable() {
        InterfaceC1891d3 interfaceC1891d3 = this.endpoints_;
        if (!interfaceC1891d3.isModifiable()) {
            this.endpoints_ = L2.mutableCopy(interfaceC1891d3);
        }
    }

    private void ensureEnumsIsMutable() {
        InterfaceC1891d3 interfaceC1891d3 = this.enums_;
        if (!interfaceC1891d3.isModifiable()) {
            this.enums_ = L2.mutableCopy(interfaceC1891d3);
        }
    }

    private void ensureLogsIsMutable() {
        InterfaceC1891d3 interfaceC1891d3 = this.logs_;
        if (!interfaceC1891d3.isModifiable()) {
            this.logs_ = L2.mutableCopy(interfaceC1891d3);
        }
    }

    private void ensureMetricsIsMutable() {
        InterfaceC1891d3 interfaceC1891d3 = this.metrics_;
        if (!interfaceC1891d3.isModifiable()) {
            this.metrics_ = L2.mutableCopy(interfaceC1891d3);
        }
    }

    private void ensureMonitoredResourcesIsMutable() {
        InterfaceC1891d3 interfaceC1891d3 = this.monitoredResources_;
        if (!interfaceC1891d3.isModifiable()) {
            this.monitoredResources_ = L2.mutableCopy(interfaceC1891d3);
        }
    }

    private void ensureTypesIsMutable() {
        InterfaceC1891d3 interfaceC1891d3 = this.types_;
        if (!interfaceC1891d3.isModifiable()) {
            this.types_ = L2.mutableCopy(interfaceC1891d3);
        }
    }

    public static Service getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAuthentication(Authentication authentication) {
        authentication.getClass();
        Authentication authentication2 = this.authentication_;
        if (authentication2 != null && authentication2 != Authentication.getDefaultInstance()) {
            this.authentication_ = (Authentication) ((C0366k) Authentication.newBuilder(this.authentication_).mergeFrom((L2) authentication)).buildPartial();
        } else {
            this.authentication_ = authentication;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBackend(Backend backend) {
        backend.getClass();
        Backend backend2 = this.backend_;
        if (backend2 != null && backend2 != Backend.getDefaultInstance()) {
            this.backend_ = (Backend) ((C0376p) Backend.newBuilder(this.backend_).mergeFrom((L2) backend)).buildPartial();
        } else {
            this.backend_ = backend;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBilling(Billing billing) {
        billing.getClass();
        Billing billing2 = this.billing_;
        if (billing2 != null && billing2 != Billing.getDefaultInstance()) {
            this.billing_ = (Billing) ((b) Billing.newBuilder(this.billing_).mergeFrom((L2) billing)).buildPartial();
        } else {
            this.billing_ = billing;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeConfigVersion(UInt32Value uInt32Value) {
        uInt32Value.getClass();
        UInt32Value uInt32Value2 = this.configVersion_;
        if (uInt32Value2 != null && uInt32Value2 != UInt32Value.getDefaultInstance()) {
            this.configVersion_ = (UInt32Value) ((C1949l5) UInt32Value.newBuilder(this.configVersion_).mergeFrom((L2) uInt32Value)).buildPartial();
        } else {
            this.configVersion_ = uInt32Value;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeContext(Context context) {
        context.getClass();
        Context context2 = this.context_;
        if (context2 != null && context2 != Context.getDefaultInstance()) {
            this.context_ = (Context) ((C0341B) Context.newBuilder(this.context_).mergeFrom((L2) context)).buildPartial();
        } else {
            this.context_ = context;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeControl(Control control) {
        control.getClass();
        Control control2 = this.control_;
        if (control2 != null && control2 != Control.getDefaultInstance()) {
            this.control_ = (Control) ((G) Control.newBuilder(this.control_).mergeFrom((L2) control)).buildPartial();
        } else {
            this.control_ = control;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDocumentation(Documentation documentation) {
        documentation.getClass();
        Documentation documentation2 = this.documentation_;
        if (documentation2 != null && documentation2 != Documentation.getDefaultInstance()) {
            this.documentation_ = (Documentation) ((M) Documentation.newBuilder(this.documentation_).mergeFrom((L2) documentation)).buildPartial();
        } else {
            this.documentation_ = documentation;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHttp(Http http) {
        http.getClass();
        Http http2 = this.http_;
        if (http2 != null && http2 != Http.getDefaultInstance()) {
            this.http_ = (Http) ((V) Http.newBuilder(this.http_).mergeFrom((L2) http)).buildPartial();
        } else {
            this.http_ = http;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLogging(Logging logging) {
        logging.getClass();
        Logging logging2 = this.logging_;
        if (logging2 != null && logging2 != Logging.getDefaultInstance()) {
            this.logging_ = (Logging) ((k) Logging.newBuilder(this.logging_).mergeFrom((L2) logging)).buildPartial();
        } else {
            this.logging_ = logging;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMonitoring(Monitoring monitoring) {
        monitoring.getClass();
        Monitoring monitoring2 = this.monitoring_;
        if (monitoring2 != null && monitoring2 != Monitoring.getDefaultInstance()) {
            this.monitoring_ = (Monitoring) ((p) Monitoring.newBuilder(this.monitoring_).mergeFrom((L2) monitoring)).buildPartial();
        } else {
            this.monitoring_ = monitoring;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeQuota(Quota quota) {
        quota.getClass();
        Quota quota2 = this.quota_;
        if (quota2 != null && quota2 != Quota.getDefaultInstance()) {
            this.quota_ = (Quota) ((X0) Quota.newBuilder(this.quota_).mergeFrom((L2) quota)).buildPartial();
        } else {
            this.quota_ = quota;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSourceInfo(SourceInfo sourceInfo) {
        sourceInfo.getClass();
        SourceInfo sourceInfo2 = this.sourceInfo_;
        if (sourceInfo2 != null && sourceInfo2 != SourceInfo.getDefaultInstance()) {
            this.sourceInfo_ = (SourceInfo) ((k1) SourceInfo.newBuilder(this.sourceInfo_).mergeFrom((L2) sourceInfo)).buildPartial();
        } else {
            this.sourceInfo_ = sourceInfo;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSystemParameters(SystemParameters systemParameters) {
        systemParameters.getClass();
        SystemParameters systemParameters2 = this.systemParameters_;
        if (systemParameters2 != null && systemParameters2 != SystemParameters.getDefaultInstance()) {
            this.systemParameters_ = (SystemParameters) ((s1) SystemParameters.newBuilder(this.systemParameters_).mergeFrom((L2) systemParameters)).buildPartial();
        } else {
            this.systemParameters_ = systemParameters;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUsage(Usage usage) {
        usage.getClass();
        Usage usage2 = this.usage_;
        if (usage2 != null && usage2 != Usage.getDefaultInstance()) {
            this.usage_ = (Usage) ((u1) Usage.newBuilder(this.usage_).mergeFrom((L2) usage)).buildPartial();
        } else {
            this.usage_ = usage;
        }
    }

    public static i1 newBuilder() {
        return (i1) DEFAULT_INSTANCE.createBuilder();
    }

    public static Service parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Service) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Service parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (Service) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeApis(int i9) {
        ensureApisIsMutable();
        this.apis_.remove(i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeEndpoints(int i9) {
        ensureEndpointsIsMutable();
        this.endpoints_.remove(i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeEnums(int i9) {
        ensureEnumsIsMutable();
        this.enums_.remove(i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeLogs(int i9) {
        ensureLogsIsMutable();
        this.logs_.remove(i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeMetrics(int i9) {
        ensureMetricsIsMutable();
        this.metrics_.remove(i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeMonitoredResources(int i9) {
        ensureMonitoredResourcesIsMutable();
        this.monitoredResources_.remove(i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeTypes(int i9) {
        ensureTypesIsMutable();
        this.types_.remove(i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setApis(int i9, Api api) {
        api.getClass();
        ensureApisIsMutable();
        this.apis_.set(i9, api);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAuthentication(Authentication authentication) {
        authentication.getClass();
        this.authentication_ = authentication;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBackend(Backend backend) {
        backend.getClass();
        this.backend_ = backend;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBilling(Billing billing) {
        billing.getClass();
        this.billing_ = billing;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConfigVersion(UInt32Value uInt32Value) {
        uInt32Value.getClass();
        this.configVersion_ = uInt32Value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContext(Context context) {
        context.getClass();
        this.context_ = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setControl(Control control) {
        control.getClass();
        this.control_ = control;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDocumentation(Documentation documentation) {
        documentation.getClass();
        this.documentation_ = documentation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndpoints(int i9, Endpoint endpoint) {
        endpoint.getClass();
        ensureEndpointsIsMutable();
        this.endpoints_.set(i9, endpoint);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnums(int i9, Enum r32) {
        r32.getClass();
        ensureEnumsIsMutable();
        this.enums_.set(i9, r32);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHttp(Http http) {
        http.getClass();
        this.http_ = http;
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
    public void setLogging(Logging logging) {
        logging.getClass();
        this.logging_ = logging;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLogs(int i9, LogDescriptor logDescriptor) {
        logDescriptor.getClass();
        ensureLogsIsMutable();
        this.logs_.set(i9, logDescriptor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetrics(int i9, MetricDescriptor metricDescriptor) {
        metricDescriptor.getClass();
        ensureMetricsIsMutable();
        this.metrics_.set(i9, metricDescriptor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMonitoredResources(int i9, MonitoredResourceDescriptor monitoredResourceDescriptor) {
        monitoredResourceDescriptor.getClass();
        ensureMonitoredResourcesIsMutable();
        this.monitoredResources_.set(i9, monitoredResourceDescriptor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMonitoring(Monitoring monitoring) {
        monitoring.getClass();
        this.monitoring_ = monitoring;
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
    public void setProducerProjectId(String str) {
        str.getClass();
        this.producerProjectId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProducerProjectIdBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.producerProjectId_ = h6.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQuota(Quota quota) {
        quota.getClass();
        this.quota_ = quota;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceInfo(SourceInfo sourceInfo) {
        sourceInfo.getClass();
        this.sourceInfo_ = sourceInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSystemParameters(SystemParameters systemParameters) {
        systemParameters.getClass();
        this.systemParameters_ = systemParameters;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitle(String str) {
        str.getClass();
        this.title_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitleBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.title_ = h6.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypes(int i9, Type type) {
        type.getClass();
        ensureTypesIsMutable();
        this.types_.set(i9, type);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUsage(Usage usage) {
        usage.getClass();
        this.usage_ = usage;
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (h1.f4012a[k22.ordinal()]) {
            case 1:
                return new Service();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0019\u0000\u0000\u0001%\u0019\u0000\u0007\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u0004\u001b\u0005\u001b\u0006\t\b\t\t\t\n\t\u000b\t\f\t\u000f\t\u0012\u001b\u0014\t\u0015\t\u0016Ȉ\u0017\u001b\u0018\u001b\u0019\u001b\u001a\t\u001b\t\u001c\t\u001d\t!Ȉ%\t", new Object[]{"name_", "title_", "apis_", Api.class, "types_", Type.class, "enums_", Enum.class, "documentation_", "backend_", "http_", "quota_", "authentication_", "context_", "usage_", "endpoints_", Endpoint.class, "configVersion_", "control_", "producerProjectId_", "logs_", LogDescriptor.class, "metrics_", MetricDescriptor.class, "monitoredResources_", MonitoredResourceDescriptor.class, "billing_", "logging_", "monitoring_", "systemParameters_", "id_", "sourceInfo_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (Service.class) {
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

    public Api getApis(int i9) {
        return (Api) this.apis_.get(i9);
    }

    public int getApisCount() {
        return this.apis_.size();
    }

    public List<Api> getApisList() {
        return this.apis_;
    }

    public InterfaceC1943l getApisOrBuilder(int i9) {
        return (InterfaceC1943l) this.apis_.get(i9);
    }

    public List<? extends InterfaceC1943l> getApisOrBuilderList() {
        return this.apis_;
    }

    public Authentication getAuthentication() {
        Authentication authentication = this.authentication_;
        if (authentication == null) {
            return Authentication.getDefaultInstance();
        }
        return authentication;
    }

    public Backend getBackend() {
        Backend backend = this.backend_;
        if (backend == null) {
            return Backend.getDefaultInstance();
        }
        return backend;
    }

    public Billing getBilling() {
        Billing billing = this.billing_;
        if (billing == null) {
            return Billing.getDefaultInstance();
        }
        return billing;
    }

    public UInt32Value getConfigVersion() {
        UInt32Value uInt32Value = this.configVersion_;
        if (uInt32Value == null) {
            return UInt32Value.getDefaultInstance();
        }
        return uInt32Value;
    }

    public Context getContext() {
        Context context = this.context_;
        if (context == null) {
            return Context.getDefaultInstance();
        }
        return context;
    }

    public Control getControl() {
        Control control = this.control_;
        if (control == null) {
            return Control.getDefaultInstance();
        }
        return control;
    }

    public Documentation getDocumentation() {
        Documentation documentation = this.documentation_;
        if (documentation == null) {
            return Documentation.getDefaultInstance();
        }
        return documentation;
    }

    public Endpoint getEndpoints(int i9) {
        return (Endpoint) this.endpoints_.get(i9);
    }

    public int getEndpointsCount() {
        return this.endpoints_.size();
    }

    public List<Endpoint> getEndpointsList() {
        return this.endpoints_;
    }

    public T getEndpointsOrBuilder(int i9) {
        return (T) this.endpoints_.get(i9);
    }

    public List<? extends T> getEndpointsOrBuilderList() {
        return this.endpoints_;
    }

    public Enum getEnums(int i9) {
        return (Enum) this.enums_.get(i9);
    }

    public int getEnumsCount() {
        return this.enums_.size();
    }

    public List<Enum> getEnumsList() {
        return this.enums_;
    }

    public O1 getEnumsOrBuilder(int i9) {
        return (O1) this.enums_.get(i9);
    }

    public List<? extends O1> getEnumsOrBuilderList() {
        return this.enums_;
    }

    public Http getHttp() {
        Http http = this.http_;
        if (http == null) {
            return Http.getDefaultInstance();
        }
        return http;
    }

    public String getId() {
        return this.id_;
    }

    public H getIdBytes() {
        return H.copyFromUtf8(this.id_);
    }

    public Logging getLogging() {
        Logging logging = this.logging_;
        if (logging == null) {
            return Logging.getDefaultInstance();
        }
        return logging;
    }

    public LogDescriptor getLogs(int i9) {
        return (LogDescriptor) this.logs_.get(i9);
    }

    public int getLogsCount() {
        return this.logs_.size();
    }

    public List<LogDescriptor> getLogsList() {
        return this.logs_;
    }

    public InterfaceC0373n0 getLogsOrBuilder(int i9) {
        return (InterfaceC0373n0) this.logs_.get(i9);
    }

    public List<? extends InterfaceC0373n0> getLogsOrBuilderList() {
        return this.logs_;
    }

    public MetricDescriptor getMetrics(int i9) {
        return (MetricDescriptor) this.metrics_.get(i9);
    }

    public int getMetricsCount() {
        return this.metrics_.size();
    }

    public List<MetricDescriptor> getMetricsList() {
        return this.metrics_;
    }

    public o getMetricsOrBuilder(int i9) {
        return (o) this.metrics_.get(i9);
    }

    public List<? extends o> getMetricsOrBuilderList() {
        return this.metrics_;
    }

    public MonitoredResourceDescriptor getMonitoredResources(int i9) {
        return (MonitoredResourceDescriptor) this.monitoredResources_.get(i9);
    }

    public int getMonitoredResourcesCount() {
        return this.monitoredResources_.size();
    }

    public List<MonitoredResourceDescriptor> getMonitoredResourcesList() {
        return this.monitoredResources_;
    }

    public F0 getMonitoredResourcesOrBuilder(int i9) {
        return (F0) this.monitoredResources_.get(i9);
    }

    public List<? extends F0> getMonitoredResourcesOrBuilderList() {
        return this.monitoredResources_;
    }

    public Monitoring getMonitoring() {
        Monitoring monitoring = this.monitoring_;
        if (monitoring == null) {
            return Monitoring.getDefaultInstance();
        }
        return monitoring;
    }

    public String getName() {
        return this.name_;
    }

    public H getNameBytes() {
        return H.copyFromUtf8(this.name_);
    }

    public String getProducerProjectId() {
        return this.producerProjectId_;
    }

    public H getProducerProjectIdBytes() {
        return H.copyFromUtf8(this.producerProjectId_);
    }

    public Quota getQuota() {
        Quota quota = this.quota_;
        if (quota == null) {
            return Quota.getDefaultInstance();
        }
        return quota;
    }

    public SourceInfo getSourceInfo() {
        SourceInfo sourceInfo = this.sourceInfo_;
        if (sourceInfo == null) {
            return SourceInfo.getDefaultInstance();
        }
        return sourceInfo;
    }

    public SystemParameters getSystemParameters() {
        SystemParameters systemParameters = this.systemParameters_;
        if (systemParameters == null) {
            return SystemParameters.getDefaultInstance();
        }
        return systemParameters;
    }

    public String getTitle() {
        return this.title_;
    }

    public H getTitleBytes() {
        return H.copyFromUtf8(this.title_);
    }

    public Type getTypes(int i9) {
        return (Type) this.types_.get(i9);
    }

    public int getTypesCount() {
        return this.types_.size();
    }

    public List<Type> getTypesList() {
        return this.types_;
    }

    public InterfaceC1935j5 getTypesOrBuilder(int i9) {
        return (InterfaceC1935j5) this.types_.get(i9);
    }

    public List<? extends InterfaceC1935j5> getTypesOrBuilderList() {
        return this.types_;
    }

    public Usage getUsage() {
        Usage usage = this.usage_;
        if (usage == null) {
            return Usage.getDefaultInstance();
        }
        return usage;
    }

    public boolean hasAuthentication() {
        if (this.authentication_ != null) {
            return true;
        }
        return false;
    }

    public boolean hasBackend() {
        if (this.backend_ != null) {
            return true;
        }
        return false;
    }

    public boolean hasBilling() {
        if (this.billing_ != null) {
            return true;
        }
        return false;
    }

    public boolean hasConfigVersion() {
        if (this.configVersion_ != null) {
            return true;
        }
        return false;
    }

    public boolean hasContext() {
        if (this.context_ != null) {
            return true;
        }
        return false;
    }

    public boolean hasControl() {
        if (this.control_ != null) {
            return true;
        }
        return false;
    }

    public boolean hasDocumentation() {
        if (this.documentation_ != null) {
            return true;
        }
        return false;
    }

    public boolean hasHttp() {
        if (this.http_ != null) {
            return true;
        }
        return false;
    }

    public boolean hasLogging() {
        if (this.logging_ != null) {
            return true;
        }
        return false;
    }

    public boolean hasMonitoring() {
        if (this.monitoring_ != null) {
            return true;
        }
        return false;
    }

    public boolean hasQuota() {
        if (this.quota_ != null) {
            return true;
        }
        return false;
    }

    public boolean hasSourceInfo() {
        if (this.sourceInfo_ != null) {
            return true;
        }
        return false;
    }

    public boolean hasSystemParameters() {
        if (this.systemParameters_ != null) {
            return true;
        }
        return false;
    }

    public boolean hasUsage() {
        if (this.usage_ != null) {
            return true;
        }
        return false;
    }

    public static i1 newBuilder(Service service) {
        return (i1) DEFAULT_INSTANCE.createBuilder(service);
    }

    public static Service parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Service) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Service parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (Service) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static Service parseFrom(H h6) throws C1912g3 {
        return (Service) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addApis(int i9, Api api) {
        api.getClass();
        ensureApisIsMutable();
        this.apis_.add(i9, api);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEndpoints(int i9, Endpoint endpoint) {
        endpoint.getClass();
        ensureEndpointsIsMutable();
        this.endpoints_.add(i9, endpoint);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEnums(int i9, Enum r32) {
        r32.getClass();
        ensureEnumsIsMutable();
        this.enums_.add(i9, r32);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLogs(int i9, LogDescriptor logDescriptor) {
        logDescriptor.getClass();
        ensureLogsIsMutable();
        this.logs_.add(i9, logDescriptor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMetrics(int i9, MetricDescriptor metricDescriptor) {
        metricDescriptor.getClass();
        ensureMetricsIsMutable();
        this.metrics_.add(i9, metricDescriptor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMonitoredResources(int i9, MonitoredResourceDescriptor monitoredResourceDescriptor) {
        monitoredResourceDescriptor.getClass();
        ensureMonitoredResourcesIsMutable();
        this.monitoredResources_.add(i9, monitoredResourceDescriptor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTypes(int i9, Type type) {
        type.getClass();
        ensureTypesIsMutable();
        this.types_.add(i9, type);
    }

    public static Service parseFrom(H h6, W1 w1) throws C1912g3 {
        return (Service) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static Service parseFrom(byte[] bArr) throws C1912g3 {
        return (Service) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Service parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (Service) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static Service parseFrom(InputStream inputStream) throws IOException {
        return (Service) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Service parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (Service) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static Service parseFrom(S s5) throws IOException {
        return (Service) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static Service parseFrom(S s5, W1 w1) throws IOException {
        return (Service) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
