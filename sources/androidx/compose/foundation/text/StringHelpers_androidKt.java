package androidx.compose.foundation.text;

/* loaded from: classes4.dex */
public final class StringHelpers_androidKt {
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r0.d() == 1) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int a(int r4, java.lang.String r5) {
        /*
            boolean r0 = androidx.emoji2.text.EmojiCompat.g()
            r1 = 0
            if (r0 == 0) goto L13
            androidx.emoji2.text.EmojiCompat r0 = androidx.emoji2.text.EmojiCompat.a()
            int r2 = r0.d()
            r3 = 1
            if (r2 != r3) goto L13
            goto L14
        L13:
            r0 = r1
        L14:
            if (r0 == 0) goto L27
            int r0 = r0.b(r4, r5)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r2 = r0.intValue()
            r3 = -1
            if (r2 != r3) goto L26
            goto L27
        L26:
            r1 = r0
        L27:
            if (r1 == 0) goto L2e
            int r4 = r1.intValue()
            return r4
        L2e:
            java.text.BreakIterator r0 = java.text.BreakIterator.getCharacterInstance()
            r0.setText(r5)
            int r4 = r0.following(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.StringHelpers_androidKt.a(int, java.lang.String):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r0.d() == 1) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int b(int r4, java.lang.String r5) {
        /*
            boolean r0 = androidx.emoji2.text.EmojiCompat.g()
            r1 = 0
            if (r0 == 0) goto L13
            androidx.emoji2.text.EmojiCompat r0 = androidx.emoji2.text.EmojiCompat.a()
            int r2 = r0.d()
            r3 = 1
            if (r2 != r3) goto L13
            goto L14
        L13:
            r0 = r1
        L14:
            if (r0 == 0) goto L2e
            int r2 = r4 + (-1)
            r3 = 0
            int r2 = java.lang.Math.max(r3, r2)
            int r0 = r0.c(r2, r5)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r2 = r0.intValue()
            r3 = -1
            if (r2 != r3) goto L2d
            goto L2e
        L2d:
            r1 = r0
        L2e:
            if (r1 == 0) goto L35
            int r4 = r1.intValue()
            return r4
        L35:
            java.text.BreakIterator r0 = java.text.BreakIterator.getCharacterInstance()
            r0.setText(r5)
            int r4 = r0.preceding(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.StringHelpers_androidKt.b(int, java.lang.String):int");
    }
}
