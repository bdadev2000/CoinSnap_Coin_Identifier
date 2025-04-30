package com.core.ar;

import G7.j;
import G7.v;
import U4.r;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.hardware.display.DisplayManager;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Size;
import android.util.TypedValue;
import android.view.MotionEvent;
import androidx.core.app.NotificationCompat;
import com.bumptech.glide.f;
import com.google.ar.core.Anchor;
import com.google.ar.core.Camera;
import com.google.ar.core.CameraConfig;
import com.google.ar.core.CameraConfigFilter;
import com.google.ar.core.Config;
import com.google.ar.core.Frame;
import com.google.ar.core.HitResult;
import com.google.ar.core.Plane;
import com.google.ar.core.Pose;
import com.google.ar.core.Session;
import com.google.ar.core.Trackable;
import com.google.ar.core.TrackingFailureReason;
import com.google.ar.core.TrackingState;
import com.google.ar.core.exceptions.CameraNotAvailableException;
import com.google.ar.core.exceptions.UnavailableApkTooOldException;
import com.google.ar.core.exceptions.UnavailableArcoreNotInstalledException;
import com.google.ar.core.exceptions.UnavailableDeviceNotCompatibleException;
import com.google.ar.core.exceptions.UnavailableSdkTooOldException;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.o;
import com.tools.arruler.photomeasure.camera.ruler.R;
import com.tools.arruler.ui.component.arruler.ArRulerActivity;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import o2.InterfaceC2494a;
import p6.AbstractC2572a;
import q2.InterfaceC2640a;
import s2.AbstractC2694b;
import s2.C2693a;
import s2.C2695c;
import s2.d;
import t2.a;
import t2.b;
import t2.c;
import t7.C2720i;
import u2.C2749a;
import u2.C2750b;
import u2.C2751c;
import u2.C2752d;
import u7.AbstractC2816g;
import u7.AbstractC2817h;
import v2.AbstractC2847a;
import x0.AbstractC2914a;
import y2.AbstractC2947c;

/* loaded from: classes.dex */
public final class ArRulerSurface extends GLSurfaceView implements GLSurfaceView.Renderer {

    /* renamed from: R, reason: collision with root package name */
    public static String f13337R = "DRAW_SINGLE_LINE";

    /* renamed from: S, reason: collision with root package name */
    public static String f13338S = "DRAW_SINGLE_LINE";

    /* renamed from: A, reason: collision with root package name */
    public C2751c f13339A;

    /* renamed from: B, reason: collision with root package name */
    public C2751c f13340B;

    /* renamed from: C, reason: collision with root package name */
    public a f13341C;

    /* renamed from: D, reason: collision with root package name */
    public final ArrayBlockingQueue f13342D;

    /* renamed from: E, reason: collision with root package name */
    public final ArrayBlockingQueue f13343E;

    /* renamed from: F, reason: collision with root package name */
    public final ArrayBlockingQueue f13344F;

    /* renamed from: G, reason: collision with root package name */
    public final ArrayBlockingQueue f13345G;

    /* renamed from: H, reason: collision with root package name */
    public final ArrayBlockingQueue f13346H;

    /* renamed from: I, reason: collision with root package name */
    public InterfaceC2640a f13347I;

    /* renamed from: J, reason: collision with root package name */
    public InterfaceC2494a f13348J;

    /* renamed from: K, reason: collision with root package name */
    public final LinkedHashMap f13349K;

    /* renamed from: L, reason: collision with root package name */
    public final ArrayList f13350L;

    /* renamed from: M, reason: collision with root package name */
    public final ArrayList f13351M;

    /* renamed from: N, reason: collision with root package name */
    public final ArrayList f13352N;
    public float[] O;

    /* renamed from: P, reason: collision with root package name */
    public volatile boolean f13353P;

    /* renamed from: Q, reason: collision with root package name */
    public volatile TrackingState f13354Q;
    public boolean b;

    /* renamed from: c, reason: collision with root package name */
    public float[] f13355c;

    /* renamed from: d, reason: collision with root package name */
    public float[] f13356d;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f13357f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f13358g;

    /* renamed from: h, reason: collision with root package name */
    public final float[] f13359h;

    /* renamed from: i, reason: collision with root package name */
    public final float[] f13360i;

    /* renamed from: j, reason: collision with root package name */
    public Session f13361j;

    /* renamed from: k, reason: collision with root package name */
    public List f13362k;
    public ArrayList l;
    public ArrayList m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f13363n;

    /* renamed from: o, reason: collision with root package name */
    public int f13364o;

    /* renamed from: p, reason: collision with root package name */
    public Point f13365p;

    /* renamed from: q, reason: collision with root package name */
    public MotionEvent f13366q;

    /* renamed from: r, reason: collision with root package name */
    public c f13367r;

    /* renamed from: s, reason: collision with root package name */
    public d f13368s;

    /* renamed from: t, reason: collision with root package name */
    public C2693a f13369t;

    /* renamed from: u, reason: collision with root package name */
    public C2749a f13370u;

    /* renamed from: v, reason: collision with root package name */
    public C2752d f13371v;

    /* renamed from: w, reason: collision with root package name */
    public r f13372w;

    /* renamed from: x, reason: collision with root package name */
    public C2750b f13373x;

    /* renamed from: y, reason: collision with root package name */
    public C2750b f13374y;

    /* renamed from: z, reason: collision with root package name */
    public C2751c f13375z;

    public ArRulerSurface(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13355c = new float[16];
        this.f13356d = new float[16];
        this.f13357f = new float[16];
        this.f13358g = new float[16];
        this.f13359h = new float[16];
        this.f13360i = new float[16];
        this.f13363n = new ArrayList();
        this.f13341C = a.f23002d;
        this.f13342D = new ArrayBlockingQueue(16);
        this.f13343E = new ArrayBlockingQueue(16);
        this.f13344F = new ArrayBlockingQueue(16);
        this.f13345G = new ArrayBlockingQueue(16);
        this.f13346H = new ArrayBlockingQueue(16);
        this.f13349K = new LinkedHashMap();
        this.f13350L = new ArrayList();
        this.f13351M = new ArrayList();
        this.f13352N = new ArrayList();
        setEGLContextClientVersion(3);
        setPreserveEGLContextOnPause(true);
        setEGLConfigChooser(8, 8, 8, 8, 16, 0);
        setRenderer(this);
        setRenderMode(1);
        f13337R = getContext().getString(R.string.line_height);
        f13338S = getContext().getString(R.string.line_height);
    }

    public static String g(float[] fArr) {
        StringBuilder sb = new StringBuilder("[");
        for (float f9 : fArr) {
            sb.append(f9 + ", ");
        }
        sb.append("]");
        String sb2 = sb.toString();
        j.d(sb2, "toString(...)");
        return sb2;
    }

