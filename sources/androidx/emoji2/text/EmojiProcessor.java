package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.KeyEvent;
import androidx.annotation.AnyThread;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.EmojiCompat;
import androidx.emoji2.text.MetadataRepo;
import androidx.emoji2.text.flatbuffer.MetadataItem;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
@AnyThread
@RequiresApi
@RestrictTo
/* loaded from: classes.dex */
public final class EmojiProcessor {

    /* renamed from: a, reason: collision with root package name */
    public final EmojiCompat.SpanFactory f19526a;

    /* renamed from: b, reason: collision with root package name */
    public final MetadataRepo f19527b;

    /* renamed from: c, reason: collision with root package name */
    public final EmojiCompat.GlyphChecker f19528c;
    public final boolean d = false;
    public final int[] e = null;

    @RequiresApi
    /* loaded from: classes.dex */
    public static final class CodepointIndexFinder {
    }

    /* loaded from: classes.dex */
    public static class EmojiProcessAddSpanCallback implements EmojiProcessCallback<UnprecomputeTextOnModificationSpannable> {

        /* renamed from: a, reason: collision with root package name */
        public UnprecomputeTextOnModificationSpannable f19529a;

        /* renamed from: b, reason: collision with root package name */
        public final EmojiCompat.SpanFactory f19530b;

        public EmojiProcessAddSpanCallback(UnprecomputeTextOnModificationSpannable unprecomputeTextOnModificationSpannable, EmojiCompat.SpanFactory spanFactory) {
            this.f19529a = unprecomputeTextOnModificationSpannable;
            this.f19530b = spanFactory;
        }

        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public final boolean a(CharSequence charSequence, int i2, int i3, TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
            if ((typefaceEmojiRasterizer.f19563c & 4) > 0) {
                return true;
            }
            if (this.f19529a == null) {
                this.f19529a = new UnprecomputeTextOnModificationSpannable(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
            }
            this.f19529a.setSpan(this.f19530b.a(typefaceEmojiRasterizer), i2, i3, 33);
            return true;
        }

        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public final Object getResult() {
            return this.f19529a;
        }
    }

    /* loaded from: classes.dex */
    public interface EmojiProcessCallback<T> {
        boolean a(CharSequence charSequence, int i2, int i3, TypefaceEmojiRasterizer typefaceEmojiRasterizer);

        Object getResult();
    }

    /* loaded from: classes.dex */
    public static class EmojiProcessLookupCallback implements EmojiProcessCallback<EmojiProcessLookupCallback> {

        /* renamed from: a, reason: collision with root package name */
        public final int f19531a;

        /* renamed from: b, reason: collision with root package name */
        public int f19532b = -1;

        /* renamed from: c, reason: collision with root package name */
        public int f19533c = -1;

