package kotlin.jvm.internal;

/* loaded from: classes2.dex */
public abstract class a0 extends h implements x0.n {
    private final boolean syntheticJavaProperty;

    public a0(Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.syntheticJavaProperty = (i2 & 2) == 2;
    }

    @Override // kotlin.jvm.internal.h
    public x0.b compute() {
        return this.syntheticJavaProperty ? this : super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0) {
            a0 a0Var = (a0) obj;
            return getOwner().equals(a0Var.getOwner()) && getName().equals(a0Var.getName()) && getSignature().equals(a0Var.getSignature()) && p0.a.g(getBoundReceiver(), a0Var.getBoundReceiver());
        }
        if (obj instanceof x0.n) {
            return obj.equals(compute());
        }
        return false;
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    @Override // x0.n
    public boolean isConst() {
        return getReflected().isConst();
    }

    @Override // x0.n
    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        x0.b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    @Override // kotlin.jvm.internal.h
    public x0.n getReflected() {
        if (!this.syntheticJavaProperty) {
            x0.b compute = compute();
            if (compute != this) {
                return (x0.n) compute;
            }
            throw new Error("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
        }
        throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties");
    }
}