    public static boolean h(Session session) {
        Collection allTrackables = session.getAllTrackables(Plane.class);
        j.d(allTrackables, "getAllTrackables(...)");
        Collection collection = allTrackables;
        if (collection.isEmpty()) {
            return false;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((Plane) it.next()).getTrackingState() == TrackingState.TRACKING) {
                return true;
            }
        }
        return false;
    }

    public static boolean j(float[] fArr, float[] fArr2, Pose pose) {
        float f9 = 2;
        float[] fArr3 = {(fArr2[0] + fArr[0]) / f9, (fArr2[1] + fArr[1]) / f9, (fArr2[2] + fArr[2]) / f9};
        float[] fArr4 = {0.0f, 0.0f, -1.0f, 1.0f};
        float[] fArr5 = new float[16];
        pose.toMatrix(fArr5, 0);
        Matrix.multiplyMV(fArr4, 0, fArr5, 0, fArr4, 0);
        if ((fArr3[2] * fArr4[2]) + (fArr3[1] * fArr4[1]) + (fArr3[0] * fArr4[0]) <= 0.0f) {
            return false;
        }
        return true;
    }

    public final Bitmap a(GL10 gl10) {
        ByteBuffer allocate = ByteBuffer.allocate(getHeight() * getWidth() * 4);
        gl10.glReadPixels(0, 0, getWidth(), getHeight(), 6408, 5121, allocate);
        Bitmap createBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
        j.d(createBitmap, "createBitmap(...)");
        j.b(allocate);
        int width = getWidth();
        int height = getHeight();
        long currentTimeMillis = System.currentTimeMillis();
        int i9 = width * 4;
        byte[] bArr = new byte[i9];
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            if (i10 < height / 2) {
                allocate.get(bArr);
                System.arraycopy(allocate.array(), allocate.limit() - allocate.position(), allocate.array(), allocate.position() - i9, i9);
                System.arraycopy(bArr, 0, allocate.array(), allocate.limit() - allocate.position(), i9);
                i10 = i11;
            } else {
                allocate.rewind();
                Log.d("ArRulerSurface", "reverseBuf took " + (System.currentTimeMillis() - currentTimeMillis) + "ms");
                createBitmap.copyPixelsFromBuffer(allocate);
                return createBitmap;
            }
        }
    }

    public final void b() {
        List list;
        List list2;
        Integer num;
        if (!j.a(f13337R, f13338S) && (list = this.f13362k) != null && (!list.isEmpty())) {
            String str = f13338S;
            if (j.a(str, getContext().getString(R.string.line_height))) {
                ArrayList arrayList = this.l;
                if (arrayList != null) {
                    int size = arrayList.size() % 2;
                    if (size + ((((size ^ 2) & ((-size) | size)) >> 31) & 2) == 1) {
                        List list3 = this.f13362k;
                        if (list3 != null) {
                        }
                        ArrayList arrayList2 = this.l;
                        if (arrayList2 != null) {
                        }
                    }
                }
            } else if (j.a(str, getContext().getString(R.string.angle))) {
                ArrayList arrayList3 = this.m;
                if (arrayList3 != null) {
                    int size2 = arrayList3.size() % 3;
                    num = Integer.valueOf(size2 + ((((size2 ^ 3) & ((-size2) | size2)) >> 31) & 3));
                } else {
                    num = null;
                }
                if (num != null && num.intValue() == 2) {
                    List list4 = this.f13362k;
                    if (list4 != null) {
                    }
                    List list5 = this.f13362k;
                    if (list5 != null) {
                    }
                    ArrayList arrayList4 = this.m;
                    if (arrayList4 != null) {
                    }
                    ArrayList arrayList5 = this.m;
                    if (arrayList5 != null) {
                    }
                } else if (num != null && num.intValue() == 1) {
                    List list6 = this.f13362k;
                    if (list6 != null) {
                    }
                    ArrayList arrayList6 = this.m;
                    if (arrayList6 != null) {
                    }
                }
            } else if (j.a(str, getContext().getString(R.string.polyline))) {
                ArrayList arrayList7 = this.f13363n;
                if (((List) arrayList7.get(this.f13364o)).size() == 1 && (list2 = this.f13362k) != null) {
                }
                arrayList7.add(new ArrayList());
                this.f13364o++;
            } else {
                j.a(str, getContext().getString(R.string.distance));
            }
            f13338S = f13337R;
        }
    }

    public final void c(float[] fArr, float[] fArr2, Frame frame, Camera camera) {
        LinkedHashMap linkedHashMap;
        String str;
        float[] fArr3;
        ArrayList arrayList;
        int i9;
        int i10;
        float[] fArr4;
        String str2;
        String str3;
        String str4;
        MotionEvent motionEvent;
        float[] fArr5;
        String str5;
        String str6;
        int i11;
        String str7;
        c cVar;
        String str8;
        String str9;
        float[] fArr6;
        Boolean bool;
        Bitmap bitmap;
        Iterator<HitResult> it;
        int i12;
        float[] fArr7;
        String str10;
        LinkedHashMap linkedHashMap2;
        c cVar2;
        float[] fArr8;
        String str11;
        String str12;
        String str13;
        int i13;
        MotionEvent motionEvent2;
        int i14;
        int i15;
        double d2;
        LinkedHashMap linkedHashMap3;
        Pose pose;
        String str14;
        int i16;
        int i17;
        String str15;
        String str16;
        String str17;
        String str18;
        MotionEvent motionEvent3;
        int i18;
        String str19;
        String str20;
        String str21;
        int i19;
        Anchor anchor;
        int i20;
        Anchor anchor2;
        Anchor anchor3;
        ArrayList arrayList2;
        float[] fArr9;
        String str22;
        String str23;
        String str24;
        int i21;
        boolean z8;
        double d9;
        Pose pose2;
        int i22;
        int i23;
        LinkedHashMap linkedHashMap4;
        ArrayList arrayList3;
        int i24;
        String str25;
        Pose pose3;
        int i25;
        int i26;
        int i27 = 1;
        List list = this.f13362k;
        j.b(list);
        int size = list.size();
        for (int i28 = 0; i28 < size; i28++) {
            List list2 = this.f13362k;
            j.b(list2);
            if (((c) list2.get(i28)).b.getTrackingState() == TrackingState.TRACKING) {
                List list3 = this.f13362k;
                j.b(list3);
                float[] translation = ((c) list3.get(i28)).f23008a.getPose().getTranslation();
                C2750b c2750b = this.f13373x;
                j.b(c2750b);
                j.b(translation);
                c2750b.b(translation, this.f13356d, this.f13355c);
                C2750b c2750b2 = this.f13373x;
                j.b(c2750b2);
                c2750b2.a(1);
            }
        }
        ArrayList arrayList4 = this.l;
        j.b(arrayList4);
        int size2 = arrayList4.size();
        Pose pose4 = camera.getPose();
        String str26 = "getPose(...)";
        j.d(pose4, "getPose(...)");
        MotionEvent motionEvent4 = (MotionEvent) this.f13343E.poll();
        int i29 = 1;
        while (true) {
            linkedHashMap = this.f13349K;
            str = "TAG1";
            fArr3 = this.f13358g;
            if (i29 >= size2 || (arrayList3 = this.l) == null || AbstractC2817h.z(arrayList3).b(i29) != i27) {
                break;
            }
            ArrayList arrayList5 = this.l;
            j.b(arrayList5);
            c cVar3 = (c) arrayList5.get(i29 - 1);
            ArrayList arrayList6 = this.l;
            j.b(arrayList6);
            c cVar4 = (c) arrayList6.get(i29);
            Trackable trackable = cVar3.b;
            Trackable trackable2 = cVar4.b;
            TrackingState trackingState = trackable.getTrackingState();
            TrackingState trackingState2 = TrackingState.TRACKING;
            if (trackingState != trackingState2 && trackable2.getTrackingState() != trackingState2) {
                i24 = i29;
                str25 = str26;
                pose3 = pose4;
                i25 = size2;
                i26 = 1;
            } else {
                Pose pose5 = cVar3.f23008a.getPose();
                Pose pose6 = cVar4.f23008a.getPose();
                pose5.toMatrix(fArr3, 0);
                float[] fArr10 = this.f13358g;
                i24 = i29;
                Matrix.multiplyMM(fArr10, 0, fArr, 0, fArr10, 0);
                Matrix.multiplyMM(this.f13359h, 0, fArr2, 0, this.f13358g, 0);
                float[] translation2 = pose5.getTranslation();
                float[] translation3 = pose6.getTranslation();
                double d10 = 2;
                Log.i("TAG1", "drawLineAll: distance as meter " + ((float) Math.sqrt(((float) Math.pow(pose5.tx() - pose6.tx(), d10)) + ((float) Math.pow(pose5.ty() - pose6.ty(), d10)) + ((float) Math.pow(pose5.tz() - pose6.tz(), d10)))));
                j.b(translation2);
                String g9 = g(translation2);
                j.b(translation3);
                Log.i("ArRulerSurface1", "drawLineAll: p1: " + g9 + " - p2: " + g(translation3));
                str25 = str26;
                pose3 = pose4;
                i25 = size2;
                i26 = 1;
                if (d(1, translation2, translation3, fArr, fArr2, pose4, frame, Integer.valueOf(i24), motionEvent4, cVar3) && motionEvent4 != null) {
                    linkedHashMap.remove(cVar3);
                    motionEvent4 = null;
                }
            }
            i29 = i24 + 2;
            str26 = str25;
            i27 = i26;
            pose4 = pose3;
            size2 = i25;
        }
        String str27 = "drawLineAll: distance as meter ";
        String str28 = "drawLineAll: p1: ";
        LinkedHashMap linkedHashMap5 = linkedHashMap;
        String str29 = str26;
        int i30 = i27;
        String str30 = "ArRulerSurface1";
        String str31 = " - p2: ";
        ArrayList arrayList7 = this.m;
        j.b(arrayList7);
        int size3 = arrayList7.size();
        Pose pose7 = camera.getPose();
        j.d(pose7, str29);
        MotionEvent motionEvent5 = (MotionEvent) this.f13344F.poll();
        int i31 = i30;
        int i32 = 0;
        while (i31 < size3 && (arrayList2 = this.m) != null) {
            int i33 = size3;
            int i34 = i31 + 1;
            if (AbstractC2817h.z(arrayList2).b(i34) != i30) {
                break;
            }
            ArrayList arrayList8 = this.m;
            j.b(arrayList8);
            c cVar5 = (c) arrayList8.get(i31 - 1);
            ArrayList arrayList9 = this.m;
            j.b(arrayList9);
            c cVar6 = (c) arrayList9.get(i31);
            ArrayList arrayList10 = this.m;
            j.b(arrayList10);
            c cVar7 = (c) arrayList10.get(i34);
            int i35 = i31;
            Trackable trackable3 = cVar5.b;
            int i36 = i32;
            Trackable trackable4 = cVar6.b;
            Pose pose8 = pose7;
            Trackable trackable5 = cVar7.b;
            TrackingState trackingState3 = trackable3.getTrackingState();
            TrackingState trackingState4 = TrackingState.TRACKING;
            if (trackingState3 != trackingState4 && trackable4.getTrackingState() != trackingState4 && trackable5.getTrackingState() != trackingState4) {
                fArr9 = fArr3;
                str22 = str29;
                str23 = str30;
                str24 = str31;
                i22 = i36;
                pose2 = pose8;
                i23 = 1;
                linkedHashMap4 = linkedHashMap5;
            } else {
                Pose pose9 = cVar5.f23008a.getPose();
                Pose pose10 = cVar6.f23008a.getPose();
                Pose pose11 = cVar7.f23008a.getPose();
                pose9.toMatrix(fArr3, 0);
                float[] fArr11 = this.f13358g;
                fArr9 = fArr3;
                Matrix.multiplyMM(fArr11, 0, fArr, 0, fArr11, 0);
                Matrix.multiplyMM(this.f13359h, 0, fArr2, 0, this.f13358g, 0);
                float[] translation4 = pose9.getTranslation();
                float[] translation5 = pose10.getTranslation();
                float[] translation6 = pose11.getTranslation();
                j.b(translation4);
                j.b(translation5);
                str22 = str29;
                LinkedHashMap linkedHashMap6 = linkedHashMap5;
                str23 = str30;
                MotionEvent motionEvent6 = motionEvent5;
                str24 = str31;
                boolean e4 = e(translation4, translation5, fArr, fArr2, false, pose8, frame, Integer.valueOf(i35), motionEvent6, cVar5);
                j.b(translation6);
                boolean e9 = e(translation5, translation6, fArr, fArr2, true, pose8, frame, Integer.valueOf(i34), motionEvent6, cVar6);
                float f9 = translation4[0];
                float f10 = translation5[0];
                float f11 = 2;
                float f12 = translation4[1];
                float f13 = translation5[1];
                float f14 = translation4[2];
                float f15 = translation5[2];
                float[] fArr12 = {(f9 + f10) / f11, (f12 + f13) / f11, (f14 + f15) / f11};
                float[] fArr13 = {(translation6[0] + f10) / f11, (translation6[1] + f13) / f11, (translation6[2] + f15) / f11};
                ArrayList arrayList11 = this.f13350L;
                if (AbstractC2816g.L(i36, arrayList11) != null) {
                    d9 = ((Number) arrayList11.get(i36)).doubleValue();
                    i21 = i36;
                    z8 = e9;
                } else {
                    float[] fArr14 = {pose10.tx() - pose9.tx(), pose10.ty() - pose9.ty(), pose10.tz() - pose9.tz()};
                    i21 = i36;
                    float[] fArr15 = {pose11.tx() - pose10.tx(), pose11.ty() - pose10.ty(), pose11.tz() - pose10.tz()};
                    float f16 = (fArr15[2] * fArr14[2]) + (fArr15[1] * fArr14[1]) + (fArr15[0] * fArr14[0]);
                    double sqrt = Math.sqrt((r7 * r7) + (r5 * r5) + (r3 * r3));
                    float f17 = fArr15[0];
                    float f18 = fArr15[1];
                    float f19 = fArr15[2];
                    z8 = e9;
                    double degrees = 180 - Math.toDegrees(Math.acos(f16 / (sqrt * Math.sqrt((f19 * f19) + ((f18 * f18) + (f17 * f17))))));
                    arrayList11.add(Double.valueOf(degrees));
                    d9 = degrees;
                }
                String format = new DecimalFormat("0.00°").format(d9);
                if (j(fArr12, fArr13, pose8)) {
                    j.b(this.f13340B);
                    b bVar = new b(fArr12[0], fArr12[1], fArr12[2]);
                    S6.a aVar = new S6.a(1, bVar, new b(fArr13[0] - bVar.f23006a, fArr13[1] - bVar.b, fArr13[2] - bVar.f23007c));
                    float[] a6 = ((b) aVar.invoke(Float.valueOf(0.0f))).a();
                    float[] a9 = ((b) aVar.invoke(Float.valueOf(1.0f))).a();
                    C2751c c2751c = this.f13375z;
                    j.b(c2751c);
                    j.b(format);
                    Context context = getContext();
                    j.d(context, "getContext(...)");
                    i22 = i21;
                    pose2 = pose8;
                    i23 = 1;
                    c2751c.h(a6, a9, fArr, fArr2, format, context, 2.0f, true, false);
                    C2751c c2751c2 = this.f13375z;
                    j.b(c2751c2);
                    c2751c2.f();
                } else {
                    pose2 = pose8;
                    i22 = i21;
                    i23 = 1;
                }
                if ((e4 && motionEvent5 != null) || (z8 && motionEvent5 != null)) {
                    linkedHashMap4 = linkedHashMap6;
                    linkedHashMap4.remove(cVar5);
                    linkedHashMap4.remove(cVar6);
                    motionEvent5 = null;
                } else {
                    linkedHashMap4 = linkedHashMap6;
                }
            }
            i31 = i35 + 3;
            i32 = i22 + 1;
            linkedHashMap5 = linkedHashMap4;
            i30 = i23;
            size3 = i33;
            pose7 = pose2;
            fArr3 = fArr9;
            str29 = str22;
            str30 = str23;
            str31 = str24;
        }
        float[] fArr16 = fArr3;
        String str32 = str29;
        String str33 = str30;
        String str34 = str31;
        int i37 = i30;
        LinkedHashMap linkedHashMap7 = linkedHashMap5;
        String str35 = "getContext(...)";
        ArrayList arrayList12 = this.f13363n;
        int size4 = arrayList12.size();
        int i38 = 0;
        while (true) {
            String str36 = "unit";
            String str37 = "getTranslation(...)";
            String str38 = "createAnchor(...)";
            if (i38 >= size4) {
                String str39 = "getTranslation(...)";
                String str40 = "hitTest(...)";
                String str41 = str35;
                String str42 = str38;
                float[] fArr17 = fArr16;
                ArrayList arrayList13 = this.f13351M;
                float[] fArr18 = this.f13356d;
                float[] fArr19 = this.f13355c;
                MotionEvent motionEvent7 = (MotionEvent) this.f13346H.poll();
                int i39 = 0;
                for (int size5 = arrayList13.size(); i39 < size5 && AbstractC2817h.z(arrayList13).b(i39); size5 = i9) {
                    c cVar8 = (c) arrayList13.get(i39);
                    if (cVar8.b.getTrackingState() == TrackingState.TRACKING) {
                        Pose pose12 = cVar8.f23008a.getPose();
                        Pose pose13 = camera.getPose();
                        float[] fArr20 = fArr17;
                        pose12.toMatrix(fArr20, 0);
                        float[] fArr21 = this.f13358g;
                        fArr5 = fArr20;
                        i9 = size5;
                        i10 = i39;
                        Matrix.multiplyMM(fArr21, 0, fArr18, 0, fArr21, 0);
                        Matrix.multiplyMM(this.f13359h, 0, fArr19, 0, this.f13358g, 0);
                        float[] translation7 = pose12.getTranslation();
                        pose13.getTranslation();
                        double tx = pose12.tx() - pose13.tx();
                        double d11 = 2;
                        Math.sqrt(((float) Math.pow(tx, d11)) + ((float) Math.pow(pose12.ty() - pose13.ty(), d11)) + ((float) Math.pow(pose12.tz() - pose13.tz(), d11)));
                        j.b(translation7);
                        if (motionEvent7 != null) {
                            List<HitResult> hitTest = frame.hitTest(motionEvent7);
                            j.d(hitTest, str40);
                            cVar = null;
                            for (Iterator<HitResult> it2 = hitTest.iterator(); it2.hasNext(); it2 = it) {
                                HitResult next = it2.next();
                                Trackable trackable6 = next.getTrackable();
                                if (trackable6 instanceof Plane) {
                                    it = it2;
                                    if (((Plane) trackable6).isPoseInPolygon(next.getHitPose())) {
                                        Anchor createAnchor = next.createAnchor();
                                        j.d(createAnchor, str42);
                                        cVar = new c(createAnchor, (Plane) trackable6);
                                    }
                                } else {
                                    it = it2;
                                }
                                str42 = str42;
                            }
                            str7 = str42;
                        } else {
                            str7 = str42;
                            cVar = null;
                        }
                        ArrayList arrayList14 = this.f13352N;
                        if (cVar != null) {
                            j.b(this.f13375z);
                            float[] translation8 = cVar.f23008a.getPose().getTranslation();
                            str5 = str39;
                            j.d(translation8, str5);
                            float[] c9 = C2751c.c(translation8, fArr18);
                            j.b(this.f13375z);
                            float[] b = C2751c.b(translation7, 0.007f, fArr18);
                            str6 = str7;
                            j.b(this.f13375z);
                            float[] b8 = C2751c.b(translation7, -0.007f, fArr18);
                            str2 = str40;
                            C2751c c2751c3 = this.f13375z;
                            j.b(c2751c3);
                            float[] a10 = C2751c.a(c2751c3, b8, b);
                            str8 = str;
                            C2751c c2751c4 = this.f13375z;
                            j.b(c2751c4);
                            C2751c.g(c2751c4, b8, b, a10);
                            j.b(this.f13375z);
                            float f20 = c9[0] - b[0];
                            float f21 = c9[1] - b[1];
                            if ((f21 * f21) + (f20 * f20) <= 4.9000002E-5f) {
                                c cVar9 = (c) AbstractC2816g.L(i10, arrayList13);
                                List list4 = this.f13362k;
                                if (list4 != null) {
                                    v.a(list4).remove(cVar9);
                                }
                                arrayList13.remove(i10);
                                arrayList14.remove(i10);
                                arrayList = arrayList13;
                                fArr4 = fArr18;
                                str3 = str41;
                                if (motionEvent7 != null) {
                                    str4 = str8;
                                    motionEvent7 = null;
                                    i11 = 1;
                                    i39 = i10 + i11;
                                    str39 = str5;
                                    str = str4;
                                    str42 = str6;
                                    str40 = str2;
                                    arrayList13 = arrayList;
                                    fArr17 = fArr5;
                                    fArr18 = fArr4;
                                    str41 = str3;
                                } else {
                                    motionEvent = motionEvent7;
                                    str4 = str8;
                                }
                            }
                        } else {
                            str6 = str7;
                            str2 = str40;
                            str8 = str;
                            str5 = str39;
                        }
                        float[] translation9 = camera.getPose().getTranslation();
                        arrayList = arrayList13;
                        float[] fArr22 = {translation7[0] - camera.getPose().getTranslation()[0], translation7[1] - camera.getPose().getTranslation()[1], translation7[2] - camera.getPose().getTranslation()[2]};
                        float[] fArr23 = this.O;
                        if (fArr23 != null) {
                            float f22 = fArr22[0];
                            float f23 = fArr23[0];
                            float f24 = fArr22[1];
                            float f25 = fArr23[1];
                            float f26 = (f24 * f25) + (f22 * f23);
                            float f27 = fArr22[2];
                            float f28 = fArr23[2];
                            float f29 = (f27 * f28) + f26;
                            float[] fArr24 = {(f23 * f29) + translation9[0], (f25 * f29) + translation9[1], (f29 * f28) + translation9[2]};
                            float[] fArr25 = new float[4];
                            camera.getPose().getRotationQuaternion(fArr25, 0);
                            Pose pose14 = new Pose(fArr24, fArr25);
                            float f30 = fArr22[0];
                            float f31 = fArr22[1];
                            float f32 = fArr22[2];
                            motionEvent = motionEvent7;
                            double sqrt2 = (float) Math.sqrt((f32 * f32) + (f31 * f31) + (f30 * f30));
                            DecimalFormat decimalFormat = new DecimalFormat("0");
                            a aVar2 = this.f13341C;
                            j.e(aVar2, "unit");
                            int ordinal = aVar2.ordinal();
                            if (ordinal != 0) {
                                if (ordinal != 1) {
                                    if (ordinal != 2) {
                                        if (ordinal != 3) {
                                            if (ordinal != 4) {
                                                if (ordinal == 5) {
                                                    sqrt2 *= 1.094d;
                                                } else {
                                                    throw new RuntimeException();
                                                }
                                            } else {
                                                sqrt2 *= 3.281d;
                                            }
                                        } else {
                                            sqrt2 *= 39.37d;
                                        }
                                        str9 = str5;
                                        fArr6 = fArr18;
                                    } else {
                                        fArr6 = fArr18;
                                        sqrt2 *= 1000;
                                    }
                                } else {
                                    fArr6 = fArr18;
                                }
                                str9 = str5;
                            } else {
                                str9 = str5;
                                fArr6 = fArr18;
                                sqrt2 *= 100;
                            }
                            String j7 = o.j(decimalFormat.format(Integer.valueOf(R2.b.x(sqrt2))), this.f13341C.b);
                            Iterator it3 = arrayList14.iterator();
                            int i40 = 0;
                            while (it3.hasNext()) {
                                Object next2 = it3.next();
                                int i41 = i40 + 1;
                                if (i40 >= 0) {
                                    C2720i c2720i = (C2720i) next2;
                                    if (((Number) c2720i.b).intValue() == i10) {
                                        arrayList14.set(i40, new C2720i(c2720i.b, Boolean.TRUE));
                                    }
                                    i40 = i41;
                                } else {
                                    AbstractC2817h.D();
                                    throw null;
                                }
                            }
                            C2751c c2751c5 = this.f13375z;
                            if (c2751c5 != null) {
                                str5 = str9;
                                j.d(pose14.getTranslation(), str5);
                                Context context2 = getContext();
                                j.d(context2, str41);
                                C2720i c2720i2 = (C2720i) AbstractC2816g.L(i10, arrayList14);
                                if (c2720i2 != null) {
                                    bool = (Boolean) c2720i2.f23021c;
                                } else {
                                    bool = null;
                                }
                                j.e(fArr19, "projectionMatrix");
                                j.e(j7, "lineLength");
                                c2751c5.m = (int) 4283123522L;
                                float[] fArr26 = fArr6;
                                float[] b9 = C2751c.b(translation7, 0.09f, fArr26);
                                float[] b10 = C2751c.b(translation7, -0.09f, fArr26);
                                if (bool != null && !bool.booleanValue()) {
                                    C2751c.a(c2751c5, b10, b9);
                                }
                                float[] a11 = C2751c.a(c2751c5, b10, b9);
                                Bitmap bitmap2 = c2751c5.f23095o;
                                if (bitmap2 == null) {
                                    bitmap = AbstractC2847a.b(context2, c2751c5.m, j7);
                                    str3 = str41;
                                } else {
                                    Paint paint = new Paint(1);
                                    paint.setTextSize(TypedValue.applyDimension(1, 10.0f, Resources.getSystem().getDisplayMetrics()));
                                    paint.getTextBounds(j7, 0, j7.length(), new Rect());
                                    str3 = str41;
                                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap2, R2.b.x(Math.abs((r12.right - r12.left) * 1.0d)) + 128, R2.b.x(Math.abs((r12.top - r12.bottom) * 1.0d)) + 36, false);
                                    j.d(createScaledBitmap, "createScaledBitmap(...)");
                                    Canvas canvas = new Canvas(createScaledBitmap);
                                    paint.setTypeface(K.o.a(context2, R.font.poppins_medium));
                                    paint.setColor(Color.parseColor("#343944"));
                                    canvas.drawText(j7, 50.0f, r12 + 20, paint);
                                    bitmap = createScaledBitmap;
                                }
                                float[] fArr27 = {a11[0], a11[1]};
                                float[] fArr28 = {fArr27[0], fArr27[1]};
                                float[] d12 = AbstractC2847a.d(AbstractC2847a.f(fArr28));
                                float[] d13 = AbstractC2847a.d(fArr28);
                                float f33 = d12[0];
                                float f34 = d12[1];
                                fArr4 = fArr26;
                                d12[0] = (float) (f33 / Math.sqrt((f34 * f34) + (f33 * f33)));
                                float sqrt3 = (float) (d12[1] / Math.sqrt((r8 * r8) + (r7 * r7)));
                                d12[1] = sqrt3;
                                float f35 = 2;
                                float f36 = 0.01f / f35;
                                float f37 = d13[0] * f36;
                                float f38 = f36 * d13[1];
                                float f39 = 0.005f / f35;
                                float f40 = d12[0] * f39;
                                float f41 = f39 * sqrt3;
                                float f42 = (a11[0] - f37) - f40;
                                float[] fArr29 = c2751c5.f23089g;
                                fArr29[0] = f42;
                                fArr29[1] = (a11[1] - f38) - f41;
                                fArr29[2] = a11[2];
                                float f43 = a11[0];
                                float f44 = f43 + f37;
                                fArr29[3] = f44 - f40;
                                float f45 = a11[1];
                                float f46 = f45 + f38;
                                fArr29[4] = f46 - f41;
                                float f47 = a11[2];
                                fArr29[5] = f47;
                                float f48 = f44 + f40;
                                fArr29[6] = f48;
                                float f49 = f46 + f41;
                                fArr29[7] = f49;
                                fArr29[8] = f47;
                                float f50 = f43 - f37;
                                fArr29[9] = f50 - f40;
                                float f51 = f45 - f38;
                                fArr29[10] = f51 - f41;
                                fArr29[11] = f47;
                                fArr29[12] = f48;
                                fArr29[13] = f49;
                                fArr29[14] = f47;
                                float f52 = f50 + f40;
                                fArr29[15] = f52;
                                float f53 = f51 + f41;
                                fArr29[16] = f53;
                                fArr29[17] = f47;
                                float[] fArr30 = c2751c5.f23090h;
                                if (f48 > f52) {
                                    fArr30[0] = 0.0f;
                                    fArr30[1] = 1.0f;
                                    fArr30[2] = 1.0f;
                                    fArr30[3] = 1.0f;
                                    fArr30[4] = 1.0f;
                                    fArr30[5] = 0.0f;
                                    fArr30[6] = 0.0f;
                                    fArr30[7] = 1.0f;
                                    fArr30[8] = 1.0f;
                                    fArr30[9] = 0.0f;
                                    fArr30[10] = 0.0f;
                                    fArr30[11] = 0.0f;
                                } else {
                                    fArr30[0] = 1.0f;
                                    fArr30[1] = 0.0f;
                                    fArr30[2] = 0.0f;
                                    fArr30[3] = 0.0f;
                                    fArr30[4] = 0.0f;
                                    fArr30[5] = 1.0f;
                                    fArr30[6] = 1.0f;
                                    fArr30[7] = 0.0f;
                                    fArr30[8] = 0.0f;
                                    fArr30[9] = 1.0f;
                                    fArr30[10] = 1.0f;
                                    fArr30[11] = 1.0f;
                                }
                                c2751c5.f23085c = fArr19;
                                float f54 = fArr29[6] - f52;
                                float f55 = fArr29[7] - f53;
                                float f56 = fArr29[8];
                                double sqrt4 = Math.sqrt((f55 * f55) + (f54 * f54));
                                str4 = str8;
                                Log.i(str4, "upData: danwei distance " + sqrt4);
                                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(fArr29.length * 4);
                                allocateDirect.order(ByteOrder.nativeOrder());
                                FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
                                c2751c5.f23087e = asFloatBuffer;
                                j.b(asFloatBuffer);
                                asFloatBuffer.put(fArr29);
                                FloatBuffer floatBuffer = c2751c5.f23087e;
                                j.b(floatBuffer);
                                floatBuffer.position(0);
                                GLES20.glActiveTexture(33984);
                                GLES20.glBindTexture(3553, c2751c5.f23091i[0]);
                                GLUtils.texImage2D(3553, 0, bitmap, 0);
                                GLES20.glGenerateMipmap(3553);
                                if (c2751c5.f23094n == null) {
                                    bitmap.recycle();
                                }
                                ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(fArr30.length * 4);
                                allocateDirect2.order(ByteOrder.nativeOrder());
                                FloatBuffer asFloatBuffer2 = allocateDirect2.asFloatBuffer();
                                c2751c5.l = asFloatBuffer2;
                                j.b(asFloatBuffer2);
                                asFloatBuffer2.put(fArr30);
                                FloatBuffer floatBuffer2 = c2751c5.l;
                                j.b(floatBuffer2);
                                floatBuffer2.position(0);
                            } else {
                                fArr4 = fArr6;
                                str3 = str41;
                                str4 = str8;
                                str5 = str9;
                            }
                            C2751c c2751c6 = this.f13375z;
                            if (c2751c6 != null) {
                                c2751c6.f();
                            }
                            motionEvent7 = motionEvent;
                            i11 = 1;
                            i39 = i10 + i11;
                            str39 = str5;
                            str = str4;
                            str42 = str6;
                            str40 = str2;
                            arrayList13 = arrayList;
                            fArr17 = fArr5;
                            fArr18 = fArr4;
                            str41 = str3;
                        } else {
                            fArr4 = fArr18;
                            str3 = str41;
                            motionEvent = motionEvent7;
                            str4 = str8;
                            motionEvent7 = motionEvent;
                            i11 = 1;
                            i39 = i10 + i11;
                            str39 = str5;
                            str = str4;
                            str42 = str6;
                            str40 = str2;
                            arrayList13 = arrayList;
                            fArr17 = fArr5;
                            fArr18 = fArr4;
                            str41 = str3;
                        }
                    } else {
                        arrayList = arrayList13;
                        i9 = size5;
                        i10 = i39;
                        fArr4 = fArr18;
                        str2 = str40;
                        str3 = str41;
                        str4 = str;
                        motionEvent = motionEvent7;
                        fArr5 = fArr17;
                        str5 = str39;
                        str6 = str42;
                    }
                    motionEvent7 = motionEvent;
                    i11 = 1;
                    i39 = i10 + i11;
                    str39 = str5;
                    str = str4;
                    str42 = str6;
                    str40 = str2;
                    arrayList13 = arrayList;
                    fArr17 = fArr5;
                    fArr18 = fArr4;
                    str41 = str3;
                }
                return;
            }
            int i42 = size4;
            int size6 = ((List) arrayList12.get(i38)).size();
            String str43 = "hitTest(...)";
            Pose pose15 = camera.getPose();
            String str44 = str32;
            j.d(pose15, str44);
            MotionEvent motionEvent8 = (MotionEvent) this.f13345G.poll();
            Pose pose16 = pose15;
            int i43 = i37;
            while (i43 < size6 && AbstractC2817h.z((Collection) arrayList12.get(i38)).b(i43)) {
                String str45 = str44;
                int i44 = i43 - 1;
                c cVar10 = (c) ((List) arrayList12.get(i38)).get(i44);
                c cVar11 = (c) ((List) arrayList12.get(i38)).get(i43);
                String str46 = str37;
                Trackable trackable7 = cVar10.b;
                String str47 = str36;
                Trackable trackable8 = cVar11.b;
                TrackingState trackingState5 = trackable7.getTrackingState();
                MotionEvent motionEvent9 = motionEvent8;
                TrackingState trackingState6 = TrackingState.TRACKING;
                if (trackingState5 != trackingState6 && trackable8.getTrackingState() != trackingState6) {
                    i18 = i43;
                    i16 = i38;
                    i12 = size6;
                    str14 = str28;
                    str15 = str38;
                    pose = pose16;
                    str16 = str46;
                    str19 = str47;
                    motionEvent3 = motionEvent9;
                    fArr7 = fArr16;
                    str10 = str45;
                    str18 = str33;
                    str17 = str35;
                    i17 = i42;
                    str20 = str27;
                    str21 = str43;
                    linkedHashMap2 = linkedHashMap7;
                } else {
                    Pose pose17 = cVar10.f23008a.getPose();
                    Pose pose18 = cVar11.f23008a.getPose();
                    float[] fArr31 = fArr16;
                    pose17.toMatrix(fArr31, 0);
                    float[] fArr32 = this.f13358g;
                    i12 = size6;
                    fArr7 = fArr31;
                    str10 = str45;
                    int i45 = i43;
                    String str48 = str35;
                    String str49 = str38;
                    Pose pose19 = pose16;
                    String str50 = str43;
                    linkedHashMap2 = linkedHashMap7;
                    Matrix.multiplyMM(fArr32, 0, fArr, 0, fArr32, 0);
                    Matrix.multiplyMM(this.f13359h, 0, fArr2, 0, this.f13358g, 0);
                    float[] translation10 = pose17.getTranslation();
                    float[] translation11 = pose18.getTranslation();
                    int i46 = i38;
                    double d14 = 2;
                    Log.i("TAG1", str27 + ((float) Math.sqrt(((float) Math.pow(pose17.tx() - pose18.tx(), d14)) + ((float) Math.pow(pose17.ty() - pose18.ty(), d14)) + ((float) Math.pow(pose17.tz() - pose18.tz(), d14)))));
                    j.b(translation10);
                    String g10 = g(translation10);
                    j.b(translation11);
                    String g11 = g(translation11);
                    StringBuilder sb = new StringBuilder(str28);
                    sb.append(g10);
                    String str51 = str34;
                    sb.append(str51);
                    sb.append(g11);
                    String str52 = str33;
                    Log.i(str52, sb.toString());
                    if (motionEvent9 != null) {
                        List<HitResult> hitTest2 = frame.hitTest(motionEvent9);
                        j.d(hitTest2, str50);
                        Iterator<HitResult> it4 = hitTest2.iterator();
                        cVar2 = null;
                        while (it4.hasNext()) {
                            HitResult next3 = it4.next();
                            Iterator<HitResult> it5 = it4;
                            Trackable trackable9 = next3.getTrackable();
                            c cVar12 = cVar2;
                            if ((trackable9 instanceof Plane) && ((Plane) trackable9).isPoseInPolygon(next3.getHitPose())) {
                                Anchor createAnchor2 = next3.createAnchor();
                                j.d(createAnchor2, str49);
                                cVar2 = new c(createAnchor2, (Plane) trackable9);
                                it4 = it5;
                            } else {
                                it4 = it5;
                                cVar2 = cVar12;
                            }
                        }
                    } else {
                        cVar2 = null;
                    }
                    if (cVar2 != null) {
                        j.b(this.f13375z);
                        float[] translation12 = cVar2.f23008a.getPose().getTranslation();
                        j.d(translation12, str46);
                        fArr8 = fArr;
                        float[] c10 = C2751c.c(translation12, fArr8);
                        j.b(this.f13375z);
                        float[] c11 = C2751c.c(translation10, fArr8);
                        str11 = str52;
                        j.b(this.f13375z);
                        float[] c12 = C2751c.c(translation11, fArr8);
                        str12 = str46;
                        C2751c c2751c7 = this.f13375z;
                        j.b(c2751c7);
                        float[] a12 = C2751c.a(c2751c7, c12, c11);
                        str13 = str49;
                        C2751c c2751c8 = this.f13375z;
                        j.b(c2751c8);
                        C2751c.g(c2751c8, c12, c11, a12);
                        j.b(this.f13375z);
                        i13 = i46;
                        if (C2751c.e(a12, c10)) {
                            if (((List) arrayList12.get(i13)).size() == 2) {
                                i19 = i45;
                                c cVar13 = (c) AbstractC2816g.L(i19, (List) arrayList12.get(i13));
                                c cVar14 = (c) AbstractC2816g.L(i44, (List) arrayList12.get(i13));
                                List list5 = this.f13362k;
                                if (list5 != null) {
                                    v.a(list5).remove(cVar13);
                                }
                                List list6 = this.f13362k;
                                if (list6 != null) {
                                    v.a(list6).remove(cVar14);
                                }
                                if (cVar13 != null && (anchor3 = cVar13.f23008a) != null) {
                                    anchor3.detach();
                                }
                                if (cVar14 != null && (anchor2 = cVar14.f23008a) != null) {
                                    anchor2.detach();
                                }
                                ((List) arrayList12.get(i13)).remove(i19);
                            } else {
                                i19 = i45;
                                c cVar15 = (c) AbstractC2816g.L(i19, (List) arrayList12.get(i13));
                                List list7 = this.f13362k;
                                if (list7 != null) {
                                    v.a(list7).remove(cVar15);
                                }
                                if (cVar15 != null && (anchor = cVar15.f23008a) != null) {
                                    anchor.detach();
                                }
                            }
                            if (motionEvent9 != null) {
                                linkedHashMap2.remove(cVar10);
                                i16 = i13;
                                str34 = str51;
                                str14 = str28;
                                motionEvent8 = null;
                                i17 = i42;
                                str15 = str13;
                                str16 = str12;
                                str17 = str48;
                                str18 = str11;
                                str19 = str47;
                                pose = pose19;
                                i20 = 1;
                                i18 = i19;
                                str20 = str27;
                                str21 = str50;
                                i43 = i18 + 1;
                                str36 = str19;
                                str35 = str17;
                                str28 = str14;
                                str33 = str18;
                                linkedHashMap7 = linkedHashMap2;
                                str44 = str10;
                                size6 = i12;
                                i38 = i16;
                                fArr16 = fArr7;
                                str38 = str15;
                                i37 = i20;
                                str43 = str21;
                                str27 = str20;
                                i42 = i17;
                                pose16 = pose;
                                str37 = str16;
                            } else {
                                motionEvent3 = motionEvent9;
                                i16 = i13;
                                str34 = str51;
                                str14 = str28;
                                i17 = i42;
                                str15 = str13;
                                str16 = str12;
                                str17 = str48;
                                str18 = str11;
                                str19 = str47;
                                pose = pose19;
                                i18 = i19;
                                str20 = str27;
                                str21 = str50;
                            }
                        }
                    } else {
                        fArr8 = fArr;
                        str11 = str52;
                        str12 = str46;
                        str13 = str49;
                        i13 = i46;
                    }
                    C2750b c2750b3 = this.f13374y;
                    j.b(c2750b3);
                    c2750b3.c(fArr8, fArr2, translation10, translation11);
                    C2750b c2750b4 = this.f13374y;
                    j.b(c2750b4);
                    c2750b4.a(1);
                    Double d15 = (Double) linkedHashMap2.get(cVar10);
                    if (d15 != null) {
                        d2 = d15.doubleValue();
                        motionEvent2 = motionEvent9;
                        i14 = i13;
                        i15 = i45;
                    } else {
                        double d16 = translation10[1] - translation11[1];
                        motionEvent2 = motionEvent9;
                        i14 = i13;
                        double d17 = translation10[0] - translation11[0];
                        i15 = i45;
                        double d18 = translation10[2] - translation11[2];
                        double sqrt5 = Math.sqrt((d18 * d18) + (d16 * d16) + (d17 * d17));
                        linkedHashMap2.put(cVar10, Double.valueOf(sqrt5));
                        d2 = sqrt5;
                    }
                    DecimalFormat decimalFormat2 = new DecimalFormat("0.00");
                    a aVar3 = this.f13341C;
                    j.e(aVar3, str47);
                    int ordinal2 = aVar3.ordinal();
                    if (ordinal2 != 0) {
                        if (ordinal2 != 1) {
                            if (ordinal2 != 2) {
                                if (ordinal2 != 3) {
                                    if (ordinal2 != 4) {
                                        if (ordinal2 == 5) {
                                            d2 *= 1.094d;
                                        } else {
                                            throw new RuntimeException();
                                        }
                                    } else {
                                        d2 *= 3.281d;
                                    }
                                } else {
                                    d2 *= 39.37d;
                                }
                                linkedHashMap3 = linkedHashMap2;
                            } else {
                                linkedHashMap3 = linkedHashMap2;
                                d2 *= 1000;
                            }
                        } else {
                            linkedHashMap3 = linkedHashMap2;
                        }
                    } else {
                        linkedHashMap3 = linkedHashMap2;
                        d2 *= 100;
                    }
                    String j9 = o.j(decimalFormat2.format(d2), this.f13341C.b);
                    if (j(translation10, translation11, pose19)) {
                        j.b(this.f13375z);
                        b bVar2 = new b(translation10[0], translation10[1], translation10[2]);
                        S6.a aVar4 = new S6.a(1, bVar2, new b(translation11[0] - bVar2.f23006a, translation11[1] - bVar2.b, translation11[2] - bVar2.f23007c));
                        String arrays = Arrays.toString(((b) aVar4.invoke(Float.valueOf(0.5f))).a());
                        j.d(arrays, "toString(...)");
                        Log.i("TAG", "drawLine: ".concat(arrays));
                        float[] a13 = ((b) aVar4.invoke(Float.valueOf(0.0f))).a();
                        float[] a14 = ((b) aVar4.invoke(Float.valueOf(1.0f))).a();
                        C2751c c2751c9 = this.f13375z;
                        j.b(c2751c9);
                        Context context3 = getContext();
                        j.d(context3, str48);
                        motionEvent3 = motionEvent2;
                        pose = pose19;
                        i16 = i14;
                        str18 = str11;
                        i17 = i42;
                        str16 = str12;
                        str15 = str13;
                        i18 = i15;
                        str34 = str51;
                        str19 = str47;
                        str20 = str27;
                        str21 = str50;
                        linkedHashMap2 = linkedHashMap3;
                        c2751c9.h(a13, a14, fArr, fArr2, j9, context3, 2.0f, true, false);
                        C2751c c2751c10 = this.f13375z;
                        j.b(c2751c10);
                        c2751c10.f();
                        C2751c c2751c11 = this.f13339A;
                        if (c2751c11 != null) {
                            Context context4 = getContext();
                            j.d(context4, str48);
                            str14 = str28;
                            str17 = str48;
                            c2751c11.h(a13, a14, fArr, fArr2, j9, context4, 1.0f, false, true);
                        } else {
                            str14 = str28;
                            str17 = str48;
                        }
                        C2751c c2751c12 = this.f13339A;
                        if (c2751c12 != null) {
                            c2751c12.f();
                        }
                    } else {
                        pose = pose19;
                        str34 = str51;
                        str14 = str28;
                        i16 = i14;
                        i17 = i42;
                        str15 = str13;
                        str16 = str12;
                        str17 = str48;
                        str18 = str11;
                        motionEvent3 = motionEvent2;
                        i18 = i15;
                        str19 = str47;
                        str20 = str27;
                        str21 = str50;
                        linkedHashMap2 = linkedHashMap3;
                    }
                }
                motionEvent8 = motionEvent3;
                i20 = 1;
                i43 = i18 + 1;
                str36 = str19;
                str35 = str17;
                str28 = str14;
                str33 = str18;
                linkedHashMap7 = linkedHashMap2;
                str44 = str10;
                size6 = i12;
                i38 = i16;
                fArr16 = fArr7;
                str38 = str15;
                i37 = i20;
                str43 = str21;
                str27 = str20;
                i42 = i17;
                pose16 = pose;
                str37 = str16;
            }
            i38++;
            i37 = i37;
            str35 = str35;
            str28 = str28;
            str33 = str33;
            linkedHashMap7 = linkedHashMap7;
            str27 = str27;
            str32 = str44;
            size4 = i42;
            fArr16 = fArr16;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x026d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(int r19, float[] r20, float[] r21, float[] r22, float[] r23, com.google.ar.core.Pose r24, com.google.ar.core.Frame r25, java.lang.Integer r26, android.view.MotionEvent r27, t2.c r28) {
        /*
            Method dump skipped, instructions count: 623
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.core.ar.ArRulerSurface.d(int, float[], float[], float[], float[], com.google.ar.core.Pose, com.google.ar.core.Frame, java.lang.Integer, android.view.MotionEvent, t2.c):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:92:0x01e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e(float[] r18, float[] r19, float[] r20, float[] r21, boolean r22, com.google.ar.core.Pose r23, com.google.ar.core.Frame r24, java.lang.Integer r25, android.view.MotionEvent r26, t2.c r27) {
        /*
            Method dump skipped, instructions count: 631
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.core.ar.ArRulerSurface.e(float[], float[], float[], float[], boolean, com.google.ar.core.Pose, com.google.ar.core.Frame, java.lang.Integer, android.view.MotionEvent, t2.c):boolean");
    }

    public final void f(Frame frame, float[] fArr, float[] fArr2) {
        boolean z8;
        AbstractC2572a.a("ArRulerSurface", String.valueOf(this.f13365p));
        Anchor anchor = null;
        for (HitResult hitResult : frame.hitTest(this.f13366q)) {
            Trackable trackable = hitResult.getTrackable();
            if ((trackable instanceof Plane) && ((Plane) trackable).isPoseInPolygon(hitResult.getHitPose())) {
                try {
                    anchor = hitResult.createAnchor();
                    j.b(anchor);
                    this.f13367r = new c(anchor, (Plane) trackable);
                } catch (Exception e4) {
                    AbstractC2572a.a("ArRulerSurface", AbstractC2914a.d("drawPointPicture: createAnchor ", e4.getMessage()));
                }
            }
        }
        boolean z9 = true;
        if (anchor != null) {
            float[] fArr3 = new float[16];
            anchor.getPose().toMatrix(fArr3, 0);
            C2752d c2752d = this.f13371v;
            j.b(c2752d);
            Matrix.setIdentityM(c2752d.f23105j, 0);
            Matrix.multiplyMM(c2752d.f23105j, 0, fArr, 0, fArr3, 0);
            float[] fArr4 = c2752d.f23105j;
            Matrix.multiplyMM(fArr4, 0, fArr2, 0, fArr4, 0);
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(72);
            allocateDirect.order(ByteOrder.nativeOrder());
            FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
            c2752d.f23097a = asFloatBuffer;
            j.b(asFloatBuffer);
            asFloatBuffer.put(C2752d.f23096k);
            FloatBuffer floatBuffer = c2752d.f23097a;
            j.b(floatBuffer);
            floatBuffer.position(0);
            ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(48);
            allocateDirect2.order(ByteOrder.nativeOrder());
            FloatBuffer asFloatBuffer2 = allocateDirect2.asFloatBuffer();
            c2752d.b = asFloatBuffer2;
            j.b(asFloatBuffer2);
            asFloatBuffer2.put(C2752d.l);
            FloatBuffer floatBuffer2 = c2752d.b;
            j.b(floatBuffer2);
            floatBuffer2.position(0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, c2752d.f23104i[0]);
            GLUtils.texImage2D(3553, 0, c2752d.f23098c, 0);
            GLES20.glGenerateMipmap(3553);
            AbstractC2847a.a("d", "upData Error");
            if (this.f13342D.isEmpty()) {
                C2752d c2752d2 = this.f13371v;
                j.b(c2752d2);
                GLES20.glUseProgram(c2752d2.f23099d);
                GLES20.glUniformMatrix4fv(c2752d2.f23101f, 1, false, c2752d2.f23105j, 0);
                GLES20.glVertexAttribPointer(c2752d2.f23100e, 3, 5126, false, 0, (Buffer) c2752d2.f23097a);
                GLES20.glVertexAttribPointer(c2752d2.f23102g, 2, 5126, false, 0, (Buffer) c2752d2.b);
                GLES20.glEnableVertexAttribArray(c2752d2.f23100e);
                GLES20.glEnableVertexAttribArray(c2752d2.f23102g);
                GLES20.glEnable(3042);
                GLES20.glDepthMask(false);
                GLES20.glBlendFunc(770, 771);
                GLES20.glDrawArrays(4, 0, 6);
                GLES20.glDisableVertexAttribArray(c2752d2.f23100e);
                GLES20.glDisableVertexAttribArray(c2752d2.f23102g);
                GLES20.glDisable(3042);
                AbstractC2847a.a("d", "onDraw Error");
            }
            String arrays = Arrays.toString(anchor.getPose().getTranslation());
            j.d(arrays, "toString(...)");
            AbstractC2572a.a("ArRulerSurface", arrays);
        }
        if (anchor != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f13353P = z8;
        InterfaceC2640a interfaceC2640a = this.f13347I;
        j.b(interfaceC2640a);
        if (anchor != null) {
            z9 = false;
        }
        ((ArRulerActivity) interfaceC2640a).x(getContext().getString(R.string.plane_detection), z9);
    }

    public final TrackingState getTrackingState() {
        return this.f13354Q;
    }

    public final boolean i(Frame frame) {
        Anchor anchor = null;
        for (HitResult hitResult : frame.hitTest(this.f13366q)) {
            Trackable trackable = hitResult.getTrackable();
            if ((trackable instanceof Plane) && ((Plane) trackable).isPoseInPolygon(hitResult.getHitPose())) {
                try {
                    anchor = hitResult.createAnchor();
                } catch (Exception e4) {
                    AbstractC2572a.a("ArRulerSurface", AbstractC2914a.d("drawPointPicture: createAnchor ", e4.getMessage()));
                }
            }
        }
        if (anchor != null) {
            return true;
        }
        return false;
    }

    public final void k(GL10 gl10, Camera camera, Frame frame, Boolean bool) {
        InterfaceC2494a interfaceC2494a;
        c cVar;
        synchronized (this.f13351M) {
            try {
                d dVar = this.f13368s;
                if (dVar != null && ((MotionEvent) dVar.f22972a.poll()) != null && (cVar = this.f13367r) != null) {
                    List list = this.f13362k;
                    if (list != null) {
                        list.add(cVar);
                    }
                    this.f13351M.add(cVar);
                    this.f13352N.add(new C2720i(Integer.valueOf(AbstractC2817h.A(this.f13351M)), Boolean.FALSE));
                    InterfaceC2640a interfaceC2640a = this.f13347I;
                    if (interfaceC2640a != null) {
                        ArRulerActivity arRulerActivity = (ArRulerActivity) interfaceC2640a;
                        arRulerActivity.runOnUiThread(new z6.d(arRulerActivity, 0));
                    }
                }
                int size = this.f13351M.size();
                float[] fArr = this.f13356d;
                float[] fArr2 = this.f13355c;
                j.d(camera.getPose(), "getPose(...)");
                c(fArr, fArr2, frame, camera);
                if (bool != null && i(frame) && (interfaceC2494a = this.f13348J) != null) {
                    ((f) interfaceC2494a).j(a(gl10));
                }
                f(frame, this.f13356d, this.f13355c);
                c cVar2 = (c) AbstractC2816g.L(size - 1, this.f13351M);
                if (cVar2 != null) {
                    Trackable trackable = cVar2.b;
                    if (trackable instanceof Plane) {
                        this.O = ((Plane) trackable).getCenterPose().getZAxis();
                    }
                }
            } finally {
            }
        }
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f13337R = getContext().getString(R.string.line_height);
        f13338S = getContext().getString(R.string.line_height);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        Frame update;
        Camera camera;
        TrackingState trackingState;
        TrackingState trackingState2;
        List list;
        boolean z8;
        InterfaceC2494a interfaceC2494a;
        InterfaceC2494a interfaceC2494a2;
        boolean z9;
        InterfaceC2494a interfaceC2494a3;
        List list2;
        j.e(gl10, "gl");
        GLES20.glClear(16640);
        if (this.f13361j == null) {
            return;
        }
        C2693a c2693a = this.f13369t;
        j.b(c2693a);
        Session session = this.f13361j;
        if (c2693a.f22966a) {
            session.setDisplayGeometry(c2693a.f22969e.getRotation(), c2693a.b, c2693a.f22967c);
            c2693a.f22966a = false;
        }
        try {
            if (!this.b) {
                Session session2 = this.f13361j;
                j.b(session2);
                C2749a c2749a = this.f13370u;
                j.b(c2749a);
                session2.setCameraTextureNames(new int[]{c2749a.f23074g});
                this.b = true;
            }
            Session session3 = this.f13361j;
            j.b(session3);
            update = session3.update();
            j.d(update, "update(...)");
            C2749a c2749a2 = this.f13370u;
            j.b(c2749a2);
            c2749a2.a(update);
            camera = update.getCamera();
            j.d(camera, "getCamera(...)");
            AbstractC2572a.a("ArRulerSurface", camera.getTrackingState());
            float[] fArr = new float[16];
            this.f13356d = fArr;
            this.f13355c = new float[16];
            camera.getViewMatrix(fArr, 0);
            camera.getProjectionMatrix(this.f13355c, 0, 0.1f, 100.0f);
            Matrix.setIdentityM(this.f13358g, 0);
            Matrix.multiplyMM(this.f13357f, 0, this.f13356d, 0, this.f13358g, 0);
            Matrix.multiplyMM(this.f13359h, 0, this.f13360i, 0, this.f13357f, 0);
            this.f13354Q = camera.getTrackingState();
            trackingState = camera.getTrackingState();
            trackingState2 = TrackingState.PAUSED;
        } catch (Exception e4) {
            e4.printStackTrace();
            return;
        }
        if (trackingState == trackingState2 && camera.getTrackingFailureReason() == TrackingFailureReason.NONE) {
            InterfaceC2640a interfaceC2640a = this.f13347I;
            j.b(interfaceC2640a);
            ((ArRulerActivity) interfaceC2640a).x(getContext().getString(R.string.plane_detection), true);
            Log.i("TAG", "onDrawFrame: camera.trackingState == TrackingState.PAUSED &&\n camera.trackingFailureReason == TrackingFailureReason.NONE");
            return;
        }
        if (camera.getTrackingState() == trackingState2) {
            InterfaceC2640a interfaceC2640a2 = this.f13347I;
            j.b(interfaceC2640a2);
            ((ArRulerActivity) interfaceC2640a2).x(AbstractC2947c.m(camera), true);
            Log.i("TAG", "onDrawFrame: camera.trackingState == TrackingState.PAUSED");
            return;
        }
        Session session4 = this.f13361j;
        if (session4 != null && h(session4) && (list2 = this.f13362k) != null && list2.isEmpty()) {
            Log.i("TAG", "onDrawFrame: session?.hasTrackingPlane() == true && mAnchorList?.isEmpty() == true");
        } else {
            Session session5 = this.f13361j;
            if (session5 != null && h(session5) && (list = this.f13362k) != null && (!list.isEmpty())) {
                Log.i("TAG", "onDrawFrame: session?.hasTrackingPlane() == true && mAnchorList?.isNotEmpty() == true");
            } else {
                Log.i("TAG", "onDrawFrame: else");
                InterfaceC2640a interfaceC2640a3 = this.f13347I;
                j.b(interfaceC2640a3);
                ((ArRulerActivity) interfaceC2640a3).x(getContext().getString(R.string.plane_detection), true);
                return;
            }
        }
        Boolean bool = (Boolean) this.f13342D.poll();
        b();
        if (this.f13353P) {
            String str = f13337R;
            if (j.a(str, getContext().getString(R.string.angle))) {
                ArrayList arrayList = this.m;
                j.b(arrayList);
                synchronized (arrayList) {
                    try {
                        d dVar = this.f13368s;
                        j.b(dVar);
                        if (((MotionEvent) dVar.f22972a.poll()) != null && this.f13367r != null) {
                            List list3 = this.f13362k;
                            j.b(list3);
                            c cVar = this.f13367r;
                            j.b(cVar);
                            list3.add(cVar);
                            ArrayList arrayList2 = this.m;
                            j.b(arrayList2);
                            c cVar2 = this.f13367r;
                            j.b(cVar2);
                            arrayList2.add(cVar2);
                            InterfaceC2640a interfaceC2640a4 = this.f13347I;
                            if (interfaceC2640a4 != null) {
                                ArRulerActivity arRulerActivity = (ArRulerActivity) interfaceC2640a4;
                                arRulerActivity.runOnUiThread(new z6.d(arRulerActivity, 0));
                            }
                        }
                        ArrayList arrayList3 = this.m;
                        j.b(arrayList3);
                        int size = arrayList3.size();
                        if (size % 3 != 0) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        for (int i9 = 0; i9 < size; i9++) {
                            ArrayList arrayList4 = this.m;
                            j.b(arrayList4);
                            if (((c) arrayList4.get(i9)).b.getTrackingState() == TrackingState.TRACKING && i9 % 3 != 0) {
                                C2750b c2750b = this.f13374y;
                                j.b(c2750b);
                                float[] fArr2 = this.f13356d;
                                float[] fArr3 = this.f13355c;
                                ArrayList arrayList5 = this.m;
                                j.b(arrayList5);
                                float[] translation = ((c) arrayList5.get(i9 - 1)).f23008a.getPose().getTranslation();
                                j.d(translation, "getTranslation(...)");
                                ArrayList arrayList6 = this.m;
                                j.b(arrayList6);
                                float[] translation2 = ((c) arrayList6.get(i9)).f23008a.getPose().getTranslation();
                                j.d(translation2, "getTranslation(...)");
                                c2750b.c(fArr2, fArr3, translation, translation2);
                                C2750b c2750b2 = this.f13374y;
                                j.b(c2750b2);
                                c2750b2.a(1);
                            }
                        }
                        float[] fArr4 = this.f13356d;
                        float[] fArr5 = this.f13355c;
                        j.d(camera.getPose(), "getPose(...)");
                        c(fArr4, fArr5, update, camera);
                        if (bool != null && i(update) && (interfaceC2494a3 = this.f13348J) != null) {
                            ((f) interfaceC2494a3).j(a(gl10));
                        }
                        f(update, this.f13356d, this.f13355c);
                        if (z9) {
                            ArrayList arrayList7 = this.m;
                            j.b(arrayList7);
                            c cVar3 = (c) AbstractC2816g.L(size - 1, arrayList7);
                            if (cVar3 != null) {
                                C2750b c2750b3 = this.f13373x;
                                j.b(c2750b3);
                                float[] translation3 = cVar3.f23008a.getPose().getTranslation();
                                j.d(translation3, "getTranslation(...)");
                                c2750b3.b(translation3, this.f13356d, this.f13355c);
                                C2750b c2750b4 = this.f13373x;
                                j.b(c2750b4);
                                c2750b4.a(0);
                                float[] translation4 = cVar3.f23008a.getPose().getTranslation();
                                j.d(translation4, "getTranslation(...)");
                                c cVar4 = this.f13367r;
                                j.b(cVar4);
                                float[] translation5 = cVar4.f23008a.getPose().getTranslation();
                                j.d(translation5, "getTranslation(...)");
                                float[] fArr6 = this.f13356d;
                                float[] fArr7 = this.f13355c;
                                Pose pose = camera.getPose();
                                j.d(pose, "getPose(...)");
                                d(0, translation4, translation5, fArr6, fArr7, pose, null, null, null, null);
                            }
                        }
                    } finally {
                    }
                }
                return;
            }
            if (j.a(str, getContext().getString(R.string.polyline))) {
                synchronized (this.f13363n) {
                    try {
                        d dVar2 = this.f13368s;
                        j.b(dVar2);
                        if (((MotionEvent) dVar2.f22972a.poll()) != null && this.f13367r != null) {
                            List list4 = this.f13362k;
                            j.b(list4);
                            c cVar5 = this.f13367r;
                            j.b(cVar5);
                            list4.add(cVar5);
                            List list5 = (List) this.f13363n.get(this.f13364o);
                            c cVar6 = this.f13367r;
                            j.b(cVar6);
                            list5.add(cVar6);
                            InterfaceC2640a interfaceC2640a5 = this.f13347I;
                            if (interfaceC2640a5 != null) {
                                ArRulerActivity arRulerActivity2 = (ArRulerActivity) interfaceC2640a5;
                                arRulerActivity2.runOnUiThread(new z6.d(arRulerActivity2, 0));
                            }
                        }
                        int size2 = ((List) this.f13363n.get(this.f13364o)).size();
                        float[] fArr8 = this.f13356d;
                        float[] fArr9 = this.f13355c;
                        j.d(camera.getPose(), "getPose(...)");
                        c(fArr8, fArr9, update, camera);
                        if (bool != null && i(update) && (interfaceC2494a2 = this.f13348J) != null) {
                            ((f) interfaceC2494a2).j(a(gl10));
                        }
                        f(update, this.f13356d, this.f13355c);
                        c cVar7 = (c) AbstractC2816g.L(size2 - 1, (List) this.f13363n.get(this.f13364o));
                        if (cVar7 != null) {
                            C2750b c2750b5 = this.f13373x;
                            j.b(c2750b5);
                            float[] translation6 = cVar7.f23008a.getPose().getTranslation();
                            j.d(translation6, "getTranslation(...)");
                            c2750b5.b(translation6, this.f13356d, this.f13355c);
                            C2750b c2750b6 = this.f13373x;
                            j.b(c2750b6);
                            c2750b6.a(0);
                            float[] translation7 = cVar7.f23008a.getPose().getTranslation();
                            j.d(translation7, "getTranslation(...)");
                            c cVar8 = this.f13367r;
                            j.b(cVar8);
                            float[] translation8 = cVar8.f23008a.getPose().getTranslation();
                            j.d(translation8, "getTranslation(...)");
                            float[] fArr10 = this.f13356d;
                            float[] fArr11 = this.f13355c;
                            Pose pose2 = camera.getPose();
                            j.d(pose2, "getPose(...)");
                            d(0, translation7, translation8, fArr10, fArr11, pose2, null, null, null, null);
                        }
                    } finally {
                    }
                }
                return;
            }
            if (j.a(str, getContext().getString(R.string.distance))) {
                k(gl10, camera, update, bool);
                return;
            }
            ArrayList arrayList8 = this.l;
            j.b(arrayList8);
            synchronized (arrayList8) {
                try {
                    d dVar3 = this.f13368s;
                    j.b(dVar3);
                    if (((MotionEvent) dVar3.f22972a.poll()) != null && this.f13367r != null) {
                        List list6 = this.f13362k;
                        j.b(list6);
                        c cVar9 = this.f13367r;
                        j.b(cVar9);
                        list6.add(cVar9);
                        ArrayList arrayList9 = this.l;
                        j.b(arrayList9);
                        c cVar10 = this.f13367r;
                        j.b(cVar10);
                        arrayList9.add(cVar10);
                        InterfaceC2640a interfaceC2640a6 = this.f13347I;
                        if (interfaceC2640a6 != null) {
                            ArRulerActivity arRulerActivity3 = (ArRulerActivity) interfaceC2640a6;
                            arRulerActivity3.runOnUiThread(new z6.d(arRulerActivity3, 0));
                        }
                    }
                    ArrayList arrayList10 = this.l;
                    j.b(arrayList10);
                    int size3 = arrayList10.size();
                    if (size3 % 2 != 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    float[] fArr12 = this.f13356d;
                    float[] fArr13 = this.f13355c;
                    j.d(camera.getPose(), "getPose(...)");
                    c(fArr12, fArr13, update, camera);
                    if (bool != null && i(update) && (interfaceC2494a = this.f13348J) != null) {
                        ((f) interfaceC2494a).j(a(gl10));
                    }
                    f(update, this.f13356d, this.f13355c);
                    if (z8) {
                        ArrayList arrayList11 = this.l;
                        j.b(arrayList11);
                        c cVar11 = (c) AbstractC2816g.L(size3 - 1, arrayList11);
                        if (cVar11 != null) {
                            C2750b c2750b7 = this.f13373x;
                            j.b(c2750b7);
                            float[] translation9 = cVar11.f23008a.getPose().getTranslation();
                            j.d(translation9, "getTranslation(...)");
                            c2750b7.b(translation9, this.f13356d, this.f13355c);
                            C2750b c2750b8 = this.f13373x;
                            j.b(c2750b8);
                            c2750b8.a(0);
                            float[] translation10 = cVar11.f23008a.getPose().getTranslation();
                            j.d(translation10, "getTranslation(...)");
                            c cVar12 = this.f13367r;
                            j.b(cVar12);
                            float[] translation11 = cVar12.f23008a.getPose().getTranslation();
                            j.d(translation11, "getTranslation(...)");
                            float[] fArr14 = this.f13356d;
                            float[] fArr15 = this.f13355c;
                            Pose pose3 = camera.getPose();
                            j.d(pose3, "getPose(...)");
                            d(0, translation10, translation11, fArr14, fArr15, pose3, null, null, null, null);
                        }
                    }
                } finally {
                }
            }
            return;
            e4.printStackTrace();
            return;
        }
        f(update, this.f13356d, this.f13355c);
    }

    @Override // android.opengl.GLSurfaceView
    public final void onPause() {
        super.onPause();
        C2693a c2693a = this.f13369t;
        if (c2693a != null) {
            j.b(c2693a);
            ((DisplayManager) c2693a.f22968d.getSystemService(DisplayManager.class)).unregisterDisplayListener(c2693a);
        }
    }

    @Override // android.opengl.GLSurfaceView
    public final void onResume() {
        super.onResume();
        C2693a c2693a = this.f13369t;
        if (c2693a != null) {
            j.b(c2693a);
            ((DisplayManager) c2693a.f22968d.getSystemService(DisplayManager.class)).registerDisplayListener(c2693a, null);
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i9, int i10) {
        j.e(gl10, "gl");
        C2693a c2693a = this.f13369t;
        j.b(c2693a);
        c2693a.b = i9;
        c2693a.f22967c = i10;
        c2693a.f22966a = true;
        GLES20.glViewport(0, 0, i9, i10);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [u2.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [U4.r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6, types: [float[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r5v7, types: [int[], java.io.Serializable] */
    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        String obj;
        Size size;
        Size size2;
        float f9;
        float f10;
        j.e(gl10, "gl");
        j.e(eGLConfig, "config");
        GLES20.glClearColor(0.1f, 0.1f, 0.1f, 1.0f);
        this.f13369t = new C2693a(getContext());
        ?? obj2 = new Object();
        obj2.f23074g = -1;
        this.f13370u = obj2;
        this.f13371v = new C2752d();
        ?? obj3 = new Object();
        obj3.f3327e = new float[16];
        obj3.f3324a = new float[16];
        obj3.f3326d = new int[1];
        this.f13372w = obj3;
        this.f13373x = new C2750b(1);
        this.f13375z = new C2751c();
        this.f13339A = new C2751c();
        this.f13340B = new C2751c();
        try {
            Bitmap decodeStream = BitmapFactory.decodeStream(getContext().getAssets().open("models/bg_distance_ar.png"));
            Bitmap decodeStream2 = BitmapFactory.decodeStream(getContext().getAssets().open("models/bg_recycler.png"));
            Bitmap decodeStream3 = BitmapFactory.decodeStream(getContext().getAssets().open("models/delete_icon.png"));
            C2751c c2751c = this.f13339A;
            if (c2751c != null) {
                c2751c.f23094n = decodeStream3;
                c2751c.f23095o = null;
            }
            C2751c c2751c2 = this.f13375z;
            if (c2751c2 != null) {
                c2751c2.f23094n = decodeStream;
                c2751c2.f23095o = decodeStream2;
            }
        } catch (IOException e4) {
            e4.printStackTrace();
        }
        this.f13374y = new C2750b(0);
        C2749a c2749a = this.f13370u;
        j.b(c2749a);
        Context context = getContext();
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i9 = iArr[0];
        c2749a.f23074g = i9;
        GLES20.glBindTexture(36197, i9);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        GLES20.glTexParameteri(36197, 10241, 9728);
        GLES20.glTexParameteri(36197, 10240, 9728);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(48);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        c2749a.f23069a = asFloatBuffer;
        asFloatBuffer.put(C2749a.f23067h);
        c2749a.f23069a.position(0);
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(32);
        allocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer2 = allocateDirect2.asFloatBuffer();
        c2749a.b = asFloatBuffer2;
        asFloatBuffer2.put(C2749a.f23068i);
        c2749a.b.position(0);
        ByteBuffer allocateDirect3 = ByteBuffer.allocateDirect(32);
        allocateDirect3.order(ByteOrder.nativeOrder());
        c2749a.f23070c = allocateDirect3.asFloatBuffer();
        int c9 = AbstractC2847a.c(context, "a", "shaders/screenquad.vert", 35633);
        int c10 = AbstractC2847a.c(context, "a", "shaders/screenquad.frag", 35632);
        int glCreateProgram = GLES20.glCreateProgram();
        c2749a.f23071d = glCreateProgram;
        GLES20.glAttachShader(glCreateProgram, c9);
        GLES20.glAttachShader(c2749a.f23071d, c10);
        GLES20.glLinkProgram(c2749a.f23071d);
        GLES20.glUseProgram(c2749a.f23071d);
        GLES20.glDeleteShader(c9);
        GLES20.glDeleteShader(c10);
        AbstractC2847a.a("a", "Program creation");
        c2749a.f23072e = GLES20.glGetAttribLocation(c2749a.f23071d, "a_Position");
        c2749a.f23073f = GLES20.glGetAttribLocation(c2749a.f23071d, "a_TexCoord");
        AbstractC2847a.a("a", "Program parameters");
        C2752d c2752d = this.f13371v;
        j.b(c2752d);
        Context context2 = getContext();
        j.d(context2, "getContext(...)");
        try {
            c2752d.f23098c = BitmapFactory.decodeStream(context2.getAssets().open("models/pointCircle.png"));
        } catch (IOException e9) {
            e9.printStackTrace();
        }
        int c11 = AbstractC2847a.c(context2, "d", "shaders/point_circle.vert", 35633);
        int c12 = AbstractC2847a.c(context2, "d", "shaders/point_circle.frag", 35632);
        int glCreateProgram2 = GLES20.glCreateProgram();
        c2752d.f23099d = glCreateProgram2;
        GLES20.glAttachShader(glCreateProgram2, c11);
        GLES20.glAttachShader(c2752d.f23099d, c12);
        GLES20.glLinkProgram(c2752d.f23099d);
        GLES20.glUseProgram(c2752d.f23099d);
        c2752d.f23100e = GLES20.glGetAttribLocation(c2752d.f23099d, "a_Position");
        c2752d.f23102g = GLES20.glGetAttribLocation(c2752d.f23099d, "a_TexCoord");
        c2752d.f23101f = GLES20.glGetUniformLocation(c2752d.f23099d, "mvpMatrix");
        c2752d.f23103h = GLES20.glGetAttribLocation(c2752d.f23099d, "u_TextureUnit");
        GLES20.glDeleteShader(c11);
        GLES20.glDeleteShader(c12);
        AbstractC2847a.a("d", "loadShader Error");
        int[] iArr2 = c2752d.f23104i;
        GLES20.glGenTextures(iArr2.length, iArr2, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, iArr2[0]);
        GLES20.glUniform1i(c2752d.f23103h, 0);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        AbstractC2847a.a("d", "createTexture Error");
        r rVar = this.f13372w;
        if (rVar != null) {
            Context context3 = getContext();
            j.d(context3, "getContext(...)");
            int c13 = AbstractC2847a.c(context3, CampaignEx.JSON_KEY_AD_R, "shaders/point_circle.vert", 35633);
            int c14 = AbstractC2847a.c(context3, CampaignEx.JSON_KEY_AD_R, "shaders/point_circle.frag", 35632);
            int glCreateProgram3 = GLES20.glCreateProgram();
            rVar.b = glCreateProgram3;
            GLES20.glAttachShader(glCreateProgram3, c13);
            GLES20.glAttachShader(rVar.b, c14);
            GLES20.glLinkProgram(rVar.b);
            GLES20.glUseProgram(rVar.b);
            AbstractC2847a.a(CampaignEx.JSON_KEY_AD_R, "Program creation");
            GLES20.glGetAttribLocation(rVar.b, "a_Position");
            GLES20.glGetUniformLocation(rVar.b, "mvpMatrix");
            GLES20.glGetAttribLocation(rVar.b, "a_TexCoord");
            rVar.f3325c = GLES20.glGetAttribLocation(rVar.b, "u_TextureUnit");
            GLES20.glDeleteShader(c13);
            GLES20.glDeleteShader(c14);
            AbstractC2847a.a(CampaignEx.JSON_KEY_AD_R, "loadShader Error");
            int[] iArr3 = (int[]) rVar.f3326d;
            GLES20.glGenTextures(iArr3.length, iArr3, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, iArr3[0]);
            GLES20.glUniform1i(rVar.f3325c, 0);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, 10240, 9729);
            AbstractC2847a.a(CampaignEx.JSON_KEY_AD_R, "createTexture Error");
            Matrix.setIdentityM((float[]) rVar.f3327e, 0);
            int i10 = Resources.getSystem().getDisplayMetrics().widthPixels;
            int i11 = Resources.getSystem().getDisplayMetrics().heightPixels;
            if (i10 > i11) {
                f9 = i10;
                f10 = i11;
            } else {
                f9 = i11;
                f10 = i10;
            }
            float f11 = f9 / f10;
            if (i10 > i11) {
                Matrix.orthoM((float[]) rVar.f3324a, 0, -f11, f11, -1.0f, 1.0f, -1.0f, 1.0f);
            } else {
                Matrix.orthoM((float[]) rVar.f3324a, 0, -1.0f, 1.0f, -f11, f11, -1.0f, 1.0f);
            }
        }
        C2750b c2750b = this.f13373x;
        j.b(c2750b);
        Context context4 = getContext();
        j.d(context4, "getContext(...)");
        int c15 = AbstractC2847a.c(context4, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "shaders/point.vert", 35633);
        int c16 = AbstractC2847a.c(context4, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "shaders/point.frag", 35632);
        int glCreateProgram4 = GLES20.glCreateProgram();
        c2750b.b = glCreateProgram4;
        GLES20.glAttachShader(glCreateProgram4, c15);
        GLES20.glAttachShader(c2750b.b, c16);
        GLES20.glLinkProgram(c2750b.b);
        GLES20.glUseProgram(c2750b.b);
        AbstractC2847a.a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Program creation");
        c2750b.f23076c = GLES20.glGetAttribLocation(c2750b.b, "a_Position");
        c2750b.f23080g = GLES20.glGetUniformLocation(c2750b.b, "mvpMatrix");
        c2750b.f23077d = GLES20.glGetUniformLocation(c2750b.b, "u_Color");
        C2751c c2751c3 = this.f13375z;
        j.b(c2751c3);
        Context context5 = getContext();
        j.d(context5, "getContext(...)");
        c2751c3.d(context5);
        C2751c c2751c4 = this.f13339A;
        if (c2751c4 != null) {
            Context context6 = getContext();
            j.d(context6, "getContext(...)");
            c2751c4.d(context6);
        }
        C2751c c2751c5 = this.f13340B;
        if (c2751c5 != null) {
            Context context7 = getContext();
            j.d(context7, "getContext(...)");
            c2751c5.d(context7);
        }
        C2750b c2750b2 = this.f13374y;
        j.b(c2750b2);
        Context context8 = getContext();
        j.d(context8, "getContext(...)");
        int c17 = AbstractC2847a.c(context8, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "shaders/line.vert", 35633);
        int c18 = AbstractC2847a.c(context8, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "shaders/line.frag", 35632);
        int glCreateProgram5 = GLES20.glCreateProgram();
        c2750b2.b = glCreateProgram5;
        GLES20.glAttachShader(glCreateProgram5, c17);
        GLES20.glAttachShader(c2750b2.b, c18);
        GLES20.glLinkProgram(c2750b2.b);
        GLES20.glUseProgram(c2750b2.b);
        AbstractC2847a.a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Program creation");
        c2750b2.f23076c = GLES20.glGetAttribLocation(c2750b2.b, "a_Position");
        c2750b2.f23080g = GLES20.glGetUniformLocation(c2750b2.b, "mvpMatrix");
        c2750b2.f23077d = GLES20.glGetUniformLocation(c2750b2.b, "u_Color");
        C2695c c2695c = AbstractC2694b.f22970a;
        Context context9 = getContext();
        if (c2695c.f22971a == null) {
            Exception exc = new Exception();
            try {
                c2695c.f22971a = new Session(context9);
                Size size3 = new Size(0, 0);
                CameraConfig cameraConfig = null;
                for (CameraConfig cameraConfig2 : c2695c.f22971a.getSupportedCameraConfigs(new CameraConfigFilter(c2695c.f22971a))) {
                    Size imageSize = cameraConfig2.getImageSize();
                    Size textureSize = cameraConfig2.getTextureSize();
                    Log.d(com.mbridge.msdk.foundation.controller.a.f15376a, "CurrentCameraConfig CPU image size:" + imageSize + " GPU texture size:" + textureSize);
                    if (textureSize.getWidth() > size3.getWidth()) {
                        cameraConfig = cameraConfig2;
                        size3 = textureSize;
                    }
                }
                if (cameraConfig != null) {
                    size = cameraConfig.getImageSize();
                    size2 = cameraConfig.getTextureSize();
                } else {
                    cameraConfig = c2695c.f22971a.getCameraConfig();
                    size = null;
                    size2 = null;
                }
                Log.d(com.mbridge.msdk.foundation.controller.a.f15376a, "Selected CameraConfig CPU image size:" + size + " GPU texture size:" + size2);
                c2695c.f22971a.setCameraConfig(cameraConfig);
                Config config = c2695c.f22971a.getConfig();
                config.setFocusMode(Config.FocusMode.AUTO);
                config.setPlaneFindingMode(Config.PlaneFindingMode.HORIZONTAL_AND_VERTICAL);
                c2695c.f22971a.configure(config);
                c2695c.f22971a.resume();
                c2695c.f22971a.pause();
                c2695c.f22971a.resume();
                obj = "";
            } catch (CameraNotAvailableException e10) {
                exc = e10;
                obj = "Session resume failed";
            } catch (UnavailableApkTooOldException e11) {
                exc = e11;
                obj = "Please update this app";
            } catch (UnavailableArcoreNotInstalledException e12) {
                exc = e12;
                obj = "Please install ARCore";
            } catch (UnavailableDeviceNotCompatibleException e13) {
                exc = e13;
                obj = "This device does not support AR";
            } catch (UnavailableSdkTooOldException e14) {
                exc = e14;
                obj = "Please update ARCore";
            } catch (Exception e15) {
                exc = e15;
                obj = exc.toString();
            }
            AbstractC2572a.a(null, exc + ":" + obj);
        }
        Session session = c2695c.f22971a;
        this.f13361j = session;
        if (session != null) {
            j.b(session);
            Config config2 = session.getConfig();
            config2.setLightEstimationMode(Config.LightEstimationMode.ENVIRONMENTAL_HDR);
            Session session2 = this.f13361j;
            j.b(session2);
            Config.DepthMode depthMode = Config.DepthMode.AUTOMATIC;
            if (session2.isDepthModeSupported(depthMode)) {
                config2.setDepthMode(depthMode);
            }
            session.configure(config2);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        j.e(motionEvent, NotificationCompat.CATEGORY_EVENT);
        performClick();
        if (motionEvent.getAction() == 0) {
            this.f13343E.offer(motionEvent);
            this.f13344F.offer(motionEvent);
            this.f13345G.offer(motionEvent);
            this.f13346H.offer(motionEvent);
            return true;
        }
        return true;
    }

    public final void setAnchorList(List<c> list) {
        this.f13362k = list;
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.f13363n.add(new ArrayList());
    }

    public final void setArRulerCallBack(InterfaceC2640a interfaceC2640a) {
        this.f13347I = interfaceC2640a;
    }

    public final void setArSurfaceListener(InterfaceC2494a interfaceC2494a) {
        this.f13348J = interfaceC2494a;
    }

    public final void setFlash(boolean z8) {
        Object systemService = getContext().getSystemService("camera");
        j.c(systemService, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
        CameraManager cameraManager = (CameraManager) systemService;
        String str = cameraManager.getCameraIdList()[0];
        if (z8) {
            try {
                cameraManager.setTorchMode(str, true);
                return;
            } catch (CameraAccessException e4) {
                AbstractC2572a.a("ArRulerSurface", e4);
                return;
            }
        }
        try {
            cameraManager.setTorchMode(str, false);
        } catch (CameraAccessException e9) {
            AbstractC2572a.a("ArRulerSurface", e9);
        }
    }

    public final void setMotionEvent(MotionEvent motionEvent) {
        this.f13366q = motionEvent;
    }

    public final void setPoint(Point point) {
        this.f13365p = point;
    }

    public final void setTapHelper(d dVar) {
        this.f13368s = dVar;
    }

    public final void setUnit(a aVar) {
        j.e(aVar, "unit");
        this.f13341C = aVar;
    }
}
