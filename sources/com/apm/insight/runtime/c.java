package com.apm.insight.runtime;

import androidx.annotation.NonNull;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.IOOMCallback;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class c {
    private final List<ICrashCallback> a = new CopyOnWriteArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final List<ICrashCallback> f3315b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final List<ICrashCallback> f3316c = new CopyOnWriteArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final List<ICrashCallback> f3317d = new CopyOnWriteArrayList();

    /* renamed from: e, reason: collision with root package name */
    private final List<IOOMCallback> f3318e = new CopyOnWriteArrayList();

    /* renamed from: com.apm.insight.runtime.c$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[CrashType.values().length];
            a = iArr;
            try {
                iArr[CrashType.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[CrashType.ANR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[CrashType.JAVA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[CrashType.LAUNCH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[CrashType.NATIVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @NonNull
    public List<IOOMCallback> a() {
        return this.f3318e;
    }

    @NonNull
    public List<ICrashCallback> b() {
        return this.a;
    }

    @NonNull
    public List<ICrashCallback> c() {
        return this.f3315b;
    }

    @NonNull
    public List<ICrashCallback> d() {
        return this.f3316c;
    }

    @NonNull
    public List<ICrashCallback> e() {
        return this.f3317d;
    }

    public void a(ICrashCallback iCrashCallback, CrashType crashType) {
        List<ICrashCallback> list;
        int i10 = AnonymousClass1.a[crashType.ordinal()];
        if (i10 == 1) {
            this.a.add(iCrashCallback);
            this.f3315b.add(iCrashCallback);
            this.f3316c.add(iCrashCallback);
        } else if (i10 != 2) {
            if (i10 == 3) {
                list = this.f3315b;
            } else if (i10 == 4) {
                list = this.a;
            } else if (i10 != 5) {
                return;
            } else {
                list = this.f3316c;
            }
            list.add(iCrashCallback);
        }
        list = this.f3317d;
        list.add(iCrashCallback);
    }

    public void b(ICrashCallback iCrashCallback, CrashType crashType) {
        List<ICrashCallback> list;
        int i10 = AnonymousClass1.a[crashType.ordinal()];
        if (i10 == 1) {
            this.a.remove(iCrashCallback);
            this.f3315b.remove(iCrashCallback);
            this.f3316c.remove(iCrashCallback);
        } else if (i10 != 2) {
            if (i10 == 3) {
                list = this.f3315b;
            } else if (i10 == 4) {
                list = this.a;
            } else if (i10 != 5) {
                return;
            } else {
                list = this.f3316c;
            }
            list.remove(iCrashCallback);
        }
        list = this.f3317d;
        list.remove(iCrashCallback);
    }

    public void a(IOOMCallback iOOMCallback) {
        this.f3318e.add(iOOMCallback);
    }

    public void b(IOOMCallback iOOMCallback) {
        this.f3318e.remove(iOOMCallback);
    }
}
