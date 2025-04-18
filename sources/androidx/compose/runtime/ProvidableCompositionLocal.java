package androidx.compose.runtime;

@Stable
/* loaded from: classes4.dex */
public abstract class ProvidableCompositionLocal<T> extends CompositionLocal<T> {
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0032, code lost:
    
        if (r0 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0034, code lost:
    
        r1 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0040, code lost:
    
        if (r0 == r2) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.CompositionLocal
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.compose.runtime.ValueHolder b(androidx.compose.runtime.ProvidedValue r4, androidx.compose.runtime.ValueHolder r5) {
        /*
            r3 = this;
            boolean r0 = r5 instanceof androidx.compose.runtime.DynamicValueHolder
            r1 = 0
            if (r0 == 0) goto L16
            boolean r0 = r4.f13865f
            if (r0 == 0) goto L43
            r1 = r5
            androidx.compose.runtime.DynamicValueHolder r1 = (androidx.compose.runtime.DynamicValueHolder) r1
            androidx.compose.runtime.MutableState r5 = r1.f13796a
            java.lang.Object r0 = r4.a()
            r5.setValue(r0)
            goto L43
        L16:
            boolean r0 = r5 instanceof androidx.compose.runtime.StaticValueHolder
            if (r0 == 0) goto L36
            boolean r0 = r4.f13863b
            if (r0 != 0) goto L22
            java.lang.Object r0 = r4.f13866g
            if (r0 == 0) goto L43
        L22:
            boolean r0 = r4.f13865f
            if (r0 != 0) goto L43
            java.lang.Object r0 = r4.a()
            androidx.compose.runtime.StaticValueHolder r5 = (androidx.compose.runtime.StaticValueHolder) r5
            java.lang.Object r2 = r5.f14077a
            boolean r0 = p0.a.g(r0, r2)
            if (r0 == 0) goto L43
        L34:
            r1 = r5
            goto L43
        L36:
            boolean r0 = r5 instanceof androidx.compose.runtime.ComputedValueHolder
            if (r0 == 0) goto L43
            q0.l r0 = r4.e
            androidx.compose.runtime.ComputedValueHolder r5 = (androidx.compose.runtime.ComputedValueHolder) r5
            q0.l r2 = r5.f13777a
            if (r0 != r2) goto L43
            goto L34
        L43:
            if (r1 != 0) goto L7d
            boolean r5 = r4.f13865f
            androidx.compose.runtime.MutableState r0 = r4.d
            if (r5 == 0) goto L60
            androidx.compose.runtime.DynamicValueHolder r5 = new androidx.compose.runtime.DynamicValueHolder
            if (r0 != 0) goto L5b
            androidx.compose.runtime.SnapshotMutationPolicy r0 = r4.f13864c
            if (r0 != 0) goto L55
            androidx.compose.runtime.StructuralEqualityPolicy r0 = androidx.compose.runtime.StructuralEqualityPolicy.f14078a
        L55:
            java.lang.Object r4 = r4.f13866g
            androidx.compose.runtime.ParcelableSnapshotMutableState r0 = androidx.compose.runtime.SnapshotStateKt.f(r4, r0)
        L5b:
            r5.<init>(r0)
        L5e:
            r1 = r5
            goto L7d
        L60:
            q0.l r5 = r4.e
            if (r5 == 0) goto L6b
            androidx.compose.runtime.ComputedValueHolder r4 = new androidx.compose.runtime.ComputedValueHolder
            r4.<init>(r5)
        L69:
            r1 = r4
            goto L7d
        L6b:
            if (r0 == 0) goto L73
            androidx.compose.runtime.DynamicValueHolder r4 = new androidx.compose.runtime.DynamicValueHolder
            r4.<init>(r0)
            goto L69
        L73:
            androidx.compose.runtime.StaticValueHolder r5 = new androidx.compose.runtime.StaticValueHolder
            java.lang.Object r4 = r4.a()
            r5.<init>(r4)
            goto L5e
        L7d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ProvidableCompositionLocal.b(androidx.compose.runtime.ProvidedValue, androidx.compose.runtime.ValueHolder):androidx.compose.runtime.ValueHolder");
    }

    public abstract ProvidedValue c(Object obj);
}
