package com.bytedance.adsdk.YFl.Sg.tN.YFl;

/* loaded from: classes.dex */
public class NjR extends vc {
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        if (r0.YFl() != com.bytedance.adsdk.YFl.Sg.AlY.Sg.METHOD) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
    
        r0 = (com.bytedance.adsdk.YFl.Sg.Sg.YFl.nc) r0;
        r1 = new java.util.LinkedList();
        r2 = new java.util.LinkedList();
        r10 = r10.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
    
        if (r10.hasNext() == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
    
        r3 = (com.bytedance.adsdk.YFl.Sg.Sg.YFl) r10.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
    
        if (r3.YFl() != com.bytedance.adsdk.YFl.Sg.AlY.AlY.COMMA) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0067, code lost:
    
        r2.addLast(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
    
        r1.add(com.bytedance.adsdk.YFl.Sg.wN.Sg.YFl(r2, r7, r8));
        r2.clear();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006f, code lost:
    
        if (r2.isEmpty() != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0071, code lost:
    
        r1.add(com.bytedance.adsdk.YFl.Sg.wN.Sg.YFl(r2, r7, r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0078, code lost:
    
        r0.YFl((com.bytedance.adsdk.YFl.Sg.Sg.YFl[]) r1.toArray(new com.bytedance.adsdk.YFl.Sg.Sg.YFl[r1.size()]));
        r8 = r8 + 1;
        r9.push(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:?, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008d, code lost:
    
        r9.push(com.bytedance.adsdk.YFl.Sg.wN.Sg.YFl(r10, r7, r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0096, code lost:
    
        return r8 + 1;
     */
    @Override // com.bytedance.adsdk.YFl.Sg.tN.YFl.vc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int YFl(java.lang.String r7, int r8, java.util.Deque<com.bytedance.adsdk.YFl.Sg.Sg.YFl> r9, com.bytedance.adsdk.YFl.Sg.tN.YFl r10) {
        /*
            r6 = this;
            r0 = 41
            char r1 = r6.YFl(r8, r7)
            if (r0 == r1) goto Ld
            int r7 = r10.YFl(r7, r8, r9)
            return r7
        Ld:
            java.util.LinkedList r10 = new java.util.LinkedList
            r10.<init>()
        L12:
            java.lang.Object r0 = r9.pollFirst()
            com.bytedance.adsdk.YFl.Sg.Sg.YFl r0 = (com.bytedance.adsdk.YFl.Sg.Sg.YFl) r0
            if (r0 == 0) goto L2e
            com.bytedance.adsdk.YFl.Sg.AlY.wN r1 = r0.YFl()
            com.bytedance.adsdk.YFl.Sg.AlY.Sg r2 = com.bytedance.adsdk.YFl.Sg.AlY.Sg.METHOD
            if (r1 == r2) goto L2e
            com.bytedance.adsdk.YFl.Sg.AlY.wN r1 = r0.YFl()
            com.bytedance.adsdk.YFl.Sg.AlY.AlY r2 = com.bytedance.adsdk.YFl.Sg.AlY.AlY.LEFT_PAREN
            if (r1 == r2) goto L2e
            r10.addFirst(r0)
            goto L12
        L2e:
            if (r0 == 0) goto L97
            com.bytedance.adsdk.YFl.Sg.AlY.wN r1 = r0.YFl()
            com.bytedance.adsdk.YFl.Sg.AlY.Sg r2 = com.bytedance.adsdk.YFl.Sg.AlY.Sg.METHOD
            if (r1 != r2) goto L8d
            com.bytedance.adsdk.YFl.Sg.Sg.YFl.nc r0 = (com.bytedance.adsdk.YFl.Sg.Sg.YFl.nc) r0
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            java.util.Iterator r10 = r10.iterator()
        L48:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto L6b
            java.lang.Object r3 = r10.next()
            com.bytedance.adsdk.YFl.Sg.Sg.YFl r3 = (com.bytedance.adsdk.YFl.Sg.Sg.YFl) r3
            com.bytedance.adsdk.YFl.Sg.AlY.wN r4 = r3.YFl()
            com.bytedance.adsdk.YFl.Sg.AlY.AlY r5 = com.bytedance.adsdk.YFl.Sg.AlY.AlY.COMMA
            if (r4 != r5) goto L67
            com.bytedance.adsdk.YFl.Sg.Sg.YFl r3 = com.bytedance.adsdk.YFl.Sg.wN.Sg.YFl(r2, r7, r8)
            r1.add(r3)
            r2.clear()
            goto L48
        L67:
            r2.addLast(r3)
            goto L48
        L6b:
            boolean r10 = r2.isEmpty()
            if (r10 != 0) goto L78
            com.bytedance.adsdk.YFl.Sg.Sg.YFl r7 = com.bytedance.adsdk.YFl.Sg.wN.Sg.YFl(r2, r7, r8)
            r1.add(r7)
        L78:
            int r7 = r1.size()
            com.bytedance.adsdk.YFl.Sg.Sg.YFl[] r7 = new com.bytedance.adsdk.YFl.Sg.Sg.YFl[r7]
            java.lang.Object[] r7 = r1.toArray(r7)
            com.bytedance.adsdk.YFl.Sg.Sg.YFl[] r7 = (com.bytedance.adsdk.YFl.Sg.Sg.YFl[]) r7
            r0.YFl(r7)
            int r8 = r8 + 1
            r9.push(r0)
            goto L96
        L8d:
            com.bytedance.adsdk.YFl.Sg.Sg.YFl r7 = com.bytedance.adsdk.YFl.Sg.wN.Sg.YFl(r10, r7, r8)
            r9.push(r7)
            int r8 = r8 + 1
        L96:
            return r8
        L97:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r10 = 0
            java.lang.String r7 = r7.substring(r10, r8)
            r9.<init>(r7)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.YFl.Sg.tN.YFl.NjR.YFl(java.lang.String, int, java.util.Deque, com.bytedance.adsdk.YFl.Sg.tN.YFl):int");
    }
}
