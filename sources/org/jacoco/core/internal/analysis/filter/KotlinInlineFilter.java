package org.jacoco.core.internal.analysis.filter;

import androidx.compose.ui.platform.j;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.regex.Pattern;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.LineNumberNode;
import org.objectweb.asm.tree.MethodNode;

/* loaded from: classes2.dex */
public final class KotlinInlineFilter implements IFilter {
    private int firstGeneratedLineNumber = -1;
    private static final Pattern LINE_INFO_PATTERN = Pattern.compile("([0-9]++)(#[0-9]++)?+(,[0-9]++)?+:([0-9]++)(,[0-9]++)?+");
    private static final Pattern FILE_INFO_PATTERN = Pattern.compile("\\+ ([0-9]++) (.++)");

    private static void expectLine(BufferedReader bufferedReader, String str) throws IOException {
        String readLine = bufferedReader.readLine();
        if (!str.equals(readLine)) {
            throw new IllegalStateException(j.b("Unexpected SMAP line: ", readLine));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00dd, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int getFirstGeneratedLineNumber(java.lang.String r8, java.lang.String r9) {
        /*
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.io.IOException -> L5b
            java.io.StringReader r1 = new java.io.StringReader     // Catch: java.io.IOException -> L5b
            r1.<init>(r9)     // Catch: java.io.IOException -> L5b
            r0.<init>(r1)     // Catch: java.io.IOException -> L5b
            java.lang.String r9 = "SMAP"
            expectLine(r0, r9)     // Catch: java.io.IOException -> L5b
            expectLine(r0, r8)     // Catch: java.io.IOException -> L5b
            java.lang.String r9 = "Kotlin"
            expectLine(r0, r9)     // Catch: java.io.IOException -> L5b
            java.lang.String r9 = "*S Kotlin"
            expectLine(r0, r9)     // Catch: java.io.IOException -> L5b
            java.lang.String r9 = "*F"
            expectLine(r0, r9)     // Catch: java.io.IOException -> L5b
            java.util.BitSet r9 = new java.util.BitSet     // Catch: java.io.IOException -> L5b
            r9.<init>()     // Catch: java.io.IOException -> L5b
        L26:
            java.lang.String r1 = "*L"
            java.lang.String r2 = r0.readLine()     // Catch: java.io.IOException -> L5b
            boolean r1 = r1.equals(r2)     // Catch: java.io.IOException -> L5b
            r3 = 2
            java.lang.String r4 = "Unexpected SMAP line: "
            r5 = 1
            if (r1 != 0) goto L73
            r0.readLine()     // Catch: java.io.IOException -> L5b
            java.util.regex.Pattern r1 = org.jacoco.core.internal.analysis.filter.KotlinInlineFilter.FILE_INFO_PATTERN     // Catch: java.io.IOException -> L5b
            java.util.regex.Matcher r1 = r1.matcher(r2)     // Catch: java.io.IOException -> L5b
            boolean r6 = r1.matches()     // Catch: java.io.IOException -> L5b
            if (r6 == 0) goto L5e
            java.lang.String r2 = r1.group(r3)     // Catch: java.io.IOException -> L5b
            boolean r2 = r2.equals(r8)     // Catch: java.io.IOException -> L5b
            if (r2 == 0) goto L26
            java.lang.String r1 = r1.group(r5)     // Catch: java.io.IOException -> L5b
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.io.IOException -> L5b
            r9.set(r1)     // Catch: java.io.IOException -> L5b
            goto L26
        L5b:
            r8 = move-exception
            goto Le6
        L5e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.io.IOException -> L5b
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L5b
            r9.<init>()     // Catch: java.io.IOException -> L5b
            r9.append(r4)     // Catch: java.io.IOException -> L5b
            r9.append(r2)     // Catch: java.io.IOException -> L5b
            java.lang.String r9 = r9.toString()     // Catch: java.io.IOException -> L5b
            r8.<init>(r9)     // Catch: java.io.IOException -> L5b
            throw r8     // Catch: java.io.IOException -> L5b
        L73:
            boolean r8 = r9.isEmpty()     // Catch: java.io.IOException -> L5b
            if (r8 != 0) goto Lde
            r8 = 2147483647(0x7fffffff, float:NaN)
        L7c:
            java.lang.String r1 = r0.readLine()     // Catch: java.io.IOException -> L5b
            java.lang.String r2 = "*E"
            boolean r2 = r1.equals(r2)     // Catch: java.io.IOException -> L5b
            if (r2 != 0) goto Ldd
            java.lang.String r2 = "*S KotlinDebug"
            boolean r2 = r1.equals(r2)     // Catch: java.io.IOException -> L5b
            if (r2 == 0) goto L91
            goto Ldd
        L91:
            java.util.regex.Pattern r2 = org.jacoco.core.internal.analysis.filter.KotlinInlineFilter.LINE_INFO_PATTERN     // Catch: java.io.IOException -> L5b
            java.util.regex.Matcher r2 = r2.matcher(r1)     // Catch: java.io.IOException -> L5b
            boolean r6 = r2.matches()     // Catch: java.io.IOException -> L5b
            if (r6 == 0) goto Lc8
            java.lang.String r1 = r2.group(r5)     // Catch: java.io.IOException -> L5b
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.io.IOException -> L5b
            java.lang.String r6 = r2.group(r3)     // Catch: java.io.IOException -> L5b
            java.lang.String r6 = r6.substring(r5)     // Catch: java.io.IOException -> L5b
            int r6 = java.lang.Integer.parseInt(r6)     // Catch: java.io.IOException -> L5b
            r7 = 4
            java.lang.String r2 = r2.group(r7)     // Catch: java.io.IOException -> L5b
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.io.IOException -> L5b
            boolean r6 = r9.get(r6)     // Catch: java.io.IOException -> L5b
            if (r6 == 0) goto Lc3
            if (r1 != r2) goto Lc3
            goto L7c
        Lc3:
            int r8 = java.lang.Math.min(r2, r8)     // Catch: java.io.IOException -> L5b
            goto L7c
        Lc8:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.io.IOException -> L5b
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L5b
            r9.<init>()     // Catch: java.io.IOException -> L5b
            r9.append(r4)     // Catch: java.io.IOException -> L5b
            r9.append(r1)     // Catch: java.io.IOException -> L5b
            java.lang.String r9 = r9.toString()     // Catch: java.io.IOException -> L5b
            r8.<init>(r9)     // Catch: java.io.IOException -> L5b
            throw r8     // Catch: java.io.IOException -> L5b
        Ldd:
            return r8
        Lde:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.io.IOException -> L5b
            java.lang.String r9 = "Unexpected SMAP FileSection"
            r8.<init>(r9)     // Catch: java.io.IOException -> L5b
            throw r8     // Catch: java.io.IOException -> L5b
        Le6:
            java.lang.AssertionError r9 = new java.lang.AssertionError
            r9.<init>(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jacoco.core.internal.analysis.filter.KotlinInlineFilter.getFirstGeneratedLineNumber(java.lang.String, java.lang.String):int");
    }

    @Override // org.jacoco.core.internal.analysis.filter.IFilter
    public void filter(MethodNode methodNode, IFilterContext iFilterContext, IFilterOutput iFilterOutput) {
        if (iFilterContext.getSourceDebugExtension() != null && KotlinGeneratedFilter.isKotlinClass(iFilterContext)) {
            if (this.firstGeneratedLineNumber == -1) {
                this.firstGeneratedLineNumber = getFirstGeneratedLineNumber(iFilterContext.getSourceFileName(), iFilterContext.getSourceDebugExtension());
            }
            Iterator<AbstractInsnNode> it = methodNode.instructions.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                AbstractInsnNode next = it.next();
                if (15 == next.getType()) {
                    i2 = ((LineNumberNode) next).line;
                }
                if (i2 >= this.firstGeneratedLineNumber) {
                    iFilterOutput.ignore(next, next);
                }
            }
        }
    }
}
