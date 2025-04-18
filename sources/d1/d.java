package d1;

import e1.t0;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final j f30159a = new j(-1, null, null, 0);

    /* renamed from: b, reason: collision with root package name */
    public static final int f30160b = t0.C("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12);

    /* renamed from: c, reason: collision with root package name */
    public static final int f30161c = t0.C("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12);
    public static final android.support.v4.media.session.i d = new android.support.v4.media.session.i("BUFFERED");
    public static final android.support.v4.media.session.i e = new android.support.v4.media.session.i("SHOULD_BUFFER");

    /* renamed from: f, reason: collision with root package name */
    public static final android.support.v4.media.session.i f30162f = new android.support.v4.media.session.i("S_RESUMING_BY_RCV");

    /* renamed from: g, reason: collision with root package name */
    public static final android.support.v4.media.session.i f30163g = new android.support.v4.media.session.i("RESUMING_BY_EB");

    /* renamed from: h, reason: collision with root package name */
    public static final android.support.v4.media.session.i f30164h = new android.support.v4.media.session.i("POISONED");

    /* renamed from: i, reason: collision with root package name */
    public static final android.support.v4.media.session.i f30165i = new android.support.v4.media.session.i("DONE_RCV");

    /* renamed from: j, reason: collision with root package name */
    public static final android.support.v4.media.session.i f30166j = new android.support.v4.media.session.i("INTERRUPTED_SEND");

    /* renamed from: k, reason: collision with root package name */
    public static final android.support.v4.media.session.i f30167k = new android.support.v4.media.session.i("INTERRUPTED_RCV");

    /* renamed from: l, reason: collision with root package name */
    public static final android.support.v4.media.session.i f30168l = new android.support.v4.media.session.i("CHANNEL_CLOSED");

    /* renamed from: m, reason: collision with root package name */
    public static final android.support.v4.media.session.i f30169m = new android.support.v4.media.session.i("SUSPEND");

    /* renamed from: n, reason: collision with root package name */
    public static final android.support.v4.media.session.i f30170n = new android.support.v4.media.session.i("SUSPEND_NO_WAITER");

    /* renamed from: o, reason: collision with root package name */
    public static final android.support.v4.media.session.i f30171o = new android.support.v4.media.session.i("FAILED");

    /* renamed from: p, reason: collision with root package name */
    public static final android.support.v4.media.session.i f30172p = new android.support.v4.media.session.i("NO_RECEIVE_RESULT");

    /* renamed from: q, reason: collision with root package name */
    public static final android.support.v4.media.session.i f30173q = new android.support.v4.media.session.i("CLOSE_HANDLER_CLOSED");

    /* renamed from: r, reason: collision with root package name */
    public static final android.support.v4.media.session.i f30174r = new android.support.v4.media.session.i("CLOSE_HANDLER_INVOKED");

    /* renamed from: s, reason: collision with root package name */
    public static final android.support.v4.media.session.i f30175s = new android.support.v4.media.session.i("NO_CLOSE_CAUSE");

    public static final boolean a(b1.k kVar, Object obj, q0.l lVar) {
        android.support.v4.media.session.i B = kVar.B(obj, lVar);
        if (B == null) {
            return false;
        }
        kVar.G(B);
        return true;
    }
}
