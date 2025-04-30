package S7;

import Q7.InterfaceC0237e;

/* loaded from: classes3.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final k f2823a = new k(-1, null, null, 0);
    public static final int b = V7.a.j("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12);

    /* renamed from: c, reason: collision with root package name */
    public static final int f2824c = V7.a.j("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12);

    /* renamed from: d, reason: collision with root package name */
    public static final H0.a f2825d = new H0.a("BUFFERED", 2);

    /* renamed from: e, reason: collision with root package name */
    public static final H0.a f2826e = new H0.a("SHOULD_BUFFER", 2);

    /* renamed from: f, reason: collision with root package name */
    public static final H0.a f2827f = new H0.a("S_RESUMING_BY_RCV", 2);

    /* renamed from: g, reason: collision with root package name */
    public static final H0.a f2828g = new H0.a("RESUMING_BY_EB", 2);

    /* renamed from: h, reason: collision with root package name */
    public static final H0.a f2829h = new H0.a("POISONED", 2);

    /* renamed from: i, reason: collision with root package name */
    public static final H0.a f2830i = new H0.a("DONE_RCV", 2);

    /* renamed from: j, reason: collision with root package name */
    public static final H0.a f2831j = new H0.a("INTERRUPTED_SEND", 2);

    /* renamed from: k, reason: collision with root package name */
    public static final H0.a f2832k = new H0.a("INTERRUPTED_RCV", 2);
    public static final H0.a l = new H0.a("CHANNEL_CLOSED", 2);
    public static final H0.a m = new H0.a("SUSPEND", 2);

    /* renamed from: n, reason: collision with root package name */
    public static final H0.a f2833n = new H0.a("SUSPEND_NO_WAITER", 2);

    /* renamed from: o, reason: collision with root package name */
    public static final H0.a f2834o = new H0.a("FAILED", 2);

    /* renamed from: p, reason: collision with root package name */
    public static final H0.a f2835p = new H0.a("NO_RECEIVE_RESULT", 2);

    /* renamed from: q, reason: collision with root package name */
    public static final H0.a f2836q = new H0.a("CLOSE_HANDLER_CLOSED", 2);

    /* renamed from: r, reason: collision with root package name */
    public static final H0.a f2837r = new H0.a("CLOSE_HANDLER_INVOKED", 2);

    /* renamed from: s, reason: collision with root package name */
    public static final H0.a f2838s = new H0.a("NO_CLOSE_CAUSE", 2);

    public static final boolean a(InterfaceC0237e interfaceC0237e, Object obj, F7.l lVar) {
        H0.a f9 = interfaceC0237e.f(obj, lVar);
        if (f9 != null) {
            interfaceC0237e.o(f9);
            return true;
        }
        return false;
    }
}
