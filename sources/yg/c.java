package yg;

import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.Method;

/* loaded from: classes4.dex */
public final class c extends p6.a {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f28218f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Class f28219g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Executable f28220h;

    public /* synthetic */ c(Executable executable, Class cls, int i10) {
        this.f28218f = i10;
        this.f28220h = executable;
        this.f28219g = cls;
    }

    @Override // p6.a
    public final Object m() {
        int i10 = this.f28218f;
        Executable executable = this.f28220h;
        switch (i10) {
            case 0:
                return ((Constructor) executable).newInstance(null);
            default:
                return ((Method) executable).invoke(null, this.f28219g, Object.class);
        }
    }

    public final String toString() {
        int i10 = this.f28218f;
        Class cls = this.f28219g;
        switch (i10) {
            case 0:
                return cls.getName();
            default:
                return cls.getName();
        }
    }
}
