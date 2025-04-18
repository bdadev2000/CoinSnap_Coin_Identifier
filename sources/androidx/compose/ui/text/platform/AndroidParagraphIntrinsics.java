package androidx.compose.ui.text.platform;

import android.text.Layout;
import android.text.TextPaint;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.node.a;
import androidx.compose.ui.text.ParagraphIntrinsics;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.android.CharSequenceCharacterIterator;
import androidx.compose.ui.text.android.LayoutIntrinsics;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.Density;
import androidx.emoji2.text.EmojiCompat;
import d0.k;
import java.text.BreakIterator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

@StabilityInferred
/* loaded from: classes4.dex */
public final class AndroidParagraphIntrinsics implements ParagraphIntrinsics {

    /* renamed from: a, reason: collision with root package name */
    public final String f17406a;

    /* renamed from: b, reason: collision with root package name */
    public final TextStyle f17407b;

    /* renamed from: c, reason: collision with root package name */
    public final List f17408c;
    public final List d;
    public final FontFamily.Resolver e;

    /* renamed from: f, reason: collision with root package name */
    public final Density f17409f;

    /* renamed from: g, reason: collision with root package name */
    public final AndroidTextPaint f17410g;

    /* renamed from: h, reason: collision with root package name */
    public final CharSequence f17411h;

    /* renamed from: i, reason: collision with root package name */
    public final LayoutIntrinsics f17412i;

    /* renamed from: j, reason: collision with root package name */
    public TypefaceDirtyTrackerLinkedList f17413j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f17414k;

    /* renamed from: l, reason: collision with root package name */
    public final int f17415l;

    /* JADX WARN: Code restructure failed: missing block: B:283:0x00b7, code lost:
    
        if (r9 == 1) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x014f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0270 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00c5  */
    /* JADX WARN: Type inference failed for: r11v45, types: [androidx.compose.ui.text.platform.extensions.LocaleListHelperMethods] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v3, types: [androidx.compose.ui.text.platform.AndroidTextPaint, android.text.TextPaint, android.graphics.Paint] */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v20, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22, types: [android.text.Spanned, java.lang.CharSequence, android.text.Spannable] */
    /* JADX WARN: Type inference failed for: r7v24, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v40 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AndroidParagraphIntrinsics(androidx.compose.ui.text.TextStyle r41, androidx.compose.ui.text.font.FontFamily.Resolver r42, androidx.compose.ui.unit.Density r43, java.lang.String r44, java.util.List r45, java.util.List r46) {
        /*
            Method dump skipped, instructions count: 1436
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.platform.AndroidParagraphIntrinsics.<init>(androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.font.FontFamily$Resolver, androidx.compose.ui.unit.Density, java.lang.String, java.util.List, java.util.List):void");
    }

    @Override // androidx.compose.ui.text.ParagraphIntrinsics
    public final boolean a() {
        TypefaceDirtyTrackerLinkedList typefaceDirtyTrackerLinkedList = this.f17413j;
        if (typefaceDirtyTrackerLinkedList == null || !typefaceDirtyTrackerLinkedList.a()) {
            if (!this.f17414k && AndroidParagraphIntrinsics_androidKt.a(this.f17407b)) {
                EmojiCompatStatusDelegate emojiCompatStatusDelegate = EmojiCompatStatus.f17430a;
                DefaultImpl defaultImpl = (DefaultImpl) EmojiCompatStatus.f17430a;
                State state = defaultImpl.f17426a;
                if (state == null) {
                    if (EmojiCompat.g()) {
                        state = defaultImpl.a();
                        defaultImpl.f17426a = state;
                    } else {
                        state = EmojiCompatStatus_androidKt.f17431a;
                    }
                }
                if (((Boolean) state.getValue()).booleanValue()) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // androidx.compose.ui.text.ParagraphIntrinsics
    public final float b() {
        return this.f17412i.b();
    }

    @Override // androidx.compose.ui.text.ParagraphIntrinsics
    public final float c() {
        LayoutIntrinsics layoutIntrinsics = this.f17412i;
        if (!Float.isNaN(layoutIntrinsics.e)) {
            return layoutIntrinsics.e;
        }
        TextPaint textPaint = layoutIntrinsics.f17084b;
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = layoutIntrinsics.f17083a;
        lineInstance.setText(new CharSequenceCharacterIterator(charSequence, charSequence.length()));
        PriorityQueue priorityQueue = new PriorityQueue(10, new a(1));
        int i2 = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new k(Integer.valueOf(i2), Integer.valueOf(next)));
            } else {
                k kVar = (k) priorityQueue.peek();
                if (kVar != null && ((Number) kVar.f30135b).intValue() - ((Number) kVar.f30134a).intValue() < next - i2) {
                    priorityQueue.poll();
                    priorityQueue.add(new k(Integer.valueOf(i2), Integer.valueOf(next)));
                }
            }
            i2 = next;
        }
        Iterator it = priorityQueue.iterator();
        float f2 = 0.0f;
        while (it.hasNext()) {
            k kVar2 = (k) it.next();
            f2 = Math.max(f2, Layout.getDesiredWidth(charSequence, ((Number) kVar2.f30134a).intValue(), ((Number) kVar2.f30135b).intValue(), textPaint));
        }
        layoutIntrinsics.e = f2;
        return f2;
    }
}
