package kotlin.jvm.internal;

/* loaded from: classes3.dex */
public abstract class n extends h implements m, x0.f {
    private final int arity;
    private final int flags;

    public n(int i2, Object obj, Class cls, String str, String str2, int i3) {
        super(obj, cls, str, str2, (i3 & 1) == 1);
        this.arity = i2;
        this.flags = i3 >> 1;
    }

    @Override // kotlin.jvm.internal.h
    public x0.b computeReflected() {
        g0.f30932a.getClass();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            return getName().equals(nVar.getName()) && getSignature().equals(nVar.getSignature()) && this.flags == nVar.flags && this.arity == nVar.arity && p0.a.g(getBoundReceiver(), nVar.getBoundReceiver()) && p0.a.g(getOwner(), nVar.getOwner());
        }
        if (obj instanceof x0.f) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.m
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    @Override // x0.f
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // x0.f
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // x0.f
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // x0.f
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // kotlin.jvm.internal.h, x0.b
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        x0.b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    @Override // kotlin.jvm.internal.h
    public x0.f getReflected() {
        x0.b compute = compute();
        if (compute != this) {
            return (x0.f) compute;
        }
        throw new Error("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }
}
