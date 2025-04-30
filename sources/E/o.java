package E;

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
import androidx.constraintlayout.widget.Guideline;
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
import org.xmlpull.v1.XmlPullParserException;
import x0.AbstractC2914a;
import z.AbstractC2965e;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f951d = {0, 4, 8};

    /* renamed from: e, reason: collision with root package name */
    public static final SparseIntArray f952e;

    /* renamed from: f, reason: collision with root package name */
    public static final SparseIntArray f953f;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f954a = new HashMap();
    public final boolean b = true;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f955c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f952e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f953f = sparseIntArray2;
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
        int i9;
        HashMap hashMap;
        String[] split = str.split(",");
        Context context = aVar.getContext();
        int[] iArr = new int[split.length];
        int i10 = 0;
        int i11 = 0;
        while (i10 < split.length) {
            String trim = split[i10].trim();
            Object obj = null;
            try {
                i9 = q.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i9 = 0;
            }
            if (i9 == 0) {
                i9 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i9 == 0 && aVar.isInEditMode() && (aVar.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) aVar.getParent();
                constraintLayout.getClass();
                if ((trim instanceof String) && (hashMap = constraintLayout.f4336o) != null && hashMap.containsKey(trim)) {
                    obj = constraintLayout.f4336o.get(trim);
                }
                if (obj != null && (obj instanceof Integer)) {
                    i9 = ((Integer) obj).intValue();
                }
            }
            iArr[i11] = i9;
            i10++;
            i11++;
        }
        if (i11 != split.length) {
            return Arrays.copyOf(iArr, i11);
        }
        return iArr;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x008b. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:128:0x0606. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r3v120, types: [E.i, java.lang.Object] */
    public static j d(Context context, AttributeSet attributeSet, boolean z8) {
        int i9;
        String str;
        String str2;
        String str3;
        int i10;
        String str4;
        int i11;
        j jVar = new j();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z8 ? r.f957c : r.f956a);
        int[] iArr = f951d;
        SparseIntArray sparseIntArray = f952e;
        String[] strArr = A.a.f0a;
        m mVar = jVar.b;
        n nVar = jVar.f863e;
        l lVar = jVar.f861c;
        k kVar = jVar.f862d;
        String str5 = "Unknown attribute 0x";
        String str6 = "ConstraintSet";
        if (z8) {
            int indexCount = obtainStyledAttributes.getIndexCount();
            ?? obj = new Object();
            obj.f850a = new int[10];
            obj.b = new int[10];
            obj.f851c = 0;
            obj.f852d = new int[10];
            obj.f853e = new float[10];
            obj.f854f = 0;
            obj.f855g = new int[5];
            obj.f856h = new String[5];
            obj.f857i = 0;
            obj.f858j = new int[4];
            obj.f859k = new boolean[4];
            obj.l = 0;
            lVar.getClass();
            kVar.getClass();
            mVar.getClass();
            nVar.getClass();
            int i12 = 0;
            while (i12 < indexCount) {
                int index = obtainStyledAttributes.getIndex(i12);
                int i13 = indexCount;
                switch (f953f.get(index)) {
                    case 2:
                        str4 = str5;
                        obj.b(2, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f874I));
                        i11 = 1;
                        break;
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case 25:
                    case 26:
                    case 29:
                    case AD_PLAY_RESET_ON_DEINIT_VALUE:
                    case 32:
                    case 33:
                    case 35:
                    case 36:
                    case 61:
                    case 88:
                    case TsExtractor.TS_STREAM_TYPE_DVBSUBS /* 89 */:
                    case 90:
                    case 91:
                    case 92:
                    default:
                        StringBuilder sb = new StringBuilder(str5);
                        str4 = str5;
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(sparseIntArray.get(index));
                        Log.w("ConstraintSet", sb.toString());
                        i11 = 1;
                        break;
                    case 5:
                        str4 = str5;
                        obj.c(5, obtainStyledAttributes.getString(index));
                        i11 = 1;
                        break;
                    case 6:
                        str4 = str5;
                        obj.b(6, obtainStyledAttributes.getDimensionPixelOffset(index, kVar.f868C));
                        i11 = 1;
                        break;
                    case 7:
                        str4 = str5;
                        obj.b(7, obtainStyledAttributes.getDimensionPixelOffset(index, kVar.f869D));
                        i11 = 1;
                        break;
                    case 8:
                        str4 = str5;
                        obj.b(8, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f875J));
                        i11 = 1;
                        break;
                    case 11:
                        str4 = str5;
                        obj.b(11, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f880P));
                        i11 = 1;
                        break;
                    case 12:
                        str4 = str5;
                        obj.b(12, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f881Q));
                        i11 = 1;
                        break;
                    case 13:
                        str4 = str5;
                        obj.b(13, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f878M));
                        i11 = 1;
                        break;
                    case 14:
                        str4 = str5;
                        obj.b(14, obtainStyledAttributes.getDimensionPixelSize(index, kVar.O));
                        i11 = 1;
                        break;
                    case 15:
                        str4 = str5;
                        obj.b(15, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f882R));
                        i11 = 1;
                        break;
                    case 16:
                        str4 = str5;
                        obj.b(16, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f879N));
                        i11 = 1;
                        break;
                    case 17:
                        str4 = str5;
                        obj.b(17, obtainStyledAttributes.getDimensionPixelOffset(index, kVar.f896d));
                        i11 = 1;
                        break;
                    case 18:
                        str4 = str5;
                        obj.b(18, obtainStyledAttributes.getDimensionPixelOffset(index, kVar.f898e));
                        i11 = 1;
                        break;
                    case 19:
                        str4 = str5;
                        obj.a(19, obtainStyledAttributes.getFloat(index, kVar.f900f));
                        i11 = 1;
                        break;
                    case 20:
                        str4 = str5;
                        obj.a(20, obtainStyledAttributes.getFloat(index, kVar.f924w));
                        i11 = 1;
                        break;
                    case 21:
                        str4 = str5;
                        obj.b(21, obtainStyledAttributes.getLayoutDimension(index, kVar.f894c));
                        i11 = 1;
                        break;
                    case 22:
                        str4 = str5;
                        obj.b(22, iArr[obtainStyledAttributes.getInt(index, mVar.f937a)]);
                        i11 = 1;
                        break;
                    case 23:
                        str4 = str5;
                        obj.b(23, obtainStyledAttributes.getLayoutDimension(index, kVar.b));
                        i11 = 1;
                        break;
                    case 24:
                        str4 = str5;
                        obj.b(24, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f871F));
                        i11 = 1;
                        break;
                    case 27:
                        str4 = str5;
                        obj.b(27, obtainStyledAttributes.getInt(index, kVar.f870E));
                        i11 = 1;
                        break;
                    case 28:
                        str4 = str5;
                        obj.b(28, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f872G));
                        i11 = 1;
                        break;
                    case 31:
                        str4 = str5;
                        obj.b(31, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f876K));
                        i11 = 1;
                        break;
                    case 34:
                        str4 = str5;
                        obj.b(34, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f873H));
                        i11 = 1;
                        break;
                    case 37:
                        str4 = str5;
                        obj.a(37, obtainStyledAttributes.getFloat(index, kVar.f925x));
                        i11 = 1;
                        break;
                    case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                        str4 = str5;
                        int resourceId = obtainStyledAttributes.getResourceId(index, jVar.f860a);
                        jVar.f860a = resourceId;
                        obj.b(38, resourceId);
                        i11 = 1;
                        break;
                    case 39:
                        str4 = str5;
                        obj.a(39, obtainStyledAttributes.getFloat(index, kVar.f885U));
                        i11 = 1;
                        break;
                    case 40:
                        str4 = str5;
                        obj.a(40, obtainStyledAttributes.getFloat(index, kVar.f884T));
                        i11 = 1;
                        break;
                    case 41:
                        str4 = str5;
                        obj.b(41, obtainStyledAttributes.getInt(index, kVar.f886V));
                        i11 = 1;
                        break;
                    case 42:
                        str4 = str5;
                        obj.b(42, obtainStyledAttributes.getInt(index, kVar.f887W));
                        i11 = 1;
                        break;
                    case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                        str4 = str5;
                        obj.a(43, obtainStyledAttributes.getFloat(index, mVar.f938c));
                        i11 = 1;
                        break;
                    case 44:
                        str4 = str5;
                        obj.d(44, true);
                        obj.a(44, obtainStyledAttributes.getDimension(index, nVar.m));
                        i11 = 1;
                        break;
                    case 45:
                        str4 = str5;
                        obj.a(45, obtainStyledAttributes.getFloat(index, nVar.b));
                        i11 = 1;
                        break;
                    case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                        str4 = str5;
                        obj.a(46, obtainStyledAttributes.getFloat(index, nVar.f942c));
                        i11 = 1;
                        break;
                    case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                        str4 = str5;
                        obj.a(47, obtainStyledAttributes.getFloat(index, nVar.f943d));
                        i11 = 1;
                        break;
                    case 48:
                        str4 = str5;
                        obj.a(48, obtainStyledAttributes.getFloat(index, nVar.f944e));
                        i11 = 1;
                        break;
                    case 49:
                        str4 = str5;
                        obj.a(49, obtainStyledAttributes.getDimension(index, nVar.f945f));
                        i11 = 1;
                        break;
                    case TTAdConstant.IMAGE_MODE_VIDEO_SQUARE /* 50 */:
                        str4 = str5;
                        obj.a(50, obtainStyledAttributes.getDimension(index, nVar.f946g));
                        i11 = 1;
                        break;
                    case 51:
                        str4 = str5;
                        obj.a(51, obtainStyledAttributes.getDimension(index, nVar.f948i));
                        i11 = 1;
                        break;
                    case 52:
                        str4 = str5;
                        obj.a(52, obtainStyledAttributes.getDimension(index, nVar.f949j));
                        i11 = 1;
                        break;
                    case 53:
                        str4 = str5;
                        obj.a(53, obtainStyledAttributes.getDimension(index, nVar.f950k));
                        i11 = 1;
                        break;
                    case 54:
                        str4 = str5;
                        obj.b(54, obtainStyledAttributes.getInt(index, kVar.f888X));
                        i11 = 1;
                        break;
                    case 55:
                        str4 = str5;
                        obj.b(55, obtainStyledAttributes.getInt(index, kVar.f889Y));
                        i11 = 1;
                        break;
                    case 56:
                        str4 = str5;
                        obj.b(56, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f890Z));
                        i11 = 1;
                        break;
                    case 57:
                        str4 = str5;
                        obj.b(57, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f892a0));
                        i11 = 1;
                        break;
                    case 58:
                        str4 = str5;
                        obj.b(58, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f893b0));
                        i11 = 1;
                        break;
                    case 59:
                        str4 = str5;
                        obj.b(59, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f895c0));
                        i11 = 1;
                        break;
                    case 60:
                        str4 = str5;
                        obj.a(60, obtainStyledAttributes.getFloat(index, nVar.f941a));
                        i11 = 1;
                        break;
                    case 62:
                        str4 = str5;
                        obj.b(62, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f866A));
                        i11 = 1;
                        break;
                    case 63:
                        str4 = str5;
                        obj.a(63, obtainStyledAttributes.getFloat(index, kVar.f867B));
                        i11 = 1;
                        break;
                    case 64:
                        str4 = str5;
                        obj.b(64, f(obtainStyledAttributes, index, lVar.f929a));
                        i11 = 1;
                        break;
                    case 65:
                        str4 = str5;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            obj.c(65, obtainStyledAttributes.getString(index));
                        } else {
                            obj.c(65, strArr[obtainStyledAttributes.getInteger(index, 0)]);
                        }
                        i11 = 1;
                        break;
                    case 66:
                        str4 = str5;
                        obj.b(66, obtainStyledAttributes.getInt(index, 0));
                        i11 = 1;
                        break;
                    case 67:
                        str4 = str5;
                        obj.a(67, obtainStyledAttributes.getFloat(index, lVar.f932e));
                        i11 = 1;
                        break;
                    case 68:
                        str4 = str5;
                        obj.a(68, obtainStyledAttributes.getFloat(index, mVar.f939d));
                        i11 = 1;
                        break;
                    case 69:
                        str4 = str5;
                        obj.a(69, obtainStyledAttributes.getFloat(index, 1.0f));
                        i11 = 1;
                        break;
                    case 70:
                        str4 = str5;
                        obj.a(70, obtainStyledAttributes.getFloat(index, 1.0f));
                        i11 = 1;
                        break;
                    case 71:
                        str4 = str5;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        i11 = 1;
                        break;
                    case 72:
                        str4 = str5;
                        obj.b(72, obtainStyledAttributes.getInt(index, kVar.f0));
                        i11 = 1;
                        break;
                    case 73:
                        str4 = str5;
                        obj.b(73, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f902g0));
                        i11 = 1;
                        break;
                    case 74:
                        str4 = str5;
                        obj.c(74, obtainStyledAttributes.getString(index));
                        i11 = 1;
                        break;
                    case 75:
                        str4 = str5;
                        obj.d(75, obtainStyledAttributes.getBoolean(index, kVar.f914n0));
                        i11 = 1;
                        break;
                    case 76:
                        str4 = str5;
                        obj.b(76, obtainStyledAttributes.getInt(index, lVar.f930c));
                        i11 = 1;
                        break;
                    case 77:
                        str4 = str5;
                        obj.c(77, obtainStyledAttributes.getString(index));
                        i11 = 1;
                        break;
                    case 78:
                        str4 = str5;
                        obj.b(78, obtainStyledAttributes.getInt(index, mVar.b));
                        i11 = 1;
                        break;
                    case 79:
                        str4 = str5;
                        obj.a(79, obtainStyledAttributes.getFloat(index, lVar.f931d));
                        i11 = 1;
                        break;
                    case 80:
                        str4 = str5;
                        obj.d(80, obtainStyledAttributes.getBoolean(index, kVar.f911l0));
                        i11 = 1;
                        break;
                    case 81:
                        str4 = str5;
                        obj.d(81, obtainStyledAttributes.getBoolean(index, kVar.f912m0));
                        i11 = 1;
                        break;
                    case 82:
                        str4 = str5;
                        obj.b(82, obtainStyledAttributes.getInteger(index, lVar.b));
                        i11 = 1;
                        break;
                    case 83:
                        str4 = str5;
                        obj.b(83, f(obtainStyledAttributes, index, nVar.f947h));
                        i11 = 1;
                        break;
                    case 84:
                        str4 = str5;
                        obj.b(84, obtainStyledAttributes.getInteger(index, lVar.f934g));
                        i11 = 1;
                        break;
                    case 85:
                        str4 = str5;
                        obj.a(85, obtainStyledAttributes.getFloat(index, lVar.f933f));
                        i11 = 1;
                        break;
                    case 86:
                        str4 = str5;
                        int i14 = obtainStyledAttributes.peekValue(index).type;
                        if (i14 == 1) {
                            int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                            lVar.f936i = resourceId2;
                            obj.b(89, resourceId2);
                            if (lVar.f936i != -1) {
                                obj.b(88, -2);
                            }
                        } else if (i14 == 3) {
                            String string = obtainStyledAttributes.getString(index);
                            lVar.f935h = string;
                            obj.c(90, string);
                            if (lVar.f935h.indexOf("/") > 0) {
                                int resourceId3 = obtainStyledAttributes.getResourceId(index, -1);
                                lVar.f936i = resourceId3;
                                obj.b(89, resourceId3);
                                obj.b(88, -2);
                            } else {
                                obj.b(88, -1);
                            }
                        } else {
                            obj.b(88, obtainStyledAttributes.getInteger(index, lVar.f936i));
                        }
                        i11 = 1;
                        break;
                    case 87:
                        str4 = str5;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        i11 = 1;
                        break;
                    case 93:
                        str4 = str5;
                        obj.b(93, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f877L));
                        i11 = 1;
                        break;
                    case 94:
                        str4 = str5;
                        obj.b(94, obtainStyledAttributes.getDimensionPixelSize(index, kVar.f883S));
                        i11 = 1;
                        break;
                    case 95:
                        str4 = str5;
                        g(obj, obtainStyledAttributes, index, 0);
                        i11 = 1;
                        break;
                    case 96:
                        str4 = str5;
                        i11 = 1;
                        g(obj, obtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        str4 = str5;
                        obj.b(97, obtainStyledAttributes.getInt(index, kVar.f916o0));
                        i11 = 1;
                        break;
                    case 98:
                        str4 = str5;
                        int i15 = D.a.f581u;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            obtainStyledAttributes.getString(index);
                        } else {
                            jVar.f860a = obtainStyledAttributes.getResourceId(index, jVar.f860a);
                        }
                        i11 = 1;
                        break;
                    case 99:
                        str4 = str5;
                        obj.d(99, obtainStyledAttributes.getBoolean(index, kVar.f901g));
                        i11 = 1;
                        break;
                }
                i12 += i11;
                indexCount = i13;
                str5 = str4;
            }
        } else {
            String str7 = "CURRENTLY UNSUPPORTED";
            String str8 = "Unknown attribute 0x";
            int i16 = 1;
            int indexCount2 = obtainStyledAttributes.getIndexCount();
            int i17 = 0;
            while (i17 < indexCount2) {
                int index2 = obtainStyledAttributes.getIndex(i17);
                if (index2 != i16 && 23 != index2 && 24 != index2) {
                    lVar.getClass();
                    kVar.getClass();
                    mVar.getClass();
                    nVar.getClass();
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        i9 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f917p = f(obtainStyledAttributes, index2, kVar.f917p);
                        i10 = 1;
                        break;
                    case 2:
                        i9 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f874I = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f874I);
                        i10 = 1;
                        break;
                    case 3:
                        i9 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f915o = f(obtainStyledAttributes, index2, kVar.f915o);
                        i10 = 1;
                        break;
                    case 4:
                        i9 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f913n = f(obtainStyledAttributes, index2, kVar.f913n);
                        i10 = 1;
                        break;
                    case 5:
                        i9 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f926y = obtainStyledAttributes.getString(index2);
                        i10 = 1;
                        break;
                    case 6:
                        i9 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f868C = obtainStyledAttributes.getDimensionPixelOffset(index2, kVar.f868C);
                        i10 = 1;
                        break;
                    case 7:
                        i9 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f869D = obtainStyledAttributes.getDimensionPixelOffset(index2, kVar.f869D);
                        i10 = 1;
                        break;
                    case 8:
                        i9 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f875J = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f875J);
                        i10 = 1;
                        break;
                    case 9:
                        i9 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f923v = f(obtainStyledAttributes, index2, kVar.f923v);
                        i10 = 1;
                        break;
                    case 10:
                        i9 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f922u = f(obtainStyledAttributes, index2, kVar.f922u);
                        i10 = 1;
                        break;
                    case 11:
                        i9 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f880P = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f880P);
                        i10 = 1;
                        break;
                    case 12:
                        i9 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f881Q = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f881Q);
                        i10 = 1;
                        break;
                    case 13:
                        i9 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f878M = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f878M);
                        i10 = 1;
                        break;
                    case 14:
                        i9 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.O = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.O);
                        i10 = 1;
                        break;
                    case 15:
                        i9 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f882R = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f882R);
                        i10 = 1;
                        break;
                    case 16:
                        i9 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f879N = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f879N);
                        i10 = 1;
                        break;
                    case 17:
                        i9 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f896d = obtainStyledAttributes.getDimensionPixelOffset(index2, kVar.f896d);
                        i10 = 1;
                        break;
                    case 18:
                        i9 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f898e = obtainStyledAttributes.getDimensionPixelOffset(index2, kVar.f898e);
                        i10 = 1;
                        break;
                    case 19:
                        i9 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f900f = obtainStyledAttributes.getFloat(index2, kVar.f900f);
                        i10 = 1;
                        break;
                    case 20:
                        i9 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f924w = obtainStyledAttributes.getFloat(index2, kVar.f924w);
                        i10 = 1;
                        break;
                    case 21:
                        i9 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f894c = obtainStyledAttributes.getLayoutDimension(index2, kVar.f894c);
                        i10 = 1;
                        break;
                    case 22:
                        i9 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        int i18 = obtainStyledAttributes.getInt(index2, mVar.f937a);
                        mVar.f937a = i18;
                        mVar.f937a = iArr[i18];
                        i10 = 1;
                        break;
                    case 23:
                        i9 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.b = obtainStyledAttributes.getLayoutDimension(index2, kVar.b);
                        i10 = 1;
                        break;
                    case 24:
                        i9 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f871F = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f871F);
                        i10 = 1;
                        break;
                    case 25:
                        i9 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f903h = f(obtainStyledAttributes, index2, kVar.f903h);
                        i10 = 1;
                        break;
                    case 26:
                        i9 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f905i = f(obtainStyledAttributes, index2, kVar.f905i);
                        i10 = 1;
                        break;
                    case 27:
                        i9 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f870E = obtainStyledAttributes.getInt(index2, kVar.f870E);
                        i10 = 1;
                        break;
                    case 28:
                        i9 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f872G = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f872G);
                        i10 = 1;
                        break;
                    case 29:
                        i9 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f907j = f(obtainStyledAttributes, index2, kVar.f907j);
                        i10 = 1;
                        break;
                    case AD_PLAY_RESET_ON_DEINIT_VALUE:
                        i9 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f909k = f(obtainStyledAttributes, index2, kVar.f909k);
                        i10 = 1;
                        break;
                    case 31:
                        i9 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f876K = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f876K);
                        i10 = 1;
                        break;
                    case 32:
                        i9 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f920s = f(obtainStyledAttributes, index2, kVar.f920s);
                        i10 = 1;
                        break;
                    case 33:
                        i9 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f921t = f(obtainStyledAttributes, index2, kVar.f921t);
                        i10 = 1;
                        break;
                    case 34:
                        i9 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f873H = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f873H);
                        i10 = 1;
                        break;
                    case 35:
                        i9 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.m = f(obtainStyledAttributes, index2, kVar.m);
                        i10 = 1;
                        break;
                    case 36:
                        i9 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.l = f(obtainStyledAttributes, index2, kVar.l);
                        i10 = 1;
                        break;
                    case 37:
                        i9 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f925x = obtainStyledAttributes.getFloat(index2, kVar.f925x);
                        i10 = 1;
                        break;
                    case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                        i9 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        jVar.f860a = obtainStyledAttributes.getResourceId(index2, jVar.f860a);
                        i10 = 1;
                        break;
                    case 39:
                        i9 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f885U = obtainStyledAttributes.getFloat(index2, kVar.f885U);
                        i10 = 1;
                        break;
                    case 40:
                        i9 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f884T = obtainStyledAttributes.getFloat(index2, kVar.f884T);
                        i10 = 1;
                        break;
                    case 41:
                        i9 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f886V = obtainStyledAttributes.getInt(index2, kVar.f886V);
                        i10 = 1;
                        break;
                    case 42:
                        i9 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f887W = obtainStyledAttributes.getInt(index2, kVar.f887W);
                        i10 = 1;
                        break;
                    case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                        i9 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        mVar.f938c = obtainStyledAttributes.getFloat(index2, mVar.f938c);
                        i10 = 1;
                        break;
                    case 44:
                        i9 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        nVar.l = true;
                        nVar.m = obtainStyledAttributes.getDimension(index2, nVar.m);
                        i10 = 1;
                        break;
                    case 45:
                        i9 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        nVar.b = obtainStyledAttributes.getFloat(index2, nVar.b);
                        i10 = 1;
                        break;
                    case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                        i9 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        nVar.f942c = obtainStyledAttributes.getFloat(index2, nVar.f942c);
                        i10 = 1;
                        break;
                    case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                        i9 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        nVar.f943d = obtainStyledAttributes.getFloat(index2, nVar.f943d);
                        i10 = 1;
                        break;
                    case 48:
                        i9 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        nVar.f944e = obtainStyledAttributes.getFloat(index2, nVar.f944e);
                        i10 = 1;
                        break;
                    case 49:
                        i9 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        nVar.f945f = obtainStyledAttributes.getDimension(index2, nVar.f945f);
                        i10 = 1;
                        break;
                    case TTAdConstant.IMAGE_MODE_VIDEO_SQUARE /* 50 */:
                        i9 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        nVar.f946g = obtainStyledAttributes.getDimension(index2, nVar.f946g);
                        i10 = 1;
                        break;
                    case 51:
                        i9 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        nVar.f948i = obtainStyledAttributes.getDimension(index2, nVar.f948i);
                        i10 = 1;
                        break;
                    case 52:
                        i9 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        nVar.f949j = obtainStyledAttributes.getDimension(index2, nVar.f949j);
                        i10 = 1;
                        break;
                    case 53:
                        i9 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        nVar.f950k = obtainStyledAttributes.getDimension(index2, nVar.f950k);
                        i10 = 1;
                        break;
                    case 54:
                        i9 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f888X = obtainStyledAttributes.getInt(index2, kVar.f888X);
                        i10 = 1;
                        break;
                    case 55:
                        i9 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f889Y = obtainStyledAttributes.getInt(index2, kVar.f889Y);
                        i10 = 1;
                        break;
                    case 56:
                        i9 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f890Z = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f890Z);
                        i10 = 1;
                        break;
                    case 57:
                        i9 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f892a0 = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f892a0);
                        i10 = 1;
                        break;
                    case 58:
                        i9 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f893b0 = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f893b0);
                        i10 = 1;
                        break;
                    case 59:
                        i9 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f895c0 = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f895c0);
                        i10 = 1;
                        break;
                    case 60:
                        i9 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        nVar.f941a = obtainStyledAttributes.getFloat(index2, nVar.f941a);
                        i10 = 1;
                        break;
                    case 61:
                        i9 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f927z = f(obtainStyledAttributes, index2, kVar.f927z);
                        i10 = 1;
                        break;
                    case 62:
                        i9 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f866A = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f866A);
                        i10 = 1;
                        break;
                    case 63:
                        i9 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        kVar.f867B = obtainStyledAttributes.getFloat(index2, kVar.f867B);
                        i10 = 1;
                        break;
                    case 64:
                        i9 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        lVar.f929a = f(obtainStyledAttributes, index2, lVar.f929a);
                        i10 = 1;
                        break;
                    case 65:
                        i9 = indexCount2;
                        str = str7;
                        str2 = str8;
                        str3 = str6;
                        if (obtainStyledAttributes.peekValue(index2).type == 3) {
                            obtainStyledAttributes.getString(index2);
                            lVar.getClass();
                            i10 = 1;
                            break;
                        } else {
                            String str9 = strArr[obtainStyledAttributes.getInteger(index2, 0)];
                            lVar.getClass();
                            i10 = 1;
                            break;
                        }
                    case 66:
                        i9 = indexCount2;
                        str = str7;
                        str2 = str8;
                        obtainStyledAttributes.getInt(index2, 0);
                        lVar.getClass();
                        str3 = str6;
                        i10 = 1;
                        break;
                    case 67:
                        i9 = indexCount2;
                        str = str7;
                        str2 = str8;
                        lVar.f932e = obtainStyledAttributes.getFloat(index2, lVar.f932e);
                        str3 = str6;
                        i10 = 1;
                        break;
                    case 68:
                        i9 = indexCount2;
                        str = str7;
                        str2 = str8;
                        mVar.f939d = obtainStyledAttributes.getFloat(index2, mVar.f939d);
                        str3 = str6;
                        i10 = 1;
                        break;
                    case 69:
                        i9 = indexCount2;
                        str = str7;
                        str2 = str8;
                        kVar.f897d0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        str3 = str6;
                        i10 = 1;
                        break;
                    case 70:
                        i9 = indexCount2;
                        str = str7;
                        str2 = str8;
                        kVar.f899e0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        str3 = str6;
                        i10 = 1;
                        break;
                    case 71:
                        i9 = indexCount2;
                        str = str7;
                        str2 = str8;
                        Log.e(str6, str);
                        str3 = str6;
                        i10 = 1;
                        break;
                    case 72:
                        i9 = indexCount2;
                        str2 = str8;
                        kVar.f0 = obtainStyledAttributes.getInt(index2, kVar.f0);
                        str = str7;
                        str3 = str6;
                        i10 = 1;
                        break;
                    case 73:
                        i9 = indexCount2;
                        str2 = str8;
                        kVar.f902g0 = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f902g0);
                        str = str7;
                        str3 = str6;
                        i10 = 1;
                        break;
                    case 74:
                        i9 = indexCount2;
                        str2 = str8;
                        kVar.f908j0 = obtainStyledAttributes.getString(index2);
                        str = str7;
                        str3 = str6;
                        i10 = 1;
                        break;
                    case 75:
                        i9 = indexCount2;
                        str2 = str8;
                        kVar.f914n0 = obtainStyledAttributes.getBoolean(index2, kVar.f914n0);
                        str = str7;
                        str3 = str6;
                        i10 = 1;
                        break;
                    case 76:
                        i9 = indexCount2;
                        str2 = str8;
                        lVar.f930c = obtainStyledAttributes.getInt(index2, lVar.f930c);
                        str = str7;
                        str3 = str6;
                        i10 = 1;
                        break;
                    case 77:
                        i9 = indexCount2;
                        str2 = str8;
                        kVar.f910k0 = obtainStyledAttributes.getString(index2);
                        str = str7;
                        str3 = str6;
                        i10 = 1;
                        break;
                    case 78:
                        i9 = indexCount2;
                        str2 = str8;
                        mVar.b = obtainStyledAttributes.getInt(index2, mVar.b);
                        str = str7;
                        str3 = str6;
                        i10 = 1;
                        break;
                    case 79:
                        i9 = indexCount2;
                        str2 = str8;
                        lVar.f931d = obtainStyledAttributes.getFloat(index2, lVar.f931d);
                        str = str7;
                        str3 = str6;
                        i10 = 1;
                        break;
                    case 80:
                        i9 = indexCount2;
                        str2 = str8;
                        kVar.f911l0 = obtainStyledAttributes.getBoolean(index2, kVar.f911l0);
                        str = str7;
                        str3 = str6;
                        i10 = 1;
                        break;
                    case 81:
                        i9 = indexCount2;
                        str2 = str8;
                        kVar.f912m0 = obtainStyledAttributes.getBoolean(index2, kVar.f912m0);
                        str = str7;
                        str3 = str6;
                        i10 = 1;
                        break;
                    case 82:
                        i9 = indexCount2;
                        str2 = str8;
                        lVar.b = obtainStyledAttributes.getInteger(index2, lVar.b);
                        str = str7;
                        str3 = str6;
                        i10 = 1;
                        break;
                    case 83:
                        i9 = indexCount2;
                        str2 = str8;
                        nVar.f947h = f(obtainStyledAttributes, index2, nVar.f947h);
                        str = str7;
                        str3 = str6;
                        i10 = 1;
                        break;
                    case 84:
                        i9 = indexCount2;
                        str2 = str8;
                        lVar.f934g = obtainStyledAttributes.getInteger(index2, lVar.f934g);
                        str = str7;
                        str3 = str6;
                        i10 = 1;
                        break;
                    case 85:
                        i9 = indexCount2;
                        str2 = str8;
                        lVar.f933f = obtainStyledAttributes.getFloat(index2, lVar.f933f);
                        str = str7;
                        str3 = str6;
                        i10 = 1;
                        break;
                    case 86:
                        i9 = indexCount2;
                        str2 = str8;
                        int i19 = obtainStyledAttributes.peekValue(index2).type;
                        if (i19 == 1) {
                            lVar.f936i = obtainStyledAttributes.getResourceId(index2, -1);
                        } else if (i19 == 3) {
                            String string2 = obtainStyledAttributes.getString(index2);
                            lVar.f935h = string2;
                            if (string2.indexOf("/") > 0) {
                                lVar.f936i = obtainStyledAttributes.getResourceId(index2, -1);
                            }
                        } else {
                            obtainStyledAttributes.getInteger(index2, lVar.f936i);
                        }
                        str = str7;
                        str3 = str6;
                        i10 = 1;
                        break;
                    case 87:
                        i9 = indexCount2;
                        str2 = str8;
                        Log.w(str6, "unused attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        str = str7;
                        str3 = str6;
                        i10 = 1;
                        break;
                    case 88:
                    case TsExtractor.TS_STREAM_TYPE_DVBSUBS /* 89 */:
                    case 90:
                    default:
                        str2 = str8;
                        StringBuilder sb2 = new StringBuilder(str2);
                        i9 = indexCount2;
                        sb2.append(Integer.toHexString(index2));
                        sb2.append("   ");
                        sb2.append(sparseIntArray.get(index2));
                        Log.w(str6, sb2.toString());
                        str = str7;
                        str3 = str6;
                        i10 = 1;
                        break;
                    case 91:
                        i9 = indexCount2;
                        str2 = str8;
                        kVar.f918q = f(obtainStyledAttributes, index2, kVar.f918q);
                        str = str7;
                        str3 = str6;
                        i10 = 1;
                        break;
                    case 92:
                        i9 = indexCount2;
                        str2 = str8;
                        kVar.f919r = f(obtainStyledAttributes, index2, kVar.f919r);
                        str = str7;
                        str3 = str6;
                        i10 = 1;
                        break;
                    case 93:
                        i9 = indexCount2;
                        str2 = str8;
                        kVar.f877L = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f877L);
                        str = str7;
                        str3 = str6;
                        i10 = 1;
                        break;
                    case 94:
                        i9 = indexCount2;
                        str2 = str8;
                        kVar.f883S = obtainStyledAttributes.getDimensionPixelSize(index2, kVar.f883S);
                        str = str7;
                        str3 = str6;
                        i10 = 1;
                        break;
                    case 95:
                        i9 = indexCount2;
                        str2 = str8;
                        g(kVar, obtainStyledAttributes, index2, 0);
                        str = str7;
                        str3 = str6;
                        i10 = 1;
                        break;
                    case 96:
                        i9 = indexCount2;
                        str2 = str8;
                        g(kVar, obtainStyledAttributes, index2, 1);
                        str = str7;
                        str3 = str6;
                        i10 = 1;
                        break;
                    case 97:
                        i9 = indexCount2;
                        str2 = str8;
                        kVar.f916o0 = obtainStyledAttributes.getInt(index2, kVar.f916o0);
                        str = str7;
                        str3 = str6;
                        i10 = 1;
                        break;
                }
                i17 += i10;
                indexCount2 = i9;
                str8 = str2;
                String str10 = str;
                i16 = i10;
                str6 = str3;
                str7 = str10;
            }
            if (kVar.f908j0 != null) {
                kVar.f906i0 = null;
            }
        }
        obtainStyledAttributes.recycle();
        return jVar;
    }

    public static int f(TypedArray typedArray, int i9, int i10) {
        int resourceId = typedArray.getResourceId(i9, i10);
        if (resourceId == -1) {
            return typedArray.getInt(i9, -1);
        }
        return resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void g(java.lang.Object r7, android.content.res.TypedArray r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: E.o.g(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    public static void h(e eVar, String str) {
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i9 = 0;
            int i10 = -1;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (!substring.equalsIgnoreCase("W")) {
                    if (substring.equalsIgnoreCase("H")) {
                        i9 = 1;
                    } else {
                        i9 = -1;
                    }
                }
                i10 = i9;
                i9 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            try {
                if (indexOf2 >= 0 && indexOf2 < length - 1) {
                    String substring2 = str.substring(i9, indexOf2);
                    String substring3 = str.substring(indexOf2 + 1);
                    if (substring2.length() > 0 && substring3.length() > 0) {
                        float parseFloat = Float.parseFloat(substring2);
                        float parseFloat2 = Float.parseFloat(substring3);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            if (i10 == 1) {
                                Math.abs(parseFloat2 / parseFloat);
                            } else {
                                Math.abs(parseFloat / parseFloat2);
                            }
                        }
                    }
                } else {
                    String substring4 = str.substring(i9);
                    if (substring4.length() > 0) {
                        Float.parseFloat(substring4);
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        eVar.f779G = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:43:0x0100. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v4, types: [android.view.View, E.a, E.c] */
    public final void a(ConstraintLayout constraintLayout) {
        int i9;
        HashMap hashMap;
        String str;
        int i10;
        String str2;
        o oVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap2 = oVar.f955c;
        HashSet hashSet = new HashSet(hashMap2.keySet());
        int i11 = 0;
        while (i11 < childCount) {
            View childAt = constraintLayout.getChildAt(i11);
            int id = childAt.getId();
            if (!hashMap2.containsKey(Integer.valueOf(id))) {
                StringBuilder sb = new StringBuilder("id unknown ");
                try {
                    str2 = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    str2 = "UNKNOWN";
                }
                sb.append(str2);
                Log.w("ConstraintSet", sb.toString());
            } else {
                if (oVar.b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (hashMap2.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        j jVar = (j) hashMap2.get(Integer.valueOf(id));
                        if (jVar != null) {
                            if (childAt instanceof a) {
                                k kVar = jVar.f862d;
                                kVar.f904h0 = 1;
                                a aVar = (a) childAt;
                                aVar.setId(id);
                                aVar.setType(kVar.f0);
                                aVar.setMargin(kVar.f902g0);
                                aVar.setAllowsGoneWidget(kVar.f914n0);
                                int[] iArr = kVar.f906i0;
                                if (iArr != null) {
                                    aVar.setReferencedIds(iArr);
                                } else {
                                    String str3 = kVar.f908j0;
                                    if (str3 != null) {
                                        int[] c9 = c(aVar, str3);
                                        kVar.f906i0 = c9;
                                        aVar.setReferencedIds(c9);
                                    }
                                }
                            }
                            e eVar = (e) childAt.getLayoutParams();
                            eVar.a();
                            jVar.a(eVar);
                            HashMap hashMap3 = jVar.f864f;
                            Class<?> cls = childAt.getClass();
                            for (String str4 : hashMap3.keySet()) {
                                b bVar = (b) hashMap3.get(str4);
                                if (!bVar.f760a) {
                                    str = AbstractC2914a.d("set", str4);
                                    hashMap = hashMap3;
                                } else {
                                    hashMap = hashMap3;
                                    str = str4;
                                }
                                try {
                                    switch (AbstractC2965e.d(bVar.b)) {
                                        case 0:
                                            i10 = childCount;
                                            cls.getMethod(str, Integer.TYPE).invoke(childAt, Integer.valueOf(bVar.f761c));
                                            break;
                                        case 1:
                                            i10 = childCount;
                                            cls.getMethod(str, Float.TYPE).invoke(childAt, Float.valueOf(bVar.f762d));
                                            break;
                                        case 2:
                                            i10 = childCount;
                                            cls.getMethod(str, Integer.TYPE).invoke(childAt, Integer.valueOf(bVar.f765g));
                                            break;
                                        case 3:
                                            Method method = cls.getMethod(str, Drawable.class);
                                            i10 = childCount;
                                            try {
                                                ColorDrawable colorDrawable = new ColorDrawable();
                                                colorDrawable.setColor(bVar.f765g);
                                                method.invoke(childAt, colorDrawable);
                                            } catch (IllegalAccessException e4) {
                                                e = e4;
                                                StringBuilder n2 = com.mbridge.msdk.foundation.entity.o.n(" Custom Attribute \"", str4, "\" not found on ");
                                                n2.append(cls.getName());
                                                Log.e("TransitionLayout", n2.toString());
                                                e.printStackTrace();
                                                hashMap3 = hashMap;
                                                childCount = i10;
                                            } catch (NoSuchMethodException e9) {
                                                e = e9;
                                                Log.e("TransitionLayout", e.getMessage());
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str4 + "\" not found on " + cls.getName());
                                                Log.e("TransitionLayout", cls.getName() + " must have a method " + str);
                                                hashMap3 = hashMap;
                                                childCount = i10;
                                            } catch (InvocationTargetException e10) {
                                                e = e10;
                                                StringBuilder n9 = com.mbridge.msdk.foundation.entity.o.n(" Custom Attribute \"", str4, "\" not found on ");
                                                n9.append(cls.getName());
                                                Log.e("TransitionLayout", n9.toString());
                                                e.printStackTrace();
                                                hashMap3 = hashMap;
                                                childCount = i10;
                                            }
                                        case 4:
                                            cls.getMethod(str, CharSequence.class).invoke(childAt, bVar.f763e);
                                            i10 = childCount;
                                            break;
                                        case 5:
                                            cls.getMethod(str, Boolean.TYPE).invoke(childAt, Boolean.valueOf(bVar.f764f));
                                            i10 = childCount;
                                            break;
                                        case 6:
                                            cls.getMethod(str, Float.TYPE).invoke(childAt, Float.valueOf(bVar.f762d));
                                            i10 = childCount;
                                            break;
                                        case 7:
                                            cls.getMethod(str, Integer.TYPE).invoke(childAt, Integer.valueOf(bVar.f761c));
                                            i10 = childCount;
                                            break;
                                        default:
                                            i10 = childCount;
                                            break;
                                    }
                                } catch (IllegalAccessException e11) {
                                    e = e11;
                                    i10 = childCount;
                                } catch (NoSuchMethodException e12) {
                                    e = e12;
                                    i10 = childCount;
                                } catch (InvocationTargetException e13) {
                                    e = e13;
                                    i10 = childCount;
                                }
                                hashMap3 = hashMap;
                                childCount = i10;
                            }
                            i9 = childCount;
                            childAt.setLayoutParams(eVar);
                            m mVar = jVar.b;
                            if (mVar.b == 0) {
                                childAt.setVisibility(mVar.f937a);
                            }
                            childAt.setAlpha(mVar.f938c);
                            n nVar = jVar.f863e;
                            childAt.setRotation(nVar.f941a);
                            childAt.setRotationX(nVar.b);
                            childAt.setRotationY(nVar.f942c);
                            childAt.setScaleX(nVar.f943d);
                            childAt.setScaleY(nVar.f944e);
                            if (nVar.f947h != -1) {
                                if (((View) childAt.getParent()).findViewById(nVar.f947h) != null) {
                                    float bottom = (r1.getBottom() + r1.getTop()) / 2.0f;
                                    float right = (r1.getRight() + r1.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(right - childAt.getLeft());
                                        childAt.setPivotY(bottom - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(nVar.f945f)) {
                                    childAt.setPivotX(nVar.f945f);
                                }
                                if (!Float.isNaN(nVar.f946g)) {
                                    childAt.setPivotY(nVar.f946g);
                                }
                            }
                            childAt.setTranslationX(nVar.f948i);
                            childAt.setTranslationY(nVar.f949j);
                            childAt.setTranslationZ(nVar.f950k);
                            if (nVar.l) {
                                childAt.setElevation(nVar.m);
                            }
                        }
                    } else {
                        i9 = childCount;
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                    i11++;
                    oVar = this;
                    childCount = i9;
                }
            }
            i9 = childCount;
            i11++;
            oVar = this;
            childCount = i9;
        }
        int i12 = childCount;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            j jVar2 = (j) hashMap2.get(num);
            if (jVar2 != null) {
                k kVar2 = jVar2.f862d;
                if (kVar2.f904h0 == 1) {
                    Context context = constraintLayout.getContext();
                    ?? view = new View(context);
                    view.b = new int[32];
                    view.f771i = new HashMap();
                    view.f767d = context;
                    view.h(null);
                    view.setVisibility(8);
                    view.setId(num.intValue());
                    int[] iArr2 = kVar2.f906i0;
                    if (iArr2 != null) {
                        view.setReferencedIds(iArr2);
                    } else {
                        String str5 = kVar2.f908j0;
                        if (str5 != null) {
                            int[] c10 = c(view, str5);
                            kVar2.f906i0 = c10;
                            view.setReferencedIds(c10);
                        }
                    }
                    view.setType(kVar2.f0);
                    view.setMargin(kVar2.f902g0);
                    e g9 = ConstraintLayout.g();
                    view.k();
                    jVar2.a(g9);
                    constraintLayout.addView((View) view, g9);
                }
                if (kVar2.f891a) {
                    Guideline guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    e g10 = ConstraintLayout.g();
                    jVar2.a(g10);
                    constraintLayout.addView(guideline, g10);
                }
            }
        }
        for (int i13 = 0; i13 < i12; i13++) {
            View childAt2 = constraintLayout.getChildAt(i13);
            if (childAt2 instanceof c) {
                ((c) childAt2).f(constraintLayout);
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        o oVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap = oVar.f955c;
        hashMap.clear();
        int i9 = 0;
        while (i9 < childCount) {
            View childAt = constraintLayout.getChildAt(i9);
            e eVar = (e) childAt.getLayoutParams();
            int id = childAt.getId();
            if (oVar.b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                hashMap.put(Integer.valueOf(id), new j());
            }
            j jVar = (j) hashMap.get(Integer.valueOf(id));
            if (jVar != null) {
                HashMap hashMap2 = oVar.f954a;
                HashMap hashMap3 = new HashMap();
                Class<?> cls = childAt.getClass();
                for (String str : hashMap2.keySet()) {
                    b bVar = (b) hashMap2.get(str);
                    try {
                        if (str.equals("BackgroundColor")) {
                            hashMap3.put(str, new b(bVar, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                        } else {
                            hashMap3.put(str, new b(bVar, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e4) {
                        e4.printStackTrace();
                    } catch (NoSuchMethodException e9) {
                        e9.printStackTrace();
                    } catch (InvocationTargetException e10) {
                        e10.printStackTrace();
                    }
                }
                jVar.f864f = hashMap3;
                jVar.f860a = id;
                int i10 = eVar.f805e;
                k kVar = jVar.f862d;
                kVar.f903h = i10;
                kVar.f905i = eVar.f807f;
                kVar.f907j = eVar.f808g;
                kVar.f909k = eVar.f810h;
                kVar.l = eVar.f812i;
                kVar.m = eVar.f814j;
                kVar.f913n = eVar.f816k;
                kVar.f915o = eVar.l;
                kVar.f917p = eVar.m;
                kVar.f918q = eVar.f820n;
                kVar.f919r = eVar.f822o;
                kVar.f920s = eVar.f828s;
                kVar.f921t = eVar.f829t;
                kVar.f922u = eVar.f830u;
                kVar.f923v = eVar.f831v;
                kVar.f924w = eVar.f777E;
                kVar.f925x = eVar.f778F;
                kVar.f926y = eVar.f779G;
                kVar.f927z = eVar.f824p;
                kVar.f866A = eVar.f826q;
                kVar.f867B = eVar.f827r;
                kVar.f868C = eVar.f791T;
                kVar.f869D = eVar.f792U;
                kVar.f870E = eVar.f793V;
                kVar.f900f = eVar.f801c;
                kVar.f896d = eVar.f798a;
                kVar.f898e = eVar.b;
                kVar.b = ((ViewGroup.MarginLayoutParams) eVar).width;
                kVar.f894c = ((ViewGroup.MarginLayoutParams) eVar).height;
                kVar.f871F = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
                kVar.f872G = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
                kVar.f873H = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                kVar.f874I = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                kVar.f877L = eVar.f776D;
                kVar.f884T = eVar.f781I;
                kVar.f885U = eVar.f780H;
                kVar.f887W = eVar.f783K;
                kVar.f886V = eVar.f782J;
                kVar.f911l0 = eVar.f794W;
                kVar.f912m0 = eVar.f795X;
                kVar.f888X = eVar.f784L;
                kVar.f889Y = eVar.f785M;
                kVar.f890Z = eVar.f787P;
                kVar.f892a0 = eVar.f788Q;
                kVar.f893b0 = eVar.f786N;
                kVar.f895c0 = eVar.O;
                kVar.f897d0 = eVar.f789R;
                kVar.f899e0 = eVar.f790S;
                kVar.f910k0 = eVar.f796Y;
                kVar.f879N = eVar.f833x;
                kVar.f880P = eVar.f835z;
                kVar.f878M = eVar.f832w;
                kVar.O = eVar.f834y;
                kVar.f882R = eVar.f773A;
                kVar.f881Q = eVar.f774B;
                kVar.f883S = eVar.f775C;
                kVar.f916o0 = eVar.f797Z;
                kVar.f875J = eVar.getMarginEnd();
                kVar.f876K = eVar.getMarginStart();
                int visibility = childAt.getVisibility();
                m mVar = jVar.b;
                mVar.f937a = visibility;
                mVar.f938c = childAt.getAlpha();
                float rotation = childAt.getRotation();
                n nVar = jVar.f863e;
                nVar.f941a = rotation;
                nVar.b = childAt.getRotationX();
                nVar.f942c = childAt.getRotationY();
                nVar.f943d = childAt.getScaleX();
                nVar.f944e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    nVar.f945f = pivotX;
                    nVar.f946g = pivotY;
                }
                nVar.f948i = childAt.getTranslationX();
                nVar.f949j = childAt.getTranslationY();
                nVar.f950k = childAt.getTranslationZ();
                if (nVar.l) {
                    nVar.m = childAt.getElevation();
                }
                if (childAt instanceof a) {
                    a aVar = (a) childAt;
                    kVar.f914n0 = aVar.getAllowsGoneWidget();
                    kVar.f906i0 = aVar.getReferencedIds();
                    kVar.f0 = aVar.getType();
                    kVar.f902g0 = aVar.getMargin();
                }
            }
            i9++;
            oVar = this;
        }
    }

    public final void e(Context context, int i9) {
        XmlResourceParser xml = context.getResources().getXml(i9);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType != 0) {
                    if (eventType == 2) {
                        String name = xml.getName();
                        j d2 = d(context, Xml.asAttributeSet(xml), false);
                        if (name.equalsIgnoreCase("Guideline")) {
                            d2.f862d.f891a = true;
                        }
                        this.f955c.put(Integer.valueOf(d2.f860a), d2);
                    }
                } else {
                    xml.getName();
                }
            }
        } catch (IOException e4) {
            e4.printStackTrace();
        } catch (XmlPullParserException e9) {
            e9.printStackTrace();
        }
    }
}
