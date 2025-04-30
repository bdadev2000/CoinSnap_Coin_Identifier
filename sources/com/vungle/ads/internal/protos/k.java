package com.vungle.ads.internal.protos;

import com.google.protobuf.D2;
import com.google.protobuf.H;

/* loaded from: classes3.dex */
public final class k extends D2 implements o {
    public /* synthetic */ k(a aVar) {
        this();
    }

    public k clearConnectionType() {
        copyOnWrite();
        ((Sdk$SDKMetric) this.instance).clearConnectionType();
        return this;
    }

    public k clearConnectionTypeDetail() {
        copyOnWrite();
        ((Sdk$SDKMetric) this.instance).clearConnectionTypeDetail();
        return this;
    }

    public k clearCreativeId() {
        copyOnWrite();
        ((Sdk$SDKMetric) this.instance).clearCreativeId();
        return this;
    }

    public k clearEventId() {
        copyOnWrite();
        ((Sdk$SDKMetric) this.instance).clearEventId();
        return this;
    }

    public k clearMake() {
        copyOnWrite();
        ((Sdk$SDKMetric) this.instance).clearMake();
        return this;
    }

    public k clearMeta() {
        copyOnWrite();
        ((Sdk$SDKMetric) this.instance).clearMeta();
        return this;
    }

    public k clearModel() {
        copyOnWrite();
        ((Sdk$SDKMetric) this.instance).clearModel();
        return this;
    }

    public k clearOs() {
        copyOnWrite();
        ((Sdk$SDKMetric) this.instance).clearOs();
        return this;
    }

    public k clearOsVersion() {
        copyOnWrite();
        ((Sdk$SDKMetric) this.instance).clearOsVersion();
        return this;
    }

    public k clearPlacementReferenceId() {
        copyOnWrite();
        ((Sdk$SDKMetric) this.instance).clearPlacementReferenceId();
        return this;
    }

    public k clearSessionId() {
        copyOnWrite();
        ((Sdk$SDKMetric) this.instance).clearSessionId();
        return this;
    }

    public k clearType() {
        copyOnWrite();
        ((Sdk$SDKMetric) this.instance).clearType();
        return this;
    }

    public k clearValue() {
        copyOnWrite();
        ((Sdk$SDKMetric) this.instance).clearValue();
        return this;
    }

    @Override // com.vungle.ads.internal.protos.o
    public String getConnectionType() {
        return ((Sdk$SDKMetric) this.instance).getConnectionType();
    }

    @Override // com.vungle.ads.internal.protos.o
    public H getConnectionTypeBytes() {
        return ((Sdk$SDKMetric) this.instance).getConnectionTypeBytes();
    }

    @Override // com.vungle.ads.internal.protos.o
    public String getConnectionTypeDetail() {
        return ((Sdk$SDKMetric) this.instance).getConnectionTypeDetail();
    }

    @Override // com.vungle.ads.internal.protos.o
    public H getConnectionTypeDetailBytes() {
        return ((Sdk$SDKMetric) this.instance).getConnectionTypeDetailBytes();
    }

    @Override // com.vungle.ads.internal.protos.o
    public String getCreativeId() {
        return ((Sdk$SDKMetric) this.instance).getCreativeId();
    }

    @Override // com.vungle.ads.internal.protos.o
    public H getCreativeIdBytes() {
        return ((Sdk$SDKMetric) this.instance).getCreativeIdBytes();
    }

    @Override // com.vungle.ads.internal.protos.o
    public String getEventId() {
        return ((Sdk$SDKMetric) this.instance).getEventId();
    }

    @Override // com.vungle.ads.internal.protos.o
    public H getEventIdBytes() {
        return ((Sdk$SDKMetric) this.instance).getEventIdBytes();
    }

    @Override // com.vungle.ads.internal.protos.o
    public String getMake() {
        return ((Sdk$SDKMetric) this.instance).getMake();
    }

    @Override // com.vungle.ads.internal.protos.o
    public H getMakeBytes() {
        return ((Sdk$SDKMetric) this.instance).getMakeBytes();
    }

    @Override // com.vungle.ads.internal.protos.o
    public String getMeta() {
        return ((Sdk$SDKMetric) this.instance).getMeta();
    }

    @Override // com.vungle.ads.internal.protos.o
    public H getMetaBytes() {
        return ((Sdk$SDKMetric) this.instance).getMetaBytes();
    }

    @Override // com.vungle.ads.internal.protos.o
    public String getModel() {
        return ((Sdk$SDKMetric) this.instance).getModel();
    }

    @Override // com.vungle.ads.internal.protos.o
    public H getModelBytes() {
        return ((Sdk$SDKMetric) this.instance).getModelBytes();
    }

    @Override // com.vungle.ads.internal.protos.o
    public String getOs() {
        return ((Sdk$SDKMetric) this.instance).getOs();
    }

    @Override // com.vungle.ads.internal.protos.o
    public H getOsBytes() {
        return ((Sdk$SDKMetric) this.instance).getOsBytes();
    }

    @Override // com.vungle.ads.internal.protos.o
    public String getOsVersion() {
        return ((Sdk$SDKMetric) this.instance).getOsVersion();
    }

    @Override // com.vungle.ads.internal.protos.o
    public H getOsVersionBytes() {
        return ((Sdk$SDKMetric) this.instance).getOsVersionBytes();
    }

    @Override // com.vungle.ads.internal.protos.o
    public String getPlacementReferenceId() {
        return ((Sdk$SDKMetric) this.instance).getPlacementReferenceId();
    }

