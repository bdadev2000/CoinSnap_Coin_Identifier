package b6;

import Z5.h;
import a5.C0398b;
import d6.AbstractC2191a;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;

/* renamed from: b6.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0574a implements d {

    /* renamed from: f, reason: collision with root package name */
    public static final C0574a f5331f;

    /* renamed from: a, reason: collision with root package name */
    public C0398b f5332a;
    public Date b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5333c;

    /* renamed from: d, reason: collision with root package name */
    public R5.e f5334d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5335e;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, b6.a] */
    /* JADX WARN: Type inference failed for: r2v1, types: [a5.b, java.lang.Object] */
    static {
        R5.e eVar = new R5.e(1);
        ?? obj = new Object();
        obj.f5332a = new Object();
        obj.f5334d = eVar;
        f5331f = obj;
    }

    @Override // b6.d
    public final void a(boolean z8) {
        Date date;
        if (!this.f5335e && z8) {
            this.f5332a.getClass();
            Date date2 = new Date();
            Date date3 = this.b;
            if (date3 == null || date2.after(date3)) {
                this.b = date2;
                if (this.f5333c) {
                    Iterator it = Collections.unmodifiableCollection(c.f5337c.b).iterator();
                    while (it.hasNext()) {
                        AbstractC2191a abstractC2191a = ((h) it.next()).f3901e;
                        Date date4 = this.b;
                        if (date4 != null) {
                            date = (Date) date4.clone();
                        } else {
                            date = null;
                        }
                        abstractC2191a.c(date);
                    }
                }
            }
        }
        this.f5335e = z8;
    }
}
