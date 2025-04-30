package i5;

import com.google.firebase.perf.v1.NetworkRequestMetric;
import com.google.protobuf.D2;
import com.google.protobuf.O3;
import java.util.List;

/* loaded from: classes2.dex */
public final class w extends D2 implements O3 {
    public final void a(List list) {
        copyOnWrite();
        ((NetworkRequestMetric) this.instance).addAllPerfSessions(list);
    }

    public final void b() {
        copyOnWrite();
        ((NetworkRequestMetric) this.instance).clearResponseContentType();
    }

    public final long c() {
        return ((NetworkRequestMetric) this.instance).getTimeToResponseInitiatedUs();
    }

    public final boolean d() {
        return ((NetworkRequestMetric) this.instance).hasClientStartTimeUs();
    }

    public final boolean e() {
        return ((NetworkRequestMetric) this.instance).hasHttpResponseCode();
    }

    public final boolean f() {
        return ((NetworkRequestMetric) this.instance).hasTimeToResponseCompletedUs();
    }

    public final void g(long j7) {
        copyOnWrite();
        ((NetworkRequestMetric) this.instance).setClientStartTimeUs(j7);
    }

    public final void h(y yVar) {
        copyOnWrite();
        ((NetworkRequestMetric) this.instance).setHttpMethod(yVar);
    }

    public final void i(int i9) {
        copyOnWrite();
        ((NetworkRequestMetric) this.instance).setHttpResponseCode(i9);
    }

    public final void j() {
        z zVar = z.GENERIC_CLIENT_ERROR;
        copyOnWrite();
        ((NetworkRequestMetric) this.instance).setNetworkClientErrorReason(zVar);
    }

    public final void k(long j7) {
        copyOnWrite();
        ((NetworkRequestMetric) this.instance).setRequestPayloadBytes(j7);
    }

    public final void l(String str) {
        copyOnWrite();
        ((NetworkRequestMetric) this.instance).setResponseContentType(str);
    }

    public final void m(long j7) {
        copyOnWrite();
        ((NetworkRequestMetric) this.instance).setResponsePayloadBytes(j7);
    }

    public final void n(long j7) {
        copyOnWrite();
        ((NetworkRequestMetric) this.instance).setTimeToRequestCompletedUs(j7);
    }

    public final void o(long j7) {
        copyOnWrite();
        ((NetworkRequestMetric) this.instance).setTimeToResponseCompletedUs(j7);
    }

    public final void p(long j7) {
        copyOnWrite();
        ((NetworkRequestMetric) this.instance).setTimeToResponseInitiatedUs(j7);
    }

    public final void q(String str) {
        copyOnWrite();
        ((NetworkRequestMetric) this.instance).setUrl(str);
    }
}
