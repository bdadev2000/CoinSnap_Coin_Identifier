package com.instagram.common.viewpoint.core;

import com.instagram.common.viewpoint.core.AbstractC03808x;
import com.instagram.common.viewpoint.core.C03788v;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/* renamed from: com.facebook.ads.redexgen.X.8w, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C03798w<T extends AbstractC03808x, E extends C03788v> {
    public final Map<Class<E>, List<WeakReference<T>>> A00 = new HashMap();
    public final Queue<E> A01 = new ArrayDeque();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private void A00(E e) {
        List<WeakReference<T>> list;
        if (this.A00 == null || (list = this.A00.get(e.getClass())) == null) {
            return;
        }
        A01(list);
        if (list.isEmpty()) {
            return;
        }
        Iterator it = new ArrayList(list).iterator();
        while (it.hasNext()) {
            AbstractC03808x abstractC03808x = (AbstractC03808x) ((WeakReference) it.next()).get();
            if (abstractC03808x != null && abstractC03808x.A00(e)) {
                abstractC03808x.A03(e);
            }
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public final synchronized void A02(E e) {
        if (this.A01.isEmpty()) {
            this.A01.add(e);
            while (!this.A01.isEmpty()) {
                A00(this.A01.peek());
                this.A01.remove();
            }
        } else {
            this.A01.add(e);
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 7
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public final synchronized boolean A05(T t2) {
        if (t2 == null) {
            return false;
        }
        Class<E> A01 = t2.A01();
        if (this.A00.get(A01) == null) {
            this.A00.put(A01, new ArrayList());
        }
        List<WeakReference<T>> list = this.A00.get(A01);
        A01(list);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (list.get(i2).get() == t2) {
                return false;
            }
        }
        return list.add(new WeakReference<>(t2));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.8w != com.facebook.ads.internal.events.EventBus<T extends com.facebook.ads.redexgen.X.8x, E extends com.facebook.ads.redexgen.X.8v> */
    /* JADX WARN: Incorrect condition in loop: B:4:0x0008 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A01(java.util.List<java.lang.ref.WeakReference<T>> r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L2d
            r3 = 0
            r2 = 0
        L4:
            int r0 = r5.size()
            if (r2 >= r0) goto L1f
            java.lang.Object r1 = r5.get(r2)
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r0 = r1.get()
            if (r0 == 0) goto L1c
            int r0 = r3 + 1
            r5.set(r3, r1)
            r3 = r0
        L1c:
            int r2 = r2 + 1
            goto L4
        L1f:
            int r0 = r5.size()
            int r0 = r0 + (-1)
        L25:
            if (r0 < r3) goto L2d
            r5.remove(r0)
            int r0 = r0 + (-1)
            goto L25
        L2d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C03798w.A01(java.util.List):void");
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.8w != com.facebook.ads.internal.events.EventBus<T extends com.facebook.ads.redexgen.X.8x, E extends com.facebook.ads.redexgen.X.8v> */
    public final synchronized void A03(T... subscribers) {
        if (subscribers == null) {
            return;
        }
        for (T t2 : subscribers) {
            A05(t2);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.8w != com.facebook.ads.internal.events.EventBus<T extends com.facebook.ads.redexgen.X.8x, E extends com.facebook.ads.redexgen.X.8v> */
    public final synchronized void A04(T... subscribers) {
        if (subscribers == null) {
            return;
        }
        for (T t2 : subscribers) {
            A06(t2);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.8w != com.facebook.ads.internal.events.EventBus<T extends com.facebook.ads.redexgen.X.8x, E extends com.facebook.ads.redexgen.X.8v> */
    public final synchronized boolean A06(T subscriber) {
        if (subscriber == null) {
            return false;
        }
        List<WeakReference<T>> list = this.A00.get(subscriber.A01());
        if (list == null) {
            return false;
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (list.get(i2).get() == subscriber) {
                list.get(i2).clear();
                return true;
            }
        }
        return false;
    }
}
