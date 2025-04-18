package z;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.MotionEventCompat;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.io.encoding.Base64;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import mb.y1;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f28439d = {0, 4, 8};

    /* renamed from: e, reason: collision with root package name */
    public static final SparseIntArray f28440e;

    /* renamed from: f, reason: collision with root package name */
    public static final SparseIntArray f28441f;
    public final HashMap a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f28442b = true;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f28443c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f28440e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f28441f = sparseIntArray2;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(101, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }

    public static int[] c(a aVar, String str) {
        int i10;
        HashMap hashMap;
        String[] split = str.split(",");
        Context context = aVar.getContext();
        int[] iArr = new int[split.length];
        int i11 = 0;
        int i12 = 0;
        while (i11 < split.length) {
            String trim = split[i11].trim();
            Object obj = null;
            try {
                i10 = q.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i10 = 0;
            }
            if (i10 == 0) {
                i10 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i10 == 0 && aVar.isInEditMode() && (aVar.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) aVar.getParent();
                constraintLayout.getClass();
                if ((trim instanceof String) && (hashMap = constraintLayout.f1141o) != null && hashMap.containsKey(trim)) {
                    obj = constraintLayout.f1141o.get(trim);
                }
                if (obj != null && (obj instanceof Integer)) {
                    i10 = ((Integer) obj).intValue();
                }
            }
            iArr[i12] = i10;
            i11++;
            i12++;
        }
        if (i12 != split.length) {
            return Arrays.copyOf(iArr, i12);
        }
        return iArr;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:126:0x05d9. Please report as an issue. */
    public static i d(Context context, AttributeSet attributeSet, boolean z10) {
        String str;
        String[] strArr;
        String str2;
        h hVar;
        i iVar = new i();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z10 ? r.f28446c : r.a);
        String[] strArr2 = y1.f22138e;
        int[] iArr = f28439d;
        SparseIntArray sparseIntArray = f28440e;
        l lVar = iVar.f28369b;
        m mVar = iVar.f28372e;
        k kVar = iVar.f28370c;
        j jVar = iVar.f28371d;
        String str3 = "unused attribute 0x";
        if (z10) {
            int indexCount = obtainStyledAttributes.getIndexCount();
            String str4 = "Unknown attribute 0x";
            h hVar2 = new h();
            kVar.getClass();
            jVar.getClass();
            lVar.getClass();
            mVar.getClass();
            int i10 = 0;
            while (i10 < indexCount) {
                int i11 = indexCount;
                int index = obtainStyledAttributes.getIndex(i10);
                int i12 = i10;
                switch (f28441f.get(index)) {
                    case 2:
                        strArr = strArr2;
                        hVar2.b(2, obtainStyledAttributes.getDimensionPixelSize(index, jVar.I));
                        break;
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case 25:
                    case 26:
                    case NOTIFICATION_REDIRECT_VALUE:
                    case 30:
                    case 32:
                    case 33:
                    case MotionEventCompat.AXIS_GENERIC_4 /* 35 */:
                    case 36:
                    case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    case 88:
                    case TsExtractor.TS_STREAM_TYPE_DVBSUBS /* 89 */:
                    case 90:
                    case 91:
                    case 92:
                    default:
                        strArr = strArr2;
                        str2 = str4;
                        StringBuilder sb2 = new StringBuilder(str2);
                        hVar = hVar2;
                        sb2.append(Integer.toHexString(index));
                        sb2.append("   ");
                        sb2.append(sparseIntArray.get(index));
                        Log.w("ConstraintSet", sb2.toString());
                        continue;
                    case 5:
                        strArr = strArr2;
                        hVar2.c(5, obtainStyledAttributes.getString(index));
                        break;
                    case 6:
                        strArr = strArr2;
                        hVar2.b(6, obtainStyledAttributes.getDimensionPixelOffset(index, jVar.C));
                        break;
                    case 7:
                        strArr = strArr2;
                        hVar2.b(7, obtainStyledAttributes.getDimensionPixelOffset(index, jVar.D));
                        break;
                    case 8:
                        strArr = strArr2;
                        hVar2.b(8, obtainStyledAttributes.getDimensionPixelSize(index, jVar.J));
                        break;
                    case 11:
                        strArr = strArr2;
                        hVar2.b(11, obtainStyledAttributes.getDimensionPixelSize(index, jVar.P));
                        break;
                    case 12:
                        strArr = strArr2;
                        hVar2.b(12, obtainStyledAttributes.getDimensionPixelSize(index, jVar.Q));
                        break;
                    case 13:
                        strArr = strArr2;
                        hVar2.b(13, obtainStyledAttributes.getDimensionPixelSize(index, jVar.M));
                        break;
                    case 14:
                        strArr = strArr2;
                        hVar2.b(14, obtainStyledAttributes.getDimensionPixelSize(index, jVar.O));
                        break;
                    case 15:
                        strArr = strArr2;
                        hVar2.b(15, obtainStyledAttributes.getDimensionPixelSize(index, jVar.R));
                        break;
                    case 16:
                        strArr = strArr2;
                        hVar2.b(16, obtainStyledAttributes.getDimensionPixelSize(index, jVar.N));
                        break;
                    case 17:
                        strArr = strArr2;
                        hVar2.b(17, obtainStyledAttributes.getDimensionPixelOffset(index, jVar.f28380d));
                        break;
                    case 18:
                        strArr = strArr2;
                        hVar2.b(18, obtainStyledAttributes.getDimensionPixelOffset(index, jVar.f28382e));
                        break;
                    case 19:
                        strArr = strArr2;
                        hVar2.a(obtainStyledAttributes.getFloat(index, jVar.f28384f), 19);
                        break;
                    case 20:
                        strArr = strArr2;
                        hVar2.a(obtainStyledAttributes.getFloat(index, jVar.f28410w), 20);
                        break;
                    case 21:
                        strArr = strArr2;
                        hVar2.b(21, obtainStyledAttributes.getLayoutDimension(index, jVar.f28378c));
                        break;
                    case 22:
                        strArr = strArr2;
                        hVar2.b(22, iArr[obtainStyledAttributes.getInt(index, lVar.a)]);
                        break;
                    case 23:
                        strArr = strArr2;
                        hVar2.b(23, obtainStyledAttributes.getLayoutDimension(index, jVar.f28376b));
                        break;
                    case 24:
                        strArr = strArr2;
                        hVar2.b(24, obtainStyledAttributes.getDimensionPixelSize(index, jVar.F));
                        break;
                    case 27:
                        strArr = strArr2;
                        hVar2.b(27, obtainStyledAttributes.getInt(index, jVar.E));
                        break;
                    case 28:
                        strArr = strArr2;
                        hVar2.b(28, obtainStyledAttributes.getDimensionPixelSize(index, jVar.G));
                        break;
                    case TEMPLATE_HTML_SIZE_VALUE:
                        strArr = strArr2;
                        hVar2.b(31, obtainStyledAttributes.getDimensionPixelSize(index, jVar.K));
                        break;
                    case MotionEventCompat.AXIS_GENERIC_3 /* 34 */:
                        strArr = strArr2;
                        hVar2.b(34, obtainStyledAttributes.getDimensionPixelSize(index, jVar.H));
                        break;
                    case MotionEventCompat.AXIS_GENERIC_6 /* 37 */:
                        strArr = strArr2;
                        hVar2.a(obtainStyledAttributes.getFloat(index, jVar.f28411x), 37);
                        break;
                    case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                        strArr = strArr2;
                        int resourceId = obtainStyledAttributes.getResourceId(index, iVar.a);
                        iVar.a = resourceId;
                        hVar2.b(38, resourceId);
                        break;
                    case MotionEventCompat.AXIS_GENERIC_8 /* 39 */:
                        strArr = strArr2;
                        hVar2.a(obtainStyledAttributes.getFloat(index, jVar.U), 39);
                        break;
                    case MotionEventCompat.AXIS_GENERIC_9 /* 40 */:
                        strArr = strArr2;
                        hVar2.a(obtainStyledAttributes.getFloat(index, jVar.T), 40);
                        break;
                    case MotionEventCompat.AXIS_GENERIC_10 /* 41 */:
                        strArr = strArr2;
                        hVar2.b(41, obtainStyledAttributes.getInt(index, jVar.V));
                        break;
                    case MotionEventCompat.AXIS_GENERIC_11 /* 42 */:
                        strArr = strArr2;
                        hVar2.b(42, obtainStyledAttributes.getInt(index, jVar.W));
                        break;
                    case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                        strArr = strArr2;
                        hVar2.a(obtainStyledAttributes.getFloat(index, lVar.f28424c), 43);
                        break;
                    case MotionEventCompat.AXIS_GENERIC_13 /* 44 */:
                        strArr = strArr2;
                        hVar2.d(44, true);
                        hVar2.a(obtainStyledAttributes.getDimension(index, mVar.f28438m), 44);
                        break;
                    case MotionEventCompat.AXIS_GENERIC_14 /* 45 */:
                        strArr = strArr2;
                        hVar2.a(obtainStyledAttributes.getFloat(index, mVar.f28427b), 45);
                        break;
                    case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                        strArr = strArr2;
                        hVar2.a(obtainStyledAttributes.getFloat(index, mVar.f28428c), 46);
                        break;
                    case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                        strArr = strArr2;
                        hVar2.a(obtainStyledAttributes.getFloat(index, mVar.f28429d), 47);
                        break;
                    case 48:
                        strArr = strArr2;
                        hVar2.a(obtainStyledAttributes.getFloat(index, mVar.f28430e), 48);
                        break;
                    case 49:
                        strArr = strArr2;
                        hVar2.a(obtainStyledAttributes.getDimension(index, mVar.f28431f), 49);
                        break;
                    case TTAdConstant.IMAGE_MODE_VIDEO_SQUARE /* 50 */:
                        strArr = strArr2;
                        hVar2.a(obtainStyledAttributes.getDimension(index, mVar.f28432g), 50);
                        break;
                    case 51:
                        strArr = strArr2;
                        hVar2.a(obtainStyledAttributes.getDimension(index, mVar.f28434i), 51);
                        break;
                    case 52:
                        strArr = strArr2;
                        hVar2.a(obtainStyledAttributes.getDimension(index, mVar.f28435j), 52);
                        break;
                    case 53:
                        strArr = strArr2;
                        hVar2.a(obtainStyledAttributes.getDimension(index, mVar.f28436k), 53);
                        break;
                    case 54:
                        strArr = strArr2;
                        hVar2.b(54, obtainStyledAttributes.getInt(index, jVar.X));
                        break;
                    case 55:
                        strArr = strArr2;
                        hVar2.b(55, obtainStyledAttributes.getInt(index, jVar.Y));
                        break;
                    case 56:
                        strArr = strArr2;
                        hVar2.b(56, obtainStyledAttributes.getDimensionPixelSize(index, jVar.Z));
                        break;
                    case 57:
                        strArr = strArr2;
                        hVar2.b(57, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f28375a0));
                        break;
                    case 58:
                        strArr = strArr2;
                        hVar2.b(58, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f28377b0));
                        break;
                    case 59:
                        strArr = strArr2;
                        hVar2.b(59, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f28379c0));
                        break;
                    case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                        strArr = strArr2;
                        hVar2.a(obtainStyledAttributes.getFloat(index, mVar.a), 60);
                        break;
                    case 62:
                        strArr = strArr2;
                        hVar2.b(62, obtainStyledAttributes.getDimensionPixelSize(index, jVar.A));
                        break;
                    case 63:
                        strArr = strArr2;
                        hVar2.a(obtainStyledAttributes.getFloat(index, jVar.B), 63);
                        break;
                    case 64:
                        strArr = strArr2;
                        hVar2.b(64, f(obtainStyledAttributes, index, kVar.a));
                        break;
                    case 65:
                        strArr = strArr2;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            hVar2.c(65, obtainStyledAttributes.getString(index));
                            break;
                        } else {
                            hVar2.c(65, strArr[obtainStyledAttributes.getInteger(index, 0)]);
                            break;
                        }
                    case 66:
                        strArr = strArr2;
                        hVar2.b(66, obtainStyledAttributes.getInt(index, 0));
                        break;
                    case 67:
                        strArr = strArr2;
                        hVar2.a(obtainStyledAttributes.getFloat(index, kVar.f28418e), 67);
                        break;
                    case 68:
                        strArr = strArr2;
                        hVar2.a(obtainStyledAttributes.getFloat(index, lVar.f28425d), 68);
                        break;
                    case 69:
                        strArr = strArr2;
                        hVar2.a(obtainStyledAttributes.getFloat(index, 1.0f), 69);
                        break;
                    case 70:
                        strArr = strArr2;
                        hVar2.a(obtainStyledAttributes.getFloat(index, 1.0f), 70);
                        break;
                    case 71:
                        strArr = strArr2;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        strArr = strArr2;
                        hVar2.b(72, obtainStyledAttributes.getInt(index, jVar.f28385f0));
                        break;
                    case 73:
                        strArr = strArr2;
                        hVar2.b(73, obtainStyledAttributes.getDimensionPixelSize(index, jVar.f28387g0));
                        break;
                    case 74:
                        strArr = strArr2;
                        hVar2.c(74, obtainStyledAttributes.getString(index));
                        break;
                    case 75:
                        strArr = strArr2;
                        hVar2.d(75, obtainStyledAttributes.getBoolean(index, jVar.f28401n0));
                        break;
                    case Base64.mimeLineLength /* 76 */:
                        strArr = strArr2;
                        hVar2.b(76, obtainStyledAttributes.getInt(index, kVar.f28416c));
                        break;
                    case 77:
                        strArr = strArr2;
                        hVar2.c(77, obtainStyledAttributes.getString(index));
                        break;
                    case 78:
                        strArr = strArr2;
                        hVar2.b(78, obtainStyledAttributes.getInt(index, lVar.f28423b));
                        break;
                    case 79:
                        strArr = strArr2;
                        hVar2.a(obtainStyledAttributes.getFloat(index, kVar.f28417d), 79);
                        break;
                    case 80:
                        strArr = strArr2;
                        hVar2.d(80, obtainStyledAttributes.getBoolean(index, jVar.f28397l0));
                        break;
                    case 81:
                        strArr = strArr2;
                        hVar2.d(81, obtainStyledAttributes.getBoolean(index, jVar.f28399m0));
                        break;
                    case 82:
                        strArr = strArr2;
                        hVar2.b(82, obtainStyledAttributes.getInteger(index, kVar.f28415b));
                        break;
                    case 83:
                        strArr = strArr2;
                        hVar2.b(83, f(obtainStyledAttributes, index, mVar.f28433h));
                        break;
                    case 84:
                        strArr = strArr2;
                        hVar2.b(84, obtainStyledAttributes.getInteger(index, kVar.f28420g));
                        break;
                    case 85:
                        strArr = strArr2;
                        hVar2.a(obtainStyledAttributes.getFloat(index, kVar.f28419f), 85);
                        break;
                    case 86:
                        strArr = strArr2;
                        int i13 = obtainStyledAttributes.peekValue(index).type;
                        if (i13 != 1) {
                            if (i13 == 3) {
                                String string = obtainStyledAttributes.getString(index);
                                kVar.f28421h = string;
                                hVar2.c(90, string);
                                if (kVar.f28421h.indexOf("/") > 0) {
                                    int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                                    kVar.f28422i = resourceId2;
                                    hVar2.b(89, resourceId2);
                                    hVar2.b(88, -2);
                                    break;
                                } else {
                                    hVar2.b(88, -1);
                                    break;
                                }
                            } else {
                                hVar2.b(88, obtainStyledAttributes.getInteger(index, kVar.f28422i));
                                break;
                            }
                        } else {
                            int resourceId3 = obtainStyledAttributes.getResourceId(index, -1);
                            kVar.f28422i = resourceId3;
                            hVar2.b(89, resourceId3);
                            if (kVar.f28422i != -1) {
                                hVar2.b(88, -2);
                                break;
                            }
                        }
                        break;
                    case 87:
                        strArr = strArr2;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        break;
                    case 93:
                        strArr = strArr2;
                        hVar2.b(93, obtainStyledAttributes.getDimensionPixelSize(index, jVar.L));
                        break;
                    case 94:
                        strArr = strArr2;
                        hVar2.b(94, obtainStyledAttributes.getDimensionPixelSize(index, jVar.S));
                        break;
                    case 95:
                        strArr = strArr2;
                        g(hVar2, obtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        strArr = strArr2;
                        g(hVar2, obtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        strArr = strArr2;
                        hVar2.b(97, obtainStyledAttributes.getInt(index, jVar.f28403o0));
                        break;
                    case 98:
                        int i14 = y.a.f27683s;
                        strArr = strArr2;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            iVar.a = obtainStyledAttributes.getResourceId(index, iVar.a);
                            break;
                        }
                    case 99:
                        hVar2.d(99, obtainStyledAttributes.getBoolean(index, jVar.f28386g));
                        strArr = strArr2;
                        break;
                }
                str2 = str4;
                hVar = hVar2;
                indexCount = i11;
                hVar2 = hVar;
                str4 = str2;
                i10 = i12 + 1;
                strArr2 = strArr;
            }
        } else {
            int indexCount2 = obtainStyledAttributes.getIndexCount();
            int i15 = 0;
            while (i15 < indexCount2) {
                int index2 = obtainStyledAttributes.getIndex(i15);
                int i16 = indexCount2;
                if (index2 != 1 && 23 != index2) {
                    if (24 != index2) {
                        kVar.getClass();
                        jVar.getClass();
                        lVar.getClass();
                        mVar.getClass();
                    }
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        str = str3;
                        jVar.f28404p = f(obtainStyledAttributes, index2, jVar.f28404p);
                        break;
                    case 2:
                        str = str3;
                        jVar.I = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.I);
                        break;
                    case 3:
                        str = str3;
                        jVar.f28402o = f(obtainStyledAttributes, index2, jVar.f28402o);
                        break;
                    case 4:
                        str = str3;
                        jVar.f28400n = f(obtainStyledAttributes, index2, jVar.f28400n);
                        break;
                    case 5:
                        str = str3;
                        jVar.f28412y = obtainStyledAttributes.getString(index2);
                        break;
                    case 6:
                        str = str3;
                        jVar.C = obtainStyledAttributes.getDimensionPixelOffset(index2, jVar.C);
                        break;
                    case 7:
                        str = str3;
                        jVar.D = obtainStyledAttributes.getDimensionPixelOffset(index2, jVar.D);
                        break;
                    case 8:
                        str = str3;
                        jVar.J = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.J);
                        break;
                    case 9:
                        str = str3;
                        jVar.f28409v = f(obtainStyledAttributes, index2, jVar.f28409v);
                        break;
                    case 10:
                        str = str3;
                        jVar.u = f(obtainStyledAttributes, index2, jVar.u);
                        break;
                    case 11:
                        str = str3;
                        jVar.P = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.P);
                        break;
                    case 12:
                        str = str3;
                        jVar.Q = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.Q);
                        break;
                    case 13:
                        str = str3;
                        jVar.M = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.M);
                        break;
                    case 14:
                        str = str3;
                        jVar.O = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.O);
                        break;
                    case 15:
                        str = str3;
                        jVar.R = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.R);
                        break;
                    case 16:
                        str = str3;
                        jVar.N = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.N);
                        break;
                    case 17:
                        str = str3;
                        jVar.f28380d = obtainStyledAttributes.getDimensionPixelOffset(index2, jVar.f28380d);
                        break;
                    case 18:
                        str = str3;
                        jVar.f28382e = obtainStyledAttributes.getDimensionPixelOffset(index2, jVar.f28382e);
                        break;
                    case 19:
                        str = str3;
                        jVar.f28384f = obtainStyledAttributes.getFloat(index2, jVar.f28384f);
                        break;
                    case 20:
                        str = str3;
                        jVar.f28410w = obtainStyledAttributes.getFloat(index2, jVar.f28410w);
                        break;
                    case 21:
                        str = str3;
                        jVar.f28378c = obtainStyledAttributes.getLayoutDimension(index2, jVar.f28378c);
                        break;
                    case 22:
                        str = str3;
                        lVar.a = iArr[obtainStyledAttributes.getInt(index2, lVar.a)];
                        break;
                    case 23:
                        str = str3;
                        jVar.f28376b = obtainStyledAttributes.getLayoutDimension(index2, jVar.f28376b);
                        break;
                    case 24:
                        str = str3;
                        jVar.F = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.F);
                        break;
                    case 25:
                        str = str3;
                        jVar.f28388h = f(obtainStyledAttributes, index2, jVar.f28388h);
                        break;
                    case 26:
                        str = str3;
                        jVar.f28390i = f(obtainStyledAttributes, index2, jVar.f28390i);
                        break;
                    case 27:
                        str = str3;
                        jVar.E = obtainStyledAttributes.getInt(index2, jVar.E);
                        break;
                    case 28:
                        str = str3;
                        jVar.G = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.G);
                        break;
                    case NOTIFICATION_REDIRECT_VALUE:
                        str = str3;
                        jVar.f28392j = f(obtainStyledAttributes, index2, jVar.f28392j);
                        break;
                    case 30:
                        str = str3;
                        jVar.f28394k = f(obtainStyledAttributes, index2, jVar.f28394k);
                        break;
                    case TEMPLATE_HTML_SIZE_VALUE:
                        str = str3;
                        jVar.K = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.K);
                        break;
                    case 32:
                        str = str3;
                        jVar.f28407s = f(obtainStyledAttributes, index2, jVar.f28407s);
                        break;
                    case 33:
                        str = str3;
                        jVar.f28408t = f(obtainStyledAttributes, index2, jVar.f28408t);
                        break;
                    case MotionEventCompat.AXIS_GENERIC_3 /* 34 */:
                        str = str3;
                        jVar.H = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.H);
                        break;
                    case MotionEventCompat.AXIS_GENERIC_4 /* 35 */:
                        str = str3;
                        jVar.f28398m = f(obtainStyledAttributes, index2, jVar.f28398m);
                        break;
                    case 36:
                        str = str3;
                        jVar.f28396l = f(obtainStyledAttributes, index2, jVar.f28396l);
                        break;
                    case MotionEventCompat.AXIS_GENERIC_6 /* 37 */:
                        str = str3;
                        jVar.f28411x = obtainStyledAttributes.getFloat(index2, jVar.f28411x);
                        break;
                    case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                        str = str3;
                        iVar.a = obtainStyledAttributes.getResourceId(index2, iVar.a);
                        break;
                    case MotionEventCompat.AXIS_GENERIC_8 /* 39 */:
                        str = str3;
                        jVar.U = obtainStyledAttributes.getFloat(index2, jVar.U);
                        break;
                    case MotionEventCompat.AXIS_GENERIC_9 /* 40 */:
                        str = str3;
                        jVar.T = obtainStyledAttributes.getFloat(index2, jVar.T);
                        break;
                    case MotionEventCompat.AXIS_GENERIC_10 /* 41 */:
                        str = str3;
                        jVar.V = obtainStyledAttributes.getInt(index2, jVar.V);
                        break;
                    case MotionEventCompat.AXIS_GENERIC_11 /* 42 */:
                        str = str3;
                        jVar.W = obtainStyledAttributes.getInt(index2, jVar.W);
                        break;
                    case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                        str = str3;
                        lVar.f28424c = obtainStyledAttributes.getFloat(index2, lVar.f28424c);
                        break;
                    case MotionEventCompat.AXIS_GENERIC_13 /* 44 */:
                        str = str3;
                        mVar.f28437l = true;
                        mVar.f28438m = obtainStyledAttributes.getDimension(index2, mVar.f28438m);
                        break;
                    case MotionEventCompat.AXIS_GENERIC_14 /* 45 */:
                        str = str3;
                        mVar.f28427b = obtainStyledAttributes.getFloat(index2, mVar.f28427b);
                        break;
                    case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                        str = str3;
                        mVar.f28428c = obtainStyledAttributes.getFloat(index2, mVar.f28428c);
                        break;
                    case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                        str = str3;
                        mVar.f28429d = obtainStyledAttributes.getFloat(index2, mVar.f28429d);
                        break;
                    case 48:
                        str = str3;
                        mVar.f28430e = obtainStyledAttributes.getFloat(index2, mVar.f28430e);
                        break;
                    case 49:
                        str = str3;
                        mVar.f28431f = obtainStyledAttributes.getDimension(index2, mVar.f28431f);
                        break;
                    case TTAdConstant.IMAGE_MODE_VIDEO_SQUARE /* 50 */:
                        str = str3;
                        mVar.f28432g = obtainStyledAttributes.getDimension(index2, mVar.f28432g);
                        break;
                    case 51:
                        str = str3;
                        mVar.f28434i = obtainStyledAttributes.getDimension(index2, mVar.f28434i);
                        break;
                    case 52:
                        str = str3;
                        mVar.f28435j = obtainStyledAttributes.getDimension(index2, mVar.f28435j);
                        break;
                    case 53:
                        str = str3;
                        mVar.f28436k = obtainStyledAttributes.getDimension(index2, mVar.f28436k);
                        break;
                    case 54:
                        str = str3;
                        jVar.X = obtainStyledAttributes.getInt(index2, jVar.X);
                        break;
                    case 55:
                        str = str3;
                        jVar.Y = obtainStyledAttributes.getInt(index2, jVar.Y);
                        break;
                    case 56:
                        str = str3;
                        jVar.Z = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.Z);
                        break;
                    case 57:
                        str = str3;
                        jVar.f28375a0 = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f28375a0);
                        break;
                    case 58:
                        str = str3;
                        jVar.f28377b0 = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f28377b0);
                        break;
                    case 59:
                        str = str3;
                        jVar.f28379c0 = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f28379c0);
                        break;
                    case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                        str = str3;
                        mVar.a = obtainStyledAttributes.getFloat(index2, mVar.a);
                        break;
                    case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                        str = str3;
                        jVar.f28413z = f(obtainStyledAttributes, index2, jVar.f28413z);
                        break;
                    case 62:
                        str = str3;
                        jVar.A = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.A);
                        break;
                    case 63:
                        str = str3;
                        jVar.B = obtainStyledAttributes.getFloat(index2, jVar.B);
                        break;
                    case 64:
                        str = str3;
                        kVar.a = f(obtainStyledAttributes, index2, kVar.a);
                        break;
                    case 65:
                        str = str3;
                        if (obtainStyledAttributes.peekValue(index2).type == 3) {
                            obtainStyledAttributes.getString(index2);
                            kVar.getClass();
                            break;
                        } else {
                            String str5 = strArr2[obtainStyledAttributes.getInteger(index2, 0)];
                            kVar.getClass();
                            break;
                        }
                    case 66:
                        str = str3;
                        obtainStyledAttributes.getInt(index2, 0);
                        kVar.getClass();
                        break;
                    case 67:
                        str = str3;
                        kVar.f28418e = obtainStyledAttributes.getFloat(index2, kVar.f28418e);
                        break;
                    case 68:
                        str = str3;
                        lVar.f28425d = obtainStyledAttributes.getFloat(index2, lVar.f28425d);
                        break;
                    case 69:
                        str = str3;
                        jVar.f28381d0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 70:
                        str = str3;
                        jVar.f28383e0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 71:
                        str = str3;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        str = str3;
                        jVar.f28385f0 = obtainStyledAttributes.getInt(index2, jVar.f28385f0);
                        break;
                    case 73:
                        str = str3;
                        jVar.f28387g0 = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.f28387g0);
                        break;
                    case 74:
                        str = str3;
                        jVar.f28393j0 = obtainStyledAttributes.getString(index2);
                        break;
                    case 75:
                        str = str3;
                        jVar.f28401n0 = obtainStyledAttributes.getBoolean(index2, jVar.f28401n0);
                        break;
                    case Base64.mimeLineLength /* 76 */:
                        str = str3;
                        kVar.f28416c = obtainStyledAttributes.getInt(index2, kVar.f28416c);
                        break;
                    case 77:
                        str = str3;
                        jVar.f28395k0 = obtainStyledAttributes.getString(index2);
                        break;
                    case 78:
                        str = str3;
                        lVar.f28423b = obtainStyledAttributes.getInt(index2, lVar.f28423b);
                        break;
                    case 79:
                        str = str3;
                        kVar.f28417d = obtainStyledAttributes.getFloat(index2, kVar.f28417d);
                        break;
                    case 80:
                        str = str3;
                        jVar.f28397l0 = obtainStyledAttributes.getBoolean(index2, jVar.f28397l0);
                        break;
                    case 81:
                        str = str3;
                        jVar.f28399m0 = obtainStyledAttributes.getBoolean(index2, jVar.f28399m0);
                        break;
                    case 82:
                        str = str3;
                        kVar.f28415b = obtainStyledAttributes.getInteger(index2, kVar.f28415b);
                        break;
                    case 83:
                        str = str3;
                        mVar.f28433h = f(obtainStyledAttributes, index2, mVar.f28433h);
                        break;
                    case 84:
                        str = str3;
                        kVar.f28420g = obtainStyledAttributes.getInteger(index2, kVar.f28420g);
                        break;
                    case 85:
                        str = str3;
                        kVar.f28419f = obtainStyledAttributes.getFloat(index2, kVar.f28419f);
                        break;
                    case 86:
                        str = str3;
                        int i17 = obtainStyledAttributes.peekValue(index2).type;
                        if (i17 != 1) {
                            if (i17 == 3) {
                                String string2 = obtainStyledAttributes.getString(index2);
                                kVar.f28421h = string2;
                                if (string2.indexOf("/") > 0) {
                                    kVar.f28422i = obtainStyledAttributes.getResourceId(index2, -1);
                                }
                            } else {
                                obtainStyledAttributes.getInteger(index2, kVar.f28422i);
                            }
                            break;
                        } else {
                            kVar.f28422i = obtainStyledAttributes.getResourceId(index2, -1);
                            break;
                        }
                    case 87:
                        StringBuilder sb3 = new StringBuilder(str3);
                        str = str3;
                        sb3.append(Integer.toHexString(index2));
                        sb3.append("   ");
                        sb3.append(sparseIntArray.get(index2));
                        Log.w("ConstraintSet", sb3.toString());
                        break;
                    case 88:
                    case TsExtractor.TS_STREAM_TYPE_DVBSUBS /* 89 */:
                    case 90:
                    default:
                        str = str3;
                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        break;
                    case 91:
                        jVar.f28405q = f(obtainStyledAttributes, index2, jVar.f28405q);
                        str = str3;
                        break;
                    case 92:
                        jVar.f28406r = f(obtainStyledAttributes, index2, jVar.f28406r);
                        str = str3;
                        break;
                    case 93:
                        jVar.L = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.L);
                        str = str3;
                        break;
                    case 94:
                        jVar.S = obtainStyledAttributes.getDimensionPixelSize(index2, jVar.S);
                        str = str3;
                        break;
                    case 95:
                        g(jVar, obtainStyledAttributes, index2, 0);
                        str = str3;
                        break;
                    case 96:
                        g(jVar, obtainStyledAttributes, index2, 1);
                        str = str3;
                        break;
                    case 97:
                        jVar.f28403o0 = obtainStyledAttributes.getInt(index2, jVar.f28403o0);
                        str = str3;
                        break;
                }
                i15++;
                indexCount2 = i16;
                str3 = str;
            }
            if (jVar.f28393j0 != null) {
                jVar.f28391i0 = null;
            }
        }
        obtainStyledAttributes.recycle();
        return iVar;
    }

    public static int f(TypedArray typedArray, int i10, int i11) {
        int resourceId = typedArray.getResourceId(i10, i11);
        if (resourceId == -1) {
            return typedArray.getInt(i10, -1);
        }
        return resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void g(java.lang.Object r8, android.content.res.TypedArray r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z.n.g(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    public static void h(e eVar, String str) {
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i10 = 0;
            int i11 = -1;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (!substring.equalsIgnoreCase("W")) {
                    if (substring.equalsIgnoreCase("H")) {
                        i10 = 1;
                    } else {
                        i10 = -1;
                    }
                }
                i11 = i10;
                i10 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            try {
                if (indexOf2 >= 0 && indexOf2 < length - 1) {
                    String substring2 = str.substring(i10, indexOf2);
                    String substring3 = str.substring(indexOf2 + 1);
                    if (substring2.length() > 0 && substring3.length() > 0) {
                        float parseFloat = Float.parseFloat(substring2);
                        float parseFloat2 = Float.parseFloat(substring3);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            if (i11 == 1) {
                                Math.abs(parseFloat2 / parseFloat);
                            } else {
                                Math.abs(parseFloat / parseFloat2);
                            }
                        }
                    }
                } else {
                    String substring4 = str.substring(i10);
                    if (substring4.length() > 0) {
                        Float.parseFloat(substring4);
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        eVar.G = str;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:44:0x0101. Please report as an issue. */
    public final void a(ConstraintLayout constraintLayout) {
        int i10;
        String str;
        int i11;
        String str2;
        n nVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap = nVar.f28443c;
        HashSet hashSet = new HashSet(hashMap.keySet());
        int i12 = 0;
        while (i12 < childCount) {
            View childAt = constraintLayout.getChildAt(i12);
            int id2 = childAt.getId();
            if (!hashMap.containsKey(Integer.valueOf(id2))) {
                StringBuilder sb2 = new StringBuilder("id unknown ");
                try {
                    str2 = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    str2 = "UNKNOWN";
                }
                sb2.append(str2);
                Log.w("ConstraintSet", sb2.toString());
            } else {
                if (nVar.f28442b && id2 == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id2 != -1) {
                    if (hashMap.containsKey(Integer.valueOf(id2))) {
                        hashSet.remove(Integer.valueOf(id2));
                        i iVar = (i) hashMap.get(Integer.valueOf(id2));
                        if (iVar != null) {
                            if (childAt instanceof a) {
                                j jVar = iVar.f28371d;
                                jVar.f28389h0 = 1;
                                a aVar = (a) childAt;
                                aVar.setId(id2);
                                aVar.setType(jVar.f28385f0);
                                aVar.setMargin(jVar.f28387g0);
                                aVar.setAllowsGoneWidget(jVar.f28401n0);
                                int[] iArr = jVar.f28391i0;
                                if (iArr != null) {
                                    aVar.setReferencedIds(iArr);
                                } else {
                                    String str3 = jVar.f28393j0;
                                    if (str3 != null) {
                                        int[] c10 = c(aVar, str3);
                                        jVar.f28391i0 = c10;
                                        aVar.setReferencedIds(c10);
                                    }
                                }
                            }
                            e eVar = (e) childAt.getLayoutParams();
                            eVar.a();
                            iVar.a(eVar);
                            HashMap hashMap2 = iVar.f28373f;
                            Class<?> cls = childAt.getClass();
                            Iterator it = hashMap2.keySet().iterator();
                            while (it.hasNext()) {
                                String str4 = (String) it.next();
                                b bVar = (b) hashMap2.get(str4);
                                HashMap hashMap3 = hashMap2;
                                if (!bVar.a) {
                                    str = vd.e.e("set", str4);
                                } else {
                                    str = str4;
                                }
                                Iterator it2 = it;
                                try {
                                    switch (t.h.b(bVar.f28300b)) {
                                        case 0:
                                            i11 = childCount;
                                            cls.getMethod(str, Integer.TYPE).invoke(childAt, Integer.valueOf(bVar.f28301c));
                                            break;
                                        case 1:
                                            i11 = childCount;
                                            cls.getMethod(str, Float.TYPE).invoke(childAt, Float.valueOf(bVar.f28302d));
                                            break;
                                        case 2:
                                            i11 = childCount;
                                            cls.getMethod(str, Integer.TYPE).invoke(childAt, Integer.valueOf(bVar.f28305g));
                                            break;
                                        case 3:
                                            i11 = childCount;
                                            Method method = cls.getMethod(str, Drawable.class);
                                            ColorDrawable colorDrawable = new ColorDrawable();
                                            colorDrawable.setColor(bVar.f28305g);
                                            method.invoke(childAt, colorDrawable);
                                            break;
                                        case 4:
                                            i11 = childCount;
                                            cls.getMethod(str, CharSequence.class).invoke(childAt, bVar.f28303e);
                                            break;
                                        case 5:
                                            i11 = childCount;
                                            cls.getMethod(str, Boolean.TYPE).invoke(childAt, Boolean.valueOf(bVar.f28304f));
                                            break;
                                        case 6:
                                            i11 = childCount;
                                            cls.getMethod(str, Float.TYPE).invoke(childAt, Float.valueOf(bVar.f28302d));
                                            break;
                                        case 7:
                                            i11 = childCount;
                                            try {
                                                cls.getMethod(str, Integer.TYPE).invoke(childAt, Integer.valueOf(bVar.f28301c));
                                            } catch (IllegalAccessException e2) {
                                                e = e2;
                                                StringBuilder o10 = a4.j.o(" Custom Attribute \"", str4, "\" not found on ");
                                                o10.append(cls.getName());
                                                Log.e("TransitionLayout", o10.toString());
                                                e.printStackTrace();
                                                hashMap2 = hashMap3;
                                                it = it2;
                                                childCount = i11;
                                            } catch (NoSuchMethodException e10) {
                                                e = e10;
                                                Log.e("TransitionLayout", e.getMessage());
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str4 + "\" not found on " + cls.getName());
                                                Log.e("TransitionLayout", cls.getName() + " must have a method " + str);
                                                hashMap2 = hashMap3;
                                                it = it2;
                                                childCount = i11;
                                            } catch (InvocationTargetException e11) {
                                                e = e11;
                                                StringBuilder o11 = a4.j.o(" Custom Attribute \"", str4, "\" not found on ");
                                                o11.append(cls.getName());
                                                Log.e("TransitionLayout", o11.toString());
                                                e.printStackTrace();
                                                hashMap2 = hashMap3;
                                                it = it2;
                                                childCount = i11;
                                            }
                                        default:
                                            i11 = childCount;
                                            break;
                                    }
                                } catch (IllegalAccessException e12) {
                                    e = e12;
                                    i11 = childCount;
                                } catch (NoSuchMethodException e13) {
                                    e = e13;
                                    i11 = childCount;
                                } catch (InvocationTargetException e14) {
                                    e = e14;
                                    i11 = childCount;
                                }
                                hashMap2 = hashMap3;
                                it = it2;
                                childCount = i11;
                            }
                            i10 = childCount;
                            childAt.setLayoutParams(eVar);
                            l lVar = iVar.f28369b;
                            if (lVar.f28423b == 0) {
                                childAt.setVisibility(lVar.a);
                            }
                            childAt.setAlpha(lVar.f28424c);
                            m mVar = iVar.f28372e;
                            childAt.setRotation(mVar.a);
                            childAt.setRotationX(mVar.f28427b);
                            childAt.setRotationY(mVar.f28428c);
                            childAt.setScaleX(mVar.f28429d);
                            childAt.setScaleY(mVar.f28430e);
                            if (mVar.f28433h != -1) {
                                if (((View) childAt.getParent()).findViewById(mVar.f28433h) != null) {
                                    float bottom = (r1.getBottom() + r1.getTop()) / 2.0f;
                                    float right = (r1.getRight() + r1.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(right - childAt.getLeft());
                                        childAt.setPivotY(bottom - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(mVar.f28431f)) {
                                    childAt.setPivotX(mVar.f28431f);
                                }
                                if (!Float.isNaN(mVar.f28432g)) {
                                    childAt.setPivotY(mVar.f28432g);
                                }
                            }
                            childAt.setTranslationX(mVar.f28434i);
                            childAt.setTranslationY(mVar.f28435j);
                            childAt.setTranslationZ(mVar.f28436k);
                            if (mVar.f28437l) {
                                childAt.setElevation(mVar.f28438m);
                            }
                        }
                    } else {
                        i10 = childCount;
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id2);
                    }
                    i12++;
                    nVar = this;
                    childCount = i10;
                }
            }
            i10 = childCount;
            i12++;
            nVar = this;
            childCount = i10;
        }
        int i13 = childCount;
        Iterator it3 = hashSet.iterator();
        while (it3.hasNext()) {
            Integer num = (Integer) it3.next();
            i iVar2 = (i) hashMap.get(num);
            if (iVar2 != null) {
                j jVar2 = iVar2.f28371d;
                if (jVar2.f28389h0 == 1) {
                    a aVar2 = new a(constraintLayout.getContext());
                    aVar2.setId(num.intValue());
                    int[] iArr2 = jVar2.f28391i0;
                    if (iArr2 != null) {
                        aVar2.setReferencedIds(iArr2);
                    } else {
                        String str5 = jVar2.f28393j0;
                        if (str5 != null) {
                            int[] c11 = c(aVar2, str5);
                            jVar2.f28391i0 = c11;
                            aVar2.setReferencedIds(c11);
                        }
                    }
                    aVar2.setType(jVar2.f28385f0);
                    aVar2.setMargin(jVar2.f28387g0);
                    s sVar = ConstraintLayout.f1128r;
                    e eVar2 = new e();
                    aVar2.i();
                    iVar2.a(eVar2);
                    constraintLayout.addView(aVar2, eVar2);
                }
                if (jVar2.a) {
                    View pVar = new p(constraintLayout.getContext());
                    pVar.setId(num.intValue());
                    s sVar2 = ConstraintLayout.f1128r;
                    e eVar3 = new e();
                    iVar2.a(eVar3);
                    constraintLayout.addView(pVar, eVar3);
                }
            }
        }
        for (int i14 = 0; i14 < i13; i14++) {
            View childAt2 = constraintLayout.getChildAt(i14);
            if (childAt2 instanceof c) {
                ((c) childAt2).e(constraintLayout);
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        int i10;
        int i11;
        n nVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap = nVar.f28443c;
        hashMap.clear();
        int i12 = 0;
        while (i12 < childCount) {
            View childAt = constraintLayout.getChildAt(i12);
            e eVar = (e) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (nVar.f28442b && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!hashMap.containsKey(Integer.valueOf(id2))) {
                hashMap.put(Integer.valueOf(id2), new i());
            }
            i iVar = (i) hashMap.get(Integer.valueOf(id2));
            if (iVar == null) {
                i10 = childCount;
            } else {
                HashMap hashMap2 = nVar.a;
                HashMap hashMap3 = new HashMap();
                Class<?> cls = childAt.getClass();
                for (String str : hashMap2.keySet()) {
                    b bVar = (b) hashMap2.get(str);
                    try {
                    } catch (IllegalAccessException e2) {
                        e = e2;
                        i11 = childCount;
                    } catch (NoSuchMethodException e10) {
                        e = e10;
                        i11 = childCount;
                    } catch (InvocationTargetException e11) {
                        e = e11;
                        i11 = childCount;
                    }
                    if (str.equals("BackgroundColor")) {
                        hashMap3.put(str, new b(bVar, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                    } else {
                        i11 = childCount;
                        try {
                            hashMap3.put(str, new b(bVar, cls.getMethod("getMap" + str, new Class[0]).invoke(childAt, new Object[0])));
                        } catch (IllegalAccessException e12) {
                            e = e12;
                            e.printStackTrace();
                            childCount = i11;
                        } catch (NoSuchMethodException e13) {
                            e = e13;
                            e.printStackTrace();
                            childCount = i11;
                        } catch (InvocationTargetException e14) {
                            e = e14;
                            e.printStackTrace();
                            childCount = i11;
                        }
                        childCount = i11;
                    }
                }
                i10 = childCount;
                iVar.f28373f = hashMap3;
                iVar.a = id2;
                int i13 = eVar.f28320e;
                j jVar = iVar.f28371d;
                jVar.f28388h = i13;
                jVar.f28390i = eVar.f28322f;
                jVar.f28392j = eVar.f28324g;
                jVar.f28394k = eVar.f28326h;
                jVar.f28396l = eVar.f28328i;
                jVar.f28398m = eVar.f28330j;
                jVar.f28400n = eVar.f28332k;
                jVar.f28402o = eVar.f28334l;
                jVar.f28404p = eVar.f28336m;
                jVar.f28405q = eVar.f28338n;
                jVar.f28406r = eVar.f28340o;
                jVar.f28407s = eVar.f28346s;
                jVar.f28408t = eVar.f28347t;
                jVar.u = eVar.u;
                jVar.f28409v = eVar.f28348v;
                jVar.f28410w = eVar.E;
                jVar.f28411x = eVar.F;
                jVar.f28412y = eVar.G;
                jVar.f28413z = eVar.f28342p;
                jVar.A = eVar.f28344q;
                jVar.B = eVar.f28345r;
                jVar.C = eVar.T;
                jVar.D = eVar.U;
                jVar.E = eVar.V;
                jVar.f28384f = eVar.f28316c;
                jVar.f28380d = eVar.a;
                jVar.f28382e = eVar.f28314b;
                jVar.f28376b = ((ViewGroup.MarginLayoutParams) eVar).width;
                jVar.f28378c = ((ViewGroup.MarginLayoutParams) eVar).height;
                jVar.F = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
                jVar.G = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
                jVar.H = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                jVar.I = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                jVar.L = eVar.D;
                jVar.T = eVar.I;
                jVar.U = eVar.H;
                jVar.W = eVar.K;
                jVar.V = eVar.J;
                jVar.f28397l0 = eVar.W;
                jVar.f28399m0 = eVar.X;
                jVar.X = eVar.L;
                jVar.Y = eVar.M;
                jVar.Z = eVar.P;
                jVar.f28375a0 = eVar.Q;
                jVar.f28377b0 = eVar.N;
                jVar.f28379c0 = eVar.O;
                jVar.f28381d0 = eVar.R;
                jVar.f28383e0 = eVar.S;
                jVar.f28395k0 = eVar.Y;
                jVar.N = eVar.f28350x;
                jVar.P = eVar.f28352z;
                jVar.M = eVar.f28349w;
                jVar.O = eVar.f28351y;
                jVar.R = eVar.A;
                jVar.Q = eVar.B;
                jVar.S = eVar.C;
                jVar.f28403o0 = eVar.Z;
                jVar.J = eVar.getMarginEnd();
                jVar.K = eVar.getMarginStart();
                int visibility = childAt.getVisibility();
                l lVar = iVar.f28369b;
                lVar.a = visibility;
                lVar.f28424c = childAt.getAlpha();
                float rotation = childAt.getRotation();
                m mVar = iVar.f28372e;
                mVar.a = rotation;
                mVar.f28427b = childAt.getRotationX();
                mVar.f28428c = childAt.getRotationY();
                mVar.f28429d = childAt.getScaleX();
                mVar.f28430e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    mVar.f28431f = pivotX;
                    mVar.f28432g = pivotY;
                }
                mVar.f28434i = childAt.getTranslationX();
                mVar.f28435j = childAt.getTranslationY();
                mVar.f28436k = childAt.getTranslationZ();
                if (mVar.f28437l) {
                    mVar.f28438m = childAt.getElevation();
                }
                if (childAt instanceof a) {
                    a aVar = (a) childAt;
                    jVar.f28401n0 = aVar.getAllowsGoneWidget();
                    jVar.f28391i0 = aVar.getReferencedIds();
                    jVar.f28385f0 = aVar.getType();
                    jVar.f28387g0 = aVar.getMargin();
                }
            }
            i12++;
            nVar = this;
            childCount = i10;
        }
    }

    public final void e(Context context, int i10) {
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType != 0) {
                    if (eventType == 2) {
                        String name = xml.getName();
                        i d10 = d(context, Xml.asAttributeSet(xml), false);
                        if (name.equalsIgnoreCase("Guideline")) {
                            d10.f28371d.a = true;
                        }
                        this.f28443c.put(Integer.valueOf(d10.a), d10);
                    }
                } else {
                    xml.getName();
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e10) {
            e10.printStackTrace();
        }
    }
}