        public EmojiProcessLookupCallback(int i2) {
            this.f19531a = i2;
        }

        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public final boolean a(CharSequence charSequence, int i2, int i3, TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
            int i4 = this.f19531a;
            if (i2 > i4 || i4 >= i3) {
                return i3 <= i4;
            }
            this.f19532b = i2;
            this.f19533c = i3;
            return false;
        }

        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public final Object getResult() {
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static class MarkExclusionCallback implements EmojiProcessCallback<MarkExclusionCallback> {

        /* renamed from: a, reason: collision with root package name */
        public final String f19534a;

        public MarkExclusionCallback(String str) {
            this.f19534a = str;
        }

        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public final boolean a(CharSequence charSequence, int i2, int i3, TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
            if (!TextUtils.equals(charSequence.subSequence(i2, i3), this.f19534a)) {
                return true;
            }
            typefaceEmojiRasterizer.f19563c = (typefaceEmojiRasterizer.f19563c & 3) | 4;
            return false;
        }

        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public final Object getResult() {
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static final class ProcessorSm {

        /* renamed from: a, reason: collision with root package name */
        public int f19535a = 1;

        /* renamed from: b, reason: collision with root package name */
        public final MetadataRepo.Node f19536b;

        /* renamed from: c, reason: collision with root package name */
        public MetadataRepo.Node f19537c;
        public MetadataRepo.Node d;
        public int e;

        /* renamed from: f, reason: collision with root package name */
        public int f19538f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f19539g;

        /* renamed from: h, reason: collision with root package name */
        public final int[] f19540h;

        public ProcessorSm(MetadataRepo.Node node, boolean z2, int[] iArr) {
            this.f19536b = node;
            this.f19537c = node;
            this.f19539g = z2;
            this.f19540h = iArr;
        }

        public final void a() {
            this.f19535a = 1;
            this.f19537c = this.f19536b;
            this.f19538f = 0;
        }

        public final boolean b() {
            int[] iArr;
            MetadataItem c2 = this.f19537c.f19556b.c();
            int a2 = c2.a(6);
            if ((a2 == 0 || c2.f19585b.get(a2 + c2.f19584a) == 0) && this.e != 65039) {
                return this.f19539g && ((iArr = this.f19540h) == null || Arrays.binarySearch(iArr, this.f19537c.f19556b.a(0)) < 0);
            }
            return true;
        }
    }

    public EmojiProcessor(MetadataRepo metadataRepo, EmojiCompat.DefaultSpanFactory defaultSpanFactory, EmojiCompat.GlyphChecker glyphChecker, Set set) {
        this.f19526a = defaultSpanFactory;
        this.f19527b = metadataRepo;
        this.f19528c = glyphChecker;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            c(str, 0, str.length(), 1, true, new MarkExclusionCallback(str));
        }
    }

    public static boolean a(Editable editable, KeyEvent keyEvent, boolean z2) {
        EmojiSpan[] emojiSpanArr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (emojiSpanArr = (EmojiSpan[]) editable.getSpans(selectionStart, selectionEnd, EmojiSpan.class)) != null && emojiSpanArr.length > 0) {
            for (EmojiSpan emojiSpan : emojiSpanArr) {
                int spanStart = editable.getSpanStart(emojiSpan);
                int spanEnd = editable.getSpanEnd(emojiSpan);
                if ((z2 && spanStart == selectionStart) || ((!z2 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean b(CharSequence charSequence, int i2, int i3, TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
        if ((typefaceEmojiRasterizer.f19563c & 3) == 0) {
            EmojiCompat.GlyphChecker glyphChecker = this.f19528c;
            MetadataItem c2 = typefaceEmojiRasterizer.c();
            int a2 = c2.a(8);
            if (a2 != 0) {
                c2.f19585b.getShort(a2 + c2.f19584a);
            }
            boolean a3 = glyphChecker.a(charSequence, i2, i3);
            int i4 = typefaceEmojiRasterizer.f19563c & 4;
            typefaceEmojiRasterizer.f19563c = a3 ? i4 | 2 : i4 | 1;
        }
        return (typefaceEmojiRasterizer.f19563c & 3) == 2;
    }

    public final Object c(CharSequence charSequence, int i2, int i3, int i4, boolean z2, EmojiProcessCallback emojiProcessCallback) {
        int i5;
        char c2;
        ProcessorSm processorSm = new ProcessorSm(this.f19527b.f19554c, this.d, this.e);
        int codePointAt = Character.codePointAt(charSequence, i2);
        boolean z3 = true;
        int i6 = 0;
        int i7 = i2;
        loop0: while (true) {
            i5 = i7;
            while (i7 < i3 && i6 < i4 && z3) {
                SparseArray sparseArray = processorSm.f19537c.f19555a;
                MetadataRepo.Node node = sparseArray == null ? null : (MetadataRepo.Node) sparseArray.get(codePointAt);
                if (processorSm.f19535a == 2) {
                    if (node != null) {
                        processorSm.f19537c = node;
                        processorSm.f19538f++;
                    } else {
                        if (codePointAt == 65038) {
                            processorSm.a();
                        } else if (codePointAt != 65039) {
                            MetadataRepo.Node node2 = processorSm.f19537c;
                            if (node2.f19556b != null) {
                                if (processorSm.f19538f != 1) {
                                    processorSm.d = node2;
                                    processorSm.a();
                                } else if (processorSm.b()) {
                                    processorSm.d = processorSm.f19537c;
                                    processorSm.a();
                                } else {
                                    processorSm.a();
                                }
                                c2 = 3;
                            } else {
                                processorSm.a();
                            }
                        }
                        c2 = 1;
                    }
                    c2 = 2;
                } else if (node == null) {
                    processorSm.a();
                    c2 = 1;
                } else {
                    processorSm.f19535a = 2;
                    processorSm.f19537c = node;
                    processorSm.f19538f = 1;
                    c2 = 2;
                }
                processorSm.e = codePointAt;
                if (c2 == 1) {
                    i7 = Character.charCount(Character.codePointAt(charSequence, i5)) + i5;
                    if (i7 < i3) {
                        codePointAt = Character.codePointAt(charSequence, i7);
                    }
                } else if (c2 == 2) {
                    int charCount = Character.charCount(codePointAt) + i7;
                    if (charCount < i3) {
                        codePointAt = Character.codePointAt(charSequence, charCount);
                    }
                    i7 = charCount;
                } else if (c2 == 3) {
                    if (z2 || !b(charSequence, i5, i7, processorSm.d.f19556b)) {
                        z3 = emojiProcessCallback.a(charSequence, i5, i7, processorSm.d.f19556b);
                        i6++;
                    }
                }
            }
        }
        if (processorSm.f19535a == 2 && processorSm.f19537c.f19556b != null && ((processorSm.f19538f > 1 || processorSm.b()) && i6 < i4 && z3 && (z2 || !b(charSequence, i5, i7, processorSm.f19537c.f19556b)))) {
            emojiProcessCallback.a(charSequence, i5, i7, processorSm.f19537c.f19556b);
        }
        return emojiProcessCallback.getResult();
    }
}