    @Override // com.vungle.ads.internal.protos.o
    public H getPlacementReferenceIdBytes() {
        return ((Sdk$SDKMetric) this.instance).getPlacementReferenceIdBytes();
    }

    @Override // com.vungle.ads.internal.protos.o
    public String getSessionId() {
        return ((Sdk$SDKMetric) this.instance).getSessionId();
    }

    @Override // com.vungle.ads.internal.protos.o
    public H getSessionIdBytes() {
        return ((Sdk$SDKMetric) this.instance).getSessionIdBytes();
    }

    @Override // com.vungle.ads.internal.protos.o
    public n getType() {
        return ((Sdk$SDKMetric) this.instance).getType();
    }

    @Override // com.vungle.ads.internal.protos.o
    public int getTypeValue() {
        return ((Sdk$SDKMetric) this.instance).getTypeValue();
    }

    @Override // com.vungle.ads.internal.protos.o
    public long getValue() {
        return ((Sdk$SDKMetric) this.instance).getValue();
    }

    public k setConnectionType(String str) {
        copyOnWrite();
        ((Sdk$SDKMetric) this.instance).setConnectionType(str);
        return this;
    }

    public k setConnectionTypeBytes(H h6) {
        copyOnWrite();
        ((Sdk$SDKMetric) this.instance).setConnectionTypeBytes(h6);
        return this;
    }

    public k setConnectionTypeDetail(String str) {
        copyOnWrite();
        ((Sdk$SDKMetric) this.instance).setConnectionTypeDetail(str);
        return this;
    }

    public k setConnectionTypeDetailBytes(H h6) {
        copyOnWrite();
        ((Sdk$SDKMetric) this.instance).setConnectionTypeDetailBytes(h6);
        return this;
    }

    public k setCreativeId(String str) {
        copyOnWrite();
        ((Sdk$SDKMetric) this.instance).setCreativeId(str);
        return this;
    }

    public k setCreativeIdBytes(H h6) {
        copyOnWrite();
        ((Sdk$SDKMetric) this.instance).setCreativeIdBytes(h6);
        return this;
    }

    public k setEventId(String str) {
        copyOnWrite();
        ((Sdk$SDKMetric) this.instance).setEventId(str);
        return this;
    }

    public k setEventIdBytes(H h6) {
        copyOnWrite();
        ((Sdk$SDKMetric) this.instance).setEventIdBytes(h6);
        return this;
    }

    public k setMake(String str) {
        copyOnWrite();
        ((Sdk$SDKMetric) this.instance).setMake(str);
        return this;
    }

    public k setMakeBytes(H h6) {
        copyOnWrite();
        ((Sdk$SDKMetric) this.instance).setMakeBytes(h6);
        return this;
    }

    public k setMeta(String str) {
        copyOnWrite();
        ((Sdk$SDKMetric) this.instance).setMeta(str);
        return this;
    }

    public k setMetaBytes(H h6) {
        copyOnWrite();
        ((Sdk$SDKMetric) this.instance).setMetaBytes(h6);
        return this;
    }

    public k setModel(String str) {
        copyOnWrite();
        ((Sdk$SDKMetric) this.instance).setModel(str);
        return this;
    }

    public k setModelBytes(H h6) {
        copyOnWrite();
        ((Sdk$SDKMetric) this.instance).setModelBytes(h6);
        return this;
    }

    public k setOs(String str) {
        copyOnWrite();
        ((Sdk$SDKMetric) this.instance).setOs(str);
        return this;
    }

    public k setOsBytes(H h6) {
        copyOnWrite();
        ((Sdk$SDKMetric) this.instance).setOsBytes(h6);
        return this;
    }

    public k setOsVersion(String str) {
        copyOnWrite();
        ((Sdk$SDKMetric) this.instance).setOsVersion(str);
        return this;
    }

    public k setOsVersionBytes(H h6) {
        copyOnWrite();
        ((Sdk$SDKMetric) this.instance).setOsVersionBytes(h6);
        return this;
    }

    public k setPlacementReferenceId(String str) {
        copyOnWrite();
        ((Sdk$SDKMetric) this.instance).setPlacementReferenceId(str);
        return this;
    }

    public k setPlacementReferenceIdBytes(H h6) {
        copyOnWrite();
        ((Sdk$SDKMetric) this.instance).setPlacementReferenceIdBytes(h6);
        return this;
    }

    public k setSessionId(String str) {
        copyOnWrite();
        ((Sdk$SDKMetric) this.instance).setSessionId(str);
        return this;
    }

    public k setSessionIdBytes(H h6) {
        copyOnWrite();
        ((Sdk$SDKMetric) this.instance).setSessionIdBytes(h6);
        return this;
    }

    public k setType(n nVar) {
        copyOnWrite();
        ((Sdk$SDKMetric) this.instance).setType(nVar);
        return this;
    }

    public k setTypeValue(int i9) {
        copyOnWrite();
        ((Sdk$SDKMetric) this.instance).setTypeValue(i9);
        return this;
    }

    public k setValue(long j7) {
        copyOnWrite();
        ((Sdk$SDKMetric) this.instance).setValue(j7);
        return this;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private k() {
        /*
            r1 = this;
            com.vungle.ads.internal.protos.Sdk$SDKMetric r0 = com.vungle.ads.internal.protos.Sdk$SDKMetric.access$5900()
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.protos.k.<init>():void");
    }
}
