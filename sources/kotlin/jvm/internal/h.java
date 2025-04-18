package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class h implements x0.b, Serializable {
    public static final Object NO_RECEIVER = g.f30931a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient x0.b reflected;
    private final String signature;

    public h(Object obj, Class cls, String str, String str2, boolean z2) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z2;
    }

    @Override // x0.b
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // x0.b
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public x0.b compute() {
        x0.b bVar = this.reflected;
        if (bVar != null) {
            return bVar;
        }
        x0.b computeReflected = computeReflected();
        this.reflected = computeReflected;
        return computeReflected;
    }

    public abstract x0.b computeReflected();

    @Override // x0.a
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public x0.e getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (!this.isTopLevel) {
            return g0.a(cls);
        }
        g0.f30932a.getClass();
        return new v(cls);
    }

    @Override // x0.b
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public abstract x0.b getReflected();

    @Override // x0.b
    public x0.o getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // x0.b
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // x0.b
    public x0.p getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // x0.b
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // x0.b
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // x0.b
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // x0.b
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }
}
