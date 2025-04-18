package z4;

import com.bytedance.sdk.component.qsH.YFl.YFl;
import com.bytedance.sdk.component.utils.bZ;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f28494b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f28495c;

    public /* synthetic */ a(e eVar, int i10) {
        this.f28494b = i10;
        this.f28495c = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f28494b;
        e eVar = this.f28495c;
        switch (i10) {
            case 0:
                if (e.YFl(eVar) == null) {
                    try {
                        e.YFl(eVar, new g());
                    } catch (Throwable th2) {
                        th2.getMessage();
                    }
                    if (e.YFl(eVar) != null) {
                        e.YFl(eVar);
                        e.YFl(eVar, "0");
                        ((g) e.YFl(eVar)).a = eVar;
                        ((g) e.YFl(eVar)).f28507b = eVar;
                        ((g) e.YFl(eVar)).f28511f = eVar;
                        ((g) e.YFl(eVar)).f28508c = eVar;
                        ((g) e.YFl(eVar)).f28509d = eVar;
                        ((g) e.YFl(eVar)).f28512g = eVar;
                        ((g) e.YFl(eVar)).f28510e = eVar;
                        try {
                            ((g) e.YFl(eVar)).f28514i.setLooping(false);
                        } catch (Throwable unused) {
                        }
                        e.Sg(eVar, false);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                if (eVar.DSW() && e.YFl(eVar) != null) {
                    try {
                        ((g) e.YFl(eVar)).f28514i.start();
                        for (WeakReference weakReference : e.NjR(eVar)) {
                            if (weakReference != null && weakReference.get() != null) {
                                ((k5.b) weakReference.get()).wN(eVar);
                            }
                        }
                        e.YFl(eVar, 206);
                        return;
                    } catch (Throwable th3) {
                        th3.getMessage();
                        return;
                    }
                }
                return;
            case 2:
                if (e.qsH(eVar) != null) {
                    e.qsH(eVar).sendEmptyMessage(101);
                    return;
                }
                return;
            case 3:
                if (e.qsH(eVar) != null) {
                    e.qsH(eVar).sendEmptyMessage(101);
                    return;
                }
                return;
            case 4:
                if (e.qsH(eVar) != null) {
                    e.qsH(eVar).sendEmptyMessage(104);
                    return;
                }
                return;
            case 5:
                if (e.YFl(eVar) != null) {
                    long lG = eVar.lG();
                    if (lG > 0 && eVar.vc() && e.Sg(eVar) != Long.MIN_VALUE) {
                        try {
                            if (e.Sg(eVar) == lG) {
                                if (!e.tN(eVar) && e.AlY(eVar) >= 400) {
                                    e.YFl(eVar, 701, 800);
                                    e.YFl(eVar, true);
                                }
                                e.YFl(eVar, e.AlY(eVar) + e.wN(eVar));
                            } else {
                                if (e.tN(eVar)) {
                                    e.Sg(eVar, e.vc(eVar) + e.AlY(eVar));
                                    e.YFl(eVar, 702, 800);
                                    e.vc(eVar);
                                    e.DSW(eVar);
                                }
                                e.YFl(eVar, 0L);
                                e.YFl(eVar, false);
                            }
                        } catch (Throwable th4) {
                            th4.getMessage();
                        }
                    }
                    if (eVar.rkt() > 0) {
                        if (e.Sg(eVar) != lG) {
                            e.YFl(eVar, lG, eVar.rkt());
                        }
                        e.tN(eVar, lG);
                    }
                    if (!eVar.Sg()) {
                        if (e.qsH(eVar) != null) {
                            e.qsH(eVar).postDelayed(this, e.wN(eVar));
                            return;
                        }
                        return;
                    }
                    e.YFl(eVar, eVar.rkt(), eVar.rkt());
                    return;
                }
                return;
            case 6:
                if (e.qsH(eVar) != null && e.qsH(eVar).getLooper() != null) {
                    try {
                        YFl.YFl().YFl(e.qsH(eVar));
                        e.YFl(eVar, (bZ) null);
                        return;
                    } catch (Throwable unused2) {
                        return;
                    }
                }
                return;
            default:
                try {
                    ((g) e.YFl(eVar)).f28514i.pause();
                    e.YFl(eVar, 207);
                    e.tN(eVar, false);
                    return;
                } catch (Throwable unused3) {
                    return;
                }
        }
    }
}
