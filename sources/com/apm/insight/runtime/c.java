package com.apm.insight.runtime;

import androidx.annotation.NonNull;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.IOOMCallback;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final List<ICrashCallback> f6022a = new CopyOnWriteArrayList();
    private final List<ICrashCallback> b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final List<ICrashCallback> f6023c = new CopyOnWriteArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final List<ICrashCallback> f6024d = new CopyOnWriteArrayList();

    /* renamed from: e, reason: collision with root package name */
    private final List<IOOMCallback> f6025e = new CopyOnWriteArrayList();

    /* renamed from: com.apm.insight.runtime.c$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f6026a;

        static {
            int[] iArr = new int[CrashType.values().length];
            f6026a = iArr;
            try {
                iArr[CrashType.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6026a[CrashType.ANR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6026a[CrashType.JAVA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6026a[CrashType.LAUNCH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6026a[CrashType.NATIVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @NonNull
    public List<IOOMCallback> a() {
        return this.f6025e;
    }

    @NonNull
    public List<ICrashCallback> b() {
        return this.f6022a;
    }

    @NonNull
    public List<ICrashCallback> c() {
        return this.b;
    }

    @NonNull
    public List<ICrashCallback> d() {
        return this.f6023c;
    }

    @NonNull
    public List<ICrashCallback> e() {
        return this.f6024d;
    }

    public void a(ICrashCallback iCrashCallback, CrashType crashType) {
        List<ICrashCallback> list;
        int i9 = AnonymousClass1.f6026a[crashType.ordinal()];
        if (i9 == 1) {
            this.f6022a.add(iCrashCallback);
            this.b.add(iCrashCallback);
            this.f6023c.add(iCrashCallback);
        } else if (i9 != 2) {
            if (i9 == 3) {
                list = this.b;
            } else if (i9 == 4) {
                list = this.f6022a;
            } else if (i9 != 5) {
                return;
            } else {
                list = this.f6023c;
            }
            list.add(iCrashCallback);
        }
        list = this.f6024d;
        list.add(iCrashCallback);
    }

    public void b(ICrashCallback iCrashCallback, CrashType crashType) {
        List<ICrashCallback> list;
        int i9 = AnonymousClass1.f6026a[crashType.ordinal()];
        if (i9 == 1) {
            this.f6022a.remove(iCrashCallback);
            this.b.remove(iCrashCallback);
            this.f6023c.remove(iCrashCallback);
        } else if (i9 != 2) {
            if (i9 == 3) {
                list = this.b;
            } else if (i9 == 4) {
                list = this.f6022a;
            } else if (i9 != 5) {
                return;
            } else {
                list = this.f6023c;
            }
            list.remove(iCrashCallback);
        }
        list = this.f6024d;
        list.remove(iCrashCallback);
    }

    public void a(IOOMCallback iOOMCallback) {
        this.f6025e.add(iOOMCallback);
    }

    public void b(IOOMCallback iOOMCallback) {
        this.f6025e.remove(iOOMCallback);
    }
}
