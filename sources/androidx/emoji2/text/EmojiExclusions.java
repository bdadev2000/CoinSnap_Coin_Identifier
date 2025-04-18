package androidx.emoji2.text;

import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes4.dex */
class EmojiExclusions {

    @RequiresApi
    /* loaded from: classes4.dex */
    public static class EmojiExclusions_Api34 {
        @NonNull
        @DoNotInline
        public static Set<int[]> a() {
            return EmojiExclusions_Reflections.a();
        }
    }

    /* loaded from: classes4.dex */
    public static class EmojiExclusions_Reflections {
        public static Set a() {
            try {
                Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", new Class[0]).invoke(null, new Object[0]);
                if (invoke == null) {
                    return Collections.emptySet();
                }
                Set set = (Set) invoke;
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    if (!(it.next() instanceof int[])) {
                        return Collections.emptySet();
                    }
                }
                return set;
            } catch (Throwable unused) {
                return Collections.emptySet();
            }
        }
    }
}
