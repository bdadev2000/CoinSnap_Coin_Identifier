package androidx.compose.ui.focus;

/* loaded from: classes4.dex */
public final class FocusRestorerKt {
    /* JADX WARN: Code restructure failed: missing block: B:76:0x003e, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean a(androidx.compose.ui.focus.FocusTargetNode r10) {
        /*
            Method dump skipped, instructions count: 209
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusRestorerKt.a(androidx.compose.ui.focus.FocusTargetNode):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0026, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean b(androidx.compose.ui.focus.FocusTargetNode r10) {
        /*
            androidx.compose.ui.focus.FocusStateImpl r0 = r10.f2()
            boolean r0 = r0.b()
            r1 = 0
            if (r0 != 0) goto Lc
            return r1
        Lc:
            androidx.compose.ui.Modifier$Node r0 = r10.f14688a
            boolean r2 = r0.f14699n
            if (r2 == 0) goto Lb8
            androidx.compose.runtime.collection.MutableVector r2 = new androidx.compose.runtime.collection.MutableVector
            r3 = 16
            androidx.compose.ui.Modifier$Node[] r4 = new androidx.compose.ui.Modifier.Node[r3]
            r2.<init>(r4)
            androidx.compose.ui.Modifier$Node r4 = r0.f14692g
            if (r4 != 0) goto L23
            androidx.compose.ui.node.DelegatableNodeKt.a(r2, r0)
            goto L26
        L23:
            r2.b(r4)
        L26:
            boolean r0 = r2.m()
            if (r0 == 0) goto Lb7
            int r0 = r2.f14144c
            r4 = 1
            int r0 = r0 - r4
            java.lang.Object r0 = r2.o(r0)
            androidx.compose.ui.Modifier$Node r0 = (androidx.compose.ui.Modifier.Node) r0
            int r5 = r0.d
            r5 = r5 & 1024(0x400, float:1.435E-42)
            if (r5 != 0) goto L40
            androidx.compose.ui.node.DelegatableNodeKt.a(r2, r0)
            goto L26
        L40:
            if (r0 == 0) goto L26
            int r5 = r0.f14690c
            r5 = r5 & 1024(0x400, float:1.435E-42)
            if (r5 == 0) goto Lb4
            r5 = 0
            r6 = r5
        L4a:
            if (r0 == 0) goto L26
            boolean r7 = r0 instanceof androidx.compose.ui.focus.FocusTargetNode
            if (r7 == 0) goto L79
            androidx.compose.ui.focus.FocusTargetNode r0 = (androidx.compose.ui.focus.FocusTargetNode) r0
            androidx.compose.ui.focus.FocusStateImpl r7 = r0.f2()
            boolean r7 = r7.b()
            if (r7 == 0) goto Laf
            androidx.compose.ui.node.LayoutNode r0 = androidx.compose.ui.node.DelegatableNodeKt.f(r0)
            int r0 = r0.f15943c
            r10.f14892r = r0
            androidx.compose.runtime.StaticProvidableCompositionLocal r0 = androidx.compose.runtime.saveable.SaveableStateRegistryKt.f14529a
            java.lang.Object r0 = androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt.a(r10, r0)
            androidx.compose.runtime.saveable.SaveableStateRegistry r0 = (androidx.compose.runtime.saveable.SaveableStateRegistry) r0
            if (r0 == 0) goto L78
            androidx.compose.ui.focus.FocusRestorerKt$saveFocusedChild$1$1 r1 = new androidx.compose.ui.focus.FocusRestorerKt$saveFocusedChild$1$1
            r1.<init>(r10)
            java.lang.String r10 = "previouslyFocusedChildHash"
            r0.b(r10, r1)
        L78:
            return r4
        L79:
            int r7 = r0.f14690c
            r7 = r7 & 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto Laf
            boolean r7 = r0 instanceof androidx.compose.ui.node.DelegatingNode
            if (r7 == 0) goto Laf
            r7 = r0
            androidx.compose.ui.node.DelegatingNode r7 = (androidx.compose.ui.node.DelegatingNode) r7
            androidx.compose.ui.Modifier$Node r7 = r7.f15909p
            r8 = r1
        L89:
            if (r7 == 0) goto Lac
            int r9 = r7.f14690c
            r9 = r9 & 1024(0x400, float:1.435E-42)
            if (r9 == 0) goto La9
            int r8 = r8 + 1
            if (r8 != r4) goto L97
            r0 = r7
            goto La9
        L97:
            if (r6 != 0) goto La0
            androidx.compose.runtime.collection.MutableVector r6 = new androidx.compose.runtime.collection.MutableVector
            androidx.compose.ui.Modifier$Node[] r9 = new androidx.compose.ui.Modifier.Node[r3]
            r6.<init>(r9)
        La0:
            if (r0 == 0) goto La6
            r6.b(r0)
            r0 = r5
        La6:
            r6.b(r7)
        La9:
            androidx.compose.ui.Modifier$Node r7 = r7.f14692g
            goto L89
        Lac:
            if (r8 != r4) goto Laf
            goto L4a
        Laf:
            androidx.compose.ui.Modifier$Node r0 = androidx.compose.ui.node.DelegatableNodeKt.b(r6)
            goto L4a
        Lb4:
            androidx.compose.ui.Modifier$Node r0 = r0.f14692g
            goto L40
        Lb7:
            return r1
        Lb8:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "visitChildren called on an unattached node"
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusRestorerKt.b(androidx.compose.ui.focus.FocusTargetNode):boolean");
    }
}
