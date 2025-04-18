package f9;

import a9.g;
import androidx.recyclerview.widget.y1;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import n9.h0;
import n9.x;
import ra.f;
import v8.u0;

/* loaded from: classes3.dex */
public final class a extends g {

    /* renamed from: r, reason: collision with root package name */
    public static final Pattern f17723r = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* renamed from: m, reason: collision with root package name */
    public final boolean f17724m;

    /* renamed from: n, reason: collision with root package name */
    public final y1 f17725n;

    /* renamed from: o, reason: collision with root package name */
    public LinkedHashMap f17726o;

    /* renamed from: p, reason: collision with root package name */
    public float f17727p = -3.4028235E38f;

    /* renamed from: q, reason: collision with root package name */
    public float f17728q = -3.4028235E38f;

    public a(List list) {
        if (list != null && !list.isEmpty()) {
            this.f17724m = true;
            String l10 = h0.l((byte[]) list.get(0));
            u0.d(l10.startsWith("Format:"));
            y1 b3 = y1.b(l10);
            b3.getClass();
            this.f17725n = b3;
            f(new x((byte[]) list.get(1)), f.f24049c);
            return;
        }
        this.f17724m = false;
        this.f17725n = null;
    }

    public static int e(long j3, ArrayList arrayList, ArrayList arrayList2) {
        int i10;
        ArrayList arrayList3;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                if (((Long) arrayList.get(size)).longValue() == j3) {
                    return size;
                }
                if (((Long) arrayList.get(size)).longValue() < j3) {
                    i10 = size + 1;
                    break;
                }
            } else {
                i10 = 0;
                break;
            }
        }
        arrayList.add(i10, Long.valueOf(j3));
        if (i10 == 0) {
            arrayList3 = new ArrayList();
        } else {
            arrayList3 = new ArrayList((Collection) arrayList2.get(i10 - 1));
        }
        arrayList2.add(i10, arrayList3);
        return i10;
    }

    public static long g(String str) {
        Matcher matcher = f17723r.matcher(str.trim());
        if (!matcher.matches()) {
            return C.TIME_UNSET;
        }
        String group = matcher.group(1);
        int i10 = h0.a;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60 * 1000000) + (Long.parseLong(group) * 60 * 60 * 1000000);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0225, code lost:
    
        r7.f348g = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0227, code lost:
    
        if (r13 == null) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x022b, code lost:
    
        if (r14 == (-3.4028235E38f)) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x022f, code lost:
    
        if (r12 == (-3.4028235E38f)) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0231, code lost:
    
        r7.f349h = r13.x / r12;
        r7.f346e = r13.y / r14;
        r7.f347f = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x026c, code lost:
    
        r0 = r7.a();
        r3 = e(r9, r2, r1);
        r4 = e(r17, r2, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x027a, code lost:
    
        if (r3 >= r4) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x027c, code lost:
    
        ((java.util.List) r1.get(r3)).add(r0);
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x023f, code lost:
    
        r0 = r7.f350i;
        r4 = 0.95f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x024b, code lost:
    
        if (r0 == 0) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x024d, code lost:
    
        if (r0 == 1) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x024f, code lost:
    
        if (r0 == 2) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0251, code lost:
    
        r0 = -3.4028235E38f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0259, code lost:
    
        r7.f349h = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x025b, code lost:
    
        if (r3 == 0) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x025d, code lost:
    
        if (r3 == 1) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x025f, code lost:
    
        if (r3 == 2) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0261, code lost:
    
        r4 = -3.4028235E38f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0267, code lost:
    
        r7.f346e = r4;
        r7.f347f = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0264, code lost:
    
        r4 = 0.5f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0266, code lost:
    
        r4 = 0.05f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0254, code lost:
    
        r0 = 0.95f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0256, code lost:
    
        r0 = 0.5f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0258, code lost:
    
        r0 = 0.05f;
     */
    @Override // a9.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final a9.h b(byte[] r20, int r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 750
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f9.a.b(byte[], int, boolean):a9.h");
    }

    /* JADX WARN: Removed duplicated region for block: B:195:0x0034 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0017 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0294 A[Catch: RuntimeException -> 0x02c8, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x02c8, blocks: (B:49:0x01cf, B:51:0x01dd, B:52:0x01ec, B:54:0x01f0, B:55:0x01ff, B:57:0x0203, B:58:0x0212, B:60:0x0216, B:62:0x021c, B:63:0x023a, B:65:0x0240, B:68:0x0251, B:70:0x0255, B:73:0x0266, B:75:0x026a, B:78:0x027b, B:80:0x027f, B:83:0x0290, B:85:0x0294, B:87:0x029a, B:94:0x02c2, B:95:0x02af, B:107:0x0223), top: B:48:0x01cf, inners: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(n9.x r39, java.nio.charset.Charset r40) {
        /*
            Method dump skipped, instructions count: 842
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f9.a.f(n9.x, java.nio.charset.Charset):void");
    }
}
