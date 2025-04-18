package androidx.compose.ui.contentcapture;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.LongSparseArray;
import android.view.View;
import android.view.translation.TranslationRequestValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.collection.ArraySet;
import androidx.collection.IntObjectMap;
import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableIntSet;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.contentcapture.AndroidContentCaptureManager;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.SemanticsNodeCopy;
import androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds;
import androidx.compose.ui.platform.SemanticsUtils_androidKt;
import androidx.compose.ui.platform.coreshims.ContentCaptureSessionCompat;
import androidx.compose.ui.platform.coreshims.ViewStructureCompat;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.util.ListUtilsKt;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import d0.b0;
import e0.u;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import org.jetbrains.annotations.NotNull;
import q0.l;

@StabilityInferred
/* loaded from: classes2.dex */
public final class AndroidContentCaptureManager implements ContentCaptureManager, DefaultLifecycleObserver, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final AndroidComposeView f14742a;

    /* renamed from: b, reason: collision with root package name */
    public final q0.a f14743b;

    /* renamed from: c, reason: collision with root package name */
    public ContentCaptureSessionCompat f14744c;
    public final MutableIntObjectMap d = new MutableIntObjectMap();

    /* renamed from: f, reason: collision with root package name */
    public final MutableIntSet f14745f = new MutableIntSet();

    /* renamed from: g, reason: collision with root package name */
    public final long f14746g = 100;

    /* renamed from: h, reason: collision with root package name */
    public TranslateStatus f14747h = TranslateStatus.f14758a;

    /* renamed from: i, reason: collision with root package name */
    public boolean f14748i = true;

    /* renamed from: j, reason: collision with root package name */
    public final ArraySet f14749j = new ArraySet(0);

    /* renamed from: k, reason: collision with root package name */
    public final d1.b f14750k = p0.a.a(1, 0, 6);

    /* renamed from: l, reason: collision with root package name */
    public final Handler f14751l = new Handler(Looper.getMainLooper());

    /* renamed from: m, reason: collision with root package name */
    public MutableIntObjectMap f14752m;

    /* renamed from: n, reason: collision with root package name */
    public long f14753n;

    /* renamed from: o, reason: collision with root package name */
    public final MutableIntObjectMap f14754o;

    /* renamed from: p, reason: collision with root package name */
    public SemanticsNodeCopy f14755p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f14756q;

    /* renamed from: r, reason: collision with root package name */
    public final androidx.compose.material.ripple.a f14757r;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes2.dex */
    public static final class TranslateStatus {

        /* renamed from: a, reason: collision with root package name */
        public static final TranslateStatus f14758a;

        /* renamed from: b, reason: collision with root package name */
        public static final TranslateStatus f14759b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ TranslateStatus[] f14760c;

        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.ui.contentcapture.AndroidContentCaptureManager$TranslateStatus, java.lang.Enum] */
        /* JADX WARN: Type inference failed for: r1v1, types: [androidx.compose.ui.contentcapture.AndroidContentCaptureManager$TranslateStatus, java.lang.Enum] */
        static {
            ?? r02 = new Enum("SHOW_ORIGINAL", 0);
            f14758a = r02;
            ?? r1 = new Enum("SHOW_TRANSLATED", 1);
            f14759b = r1;
            f14760c = new TranslateStatus[]{r02, r1};
        }

        public static TranslateStatus valueOf(String str) {
            return (TranslateStatus) Enum.valueOf(TranslateStatus.class, str);
        }

        public static TranslateStatus[] values() {
            return (TranslateStatus[]) f14760c.clone();
        }
    }

    @RequiresApi
    /* loaded from: classes2.dex */
    public static final class ViewTranslationHelperMethods {

        /* renamed from: a, reason: collision with root package name */
        public static final ViewTranslationHelperMethods f14761a = new Object();

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
        
            r3 = r3.getText();
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
        
            r3 = r3.getValue("android:text");
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static void a(androidx.compose.ui.contentcapture.AndroidContentCaptureManager r6, final android.util.LongSparseArray r7) {
            /*
                androidx.core.util.LongSparseArrayKt$keyIterator$1 r0 = new androidx.core.util.LongSparseArrayKt$keyIterator$1
                r0.<init>()
            L5:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L5a
                long r1 = r0.b()
                java.lang.Object r3 = r7.get(r1)
                android.view.translation.ViewTranslationResponse r3 = androidx.compose.ui.contentcapture.a.q(r3)
                if (r3 == 0) goto L5
                android.view.translation.TranslationResponseValue r3 = androidx.compose.ui.contentcapture.a.n(r3)
                if (r3 == 0) goto L5
                java.lang.CharSequence r3 = androidx.compose.ui.contentcapture.a.r(r3)
                if (r3 == 0) goto L5
                androidx.collection.IntObjectMap r4 = r6.b()
                int r1 = (int) r1
                java.lang.Object r1 = r4.c(r1)
                androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds r1 = (androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds) r1
                if (r1 == 0) goto L5
                androidx.compose.ui.semantics.SemanticsNode r1 = r1.f16596a
                if (r1 == 0) goto L5
                androidx.compose.ui.semantics.SemanticsPropertyKey r2 = androidx.compose.ui.semantics.SemanticsActions.f16800j
                androidx.compose.ui.semantics.SemanticsConfiguration r1 = r1.d
                java.lang.Object r1 = androidx.compose.ui.semantics.SemanticsConfigurationKt.a(r1, r2)
                androidx.compose.ui.semantics.AccessibilityAction r1 = (androidx.compose.ui.semantics.AccessibilityAction) r1
                if (r1 == 0) goto L5
                d0.c r1 = r1.f16773b
                q0.l r1 = (q0.l) r1
                if (r1 == 0) goto L5
                androidx.compose.ui.text.AnnotatedString r2 = new androidx.compose.ui.text.AnnotatedString
                java.lang.String r3 = r3.toString()
                r4 = 0
                r5 = 6
                r2.<init>(r3, r4, r5)
                java.lang.Object r1 = r1.invoke(r2)
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                goto L5
            L5a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.contentcapture.AndroidContentCaptureManager.ViewTranslationHelperMethods.a(androidx.compose.ui.contentcapture.AndroidContentCaptureManager, android.util.LongSparseArray):void");
        }

        @DoNotInline
        @RequiresApi
        public final void b(@NotNull AndroidContentCaptureManager androidContentCaptureManager, @NotNull long[] jArr, @NotNull int[] iArr, @NotNull Consumer<ViewTranslationRequest> consumer) {
            SemanticsNode semanticsNode;
            String a2;
            TranslationRequestValue forText;
            ViewTranslationRequest build;
            for (long j2 : jArr) {
                SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) androidContentCaptureManager.b().c((int) j2);
                if (semanticsNodeWithAdjustedBounds != null && (semanticsNode = semanticsNodeWithAdjustedBounds.f16596a) != null) {
                    a.s();
                    ViewTranslationRequest.Builder o2 = a.o(androidContentCaptureManager.f14742a.getAutofillId(), semanticsNode.f16823g);
                    List list = (List) SemanticsConfigurationKt.a(semanticsNode.d, SemanticsProperties.f16851v);
                    if (list != null && (a2 = ListUtilsKt.a(list, "\n", null, 62)) != null) {
                        forText = TranslationRequestValue.forText(new AnnotatedString(a2, null, 6));
                        o2.setValue("android:text", forText);
                        build = o2.build();
                        consumer.accept(build);
                    }
                }
            }
        }

        @DoNotInline
        @RequiresApi
        public final void c(@NotNull final AndroidContentCaptureManager androidContentCaptureManager, @NotNull final LongSparseArray<ViewTranslationResponse> longSparseArray) {
            if (Build.VERSION.SDK_INT < 31) {
                return;
            }
            if (p0.a.g(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                a(androidContentCaptureManager, longSparseArray);
            } else {
                androidContentCaptureManager.f14742a.post(new Runnable() { // from class: androidx.compose.ui.contentcapture.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        AndroidContentCaptureManager.ViewTranslationHelperMethods.a(AndroidContentCaptureManager.this, longSparseArray);
                    }
                });
            }
        }
    }

    public AndroidContentCaptureManager(AndroidComposeView androidComposeView, q0.a aVar) {
        this.f14742a = androidComposeView;
        this.f14743b = aVar;
        MutableIntObjectMap mutableIntObjectMap = IntObjectMapKt.f1442a;
        p0.a.q(mutableIntObjectMap, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f14752m = mutableIntObjectMap;
        this.f14754o = new MutableIntObjectMap();
        SemanticsNode a2 = androidComposeView.getSemanticsOwner().a();
        p0.a.q(mutableIntObjectMap, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f14755p = new SemanticsNodeCopy(a2, mutableIntObjectMap);
        this.f14757r = new androidx.compose.material.ripple.a(this, 1);
    }

    public static void j(AndroidContentCaptureManager androidContentCaptureManager, LongSparseArray longSparseArray) {
        ViewTranslationHelperMethods.f14761a.c(androidContentCaptureManager, longSparseArray);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063 A[Catch: all -> 0x002e, TryCatch #1 {all -> 0x002e, blocks: (B:12:0x002a, B:13:0x004e, B:17:0x005b, B:19:0x0063, B:21:0x006c, B:22:0x006f, B:24:0x0073, B:25:0x007c, B:34:0x003c), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x008d -> B:13:0x004e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(h0.g r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof androidx.compose.ui.contentcapture.AndroidContentCaptureManager$boundsUpdatesEventLoop$1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.ui.contentcapture.AndroidContentCaptureManager$boundsUpdatesEventLoop$1 r0 = (androidx.compose.ui.contentcapture.AndroidContentCaptureManager$boundsUpdatesEventLoop$1) r0
            int r1 = r0.f14765f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14765f = r1
            goto L18
        L13:
            androidx.compose.ui.contentcapture.AndroidContentCaptureManager$boundsUpdatesEventLoop$1 r0 = new androidx.compose.ui.contentcapture.AndroidContentCaptureManager$boundsUpdatesEventLoop$1
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f14764c
            i0.a r1 = i0.a.f30806a
            int r2 = r0.f14765f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            d1.a r2 = r0.f14763b
            androidx.compose.ui.contentcapture.AndroidContentCaptureManager r5 = r0.f14762a
            kotlin.jvm.internal.q.m(r9)     // Catch: java.lang.Throwable -> L2e
            goto L4e
        L2e:
            r9 = move-exception
            goto L9c
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L38:
            d1.a r2 = r0.f14763b
            androidx.compose.ui.contentcapture.AndroidContentCaptureManager r5 = r0.f14762a
            kotlin.jvm.internal.q.m(r9)     // Catch: java.lang.Throwable -> L2e
            goto L5b
        L40:
            kotlin.jvm.internal.q.m(r9)
            d1.b r9 = r8.f14750k     // Catch: java.lang.Throwable -> L9a
            r9.getClass()     // Catch: java.lang.Throwable -> L9a
            d1.a r2 = new d1.a     // Catch: java.lang.Throwable -> L9a
            r2.<init>(r9)     // Catch: java.lang.Throwable -> L9a
            r5 = r8
        L4e:
            r0.f14762a = r5     // Catch: java.lang.Throwable -> L2e
            r0.f14763b = r2     // Catch: java.lang.Throwable -> L2e
            r0.f14765f = r4     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r9 = r2.b(r0)     // Catch: java.lang.Throwable -> L2e
            if (r9 != r1) goto L5b
            return r1
        L5b:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L2e
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L2e
            if (r9 == 0) goto L90
            r2.c()     // Catch: java.lang.Throwable -> L2e
            boolean r9 = r5.d()     // Catch: java.lang.Throwable -> L2e
            if (r9 == 0) goto L6f
            r5.e()     // Catch: java.lang.Throwable -> L2e
        L6f:
            boolean r9 = r5.f14756q     // Catch: java.lang.Throwable -> L2e
            if (r9 != 0) goto L7c
            r5.f14756q = r4     // Catch: java.lang.Throwable -> L2e
            android.os.Handler r9 = r5.f14751l     // Catch: java.lang.Throwable -> L2e
            androidx.compose.material.ripple.a r6 = r5.f14757r     // Catch: java.lang.Throwable -> L2e
            r9.post(r6)     // Catch: java.lang.Throwable -> L2e
        L7c:
            androidx.collection.ArraySet r9 = r5.f14749j     // Catch: java.lang.Throwable -> L2e
            r9.clear()     // Catch: java.lang.Throwable -> L2e
            long r6 = r5.f14746g     // Catch: java.lang.Throwable -> L2e
            r0.f14762a = r5     // Catch: java.lang.Throwable -> L2e
            r0.f14763b = r2     // Catch: java.lang.Throwable -> L2e
            r0.f14765f = r3     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r9 = p0.a.L(r6, r0)     // Catch: java.lang.Throwable -> L2e
            if (r9 != r1) goto L4e
            return r1
        L90:
            androidx.collection.ArraySet r9 = r5.f14749j
            r9.clear()
            d0.b0 r9 = d0.b0.f30125a
            return r9
        L98:
            r5 = r8
            goto L9c
        L9a:
            r9 = move-exception
            goto L98
        L9c:
            androidx.collection.ArraySet r0 = r5.f14749j
            r0.clear()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.contentcapture.AndroidContentCaptureManager.a(h0.g):java.lang.Object");
    }

    public final IntObjectMap b() {
        if (this.f14748i) {
            this.f14748i = false;
            this.f14752m = SemanticsUtils_androidKt.a(this.f14742a.getSemanticsOwner());
            this.f14753n = System.currentTimeMillis();
        }
        return this.f14752m;
    }

    public final boolean d() {
        return this.f14744c != null;
    }

    public final void e() {
        ContentCaptureSessionCompat contentCaptureSessionCompat = this.f14744c;
        if (contentCaptureSessionCompat != null && Build.VERSION.SDK_INT >= 29) {
            MutableIntObjectMap mutableIntObjectMap = this.d;
            char c2 = 7;
            long j2 = -9187201950435737472L;
            if (mutableIntObjectMap.e != 0) {
                ArrayList arrayList = new ArrayList();
                Object[] objArr = mutableIntObjectMap.f1441c;
                long[] jArr = mutableIntObjectMap.f1439a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j3 = jArr[i2];
                        if ((((~j3) << 7) & j3 & j2) != j2) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((j3 & 255) < 128) {
                                    arrayList.add((ViewStructureCompat) objArr[(i2 << 3) + i4]);
                                }
                                j3 >>= 8;
                            }
                            if (i3 != 8) {
                                break;
                            }
                        }
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                        j2 = -9187201950435737472L;
                    }
                }
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i5 = 0; i5 < size; i5++) {
                    arrayList2.add(((ViewStructureCompat) arrayList.get(i5)).f16720a);
                }
                contentCaptureSessionCompat.d(arrayList2);
                mutableIntObjectMap.d();
            }
            MutableIntSet mutableIntSet = this.f14745f;
            if (mutableIntSet.d != 0) {
                ArrayList arrayList3 = new ArrayList();
                int[] iArr = mutableIntSet.f1444b;
                long[] jArr2 = mutableIntSet.f1443a;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i6 = 0;
                    while (true) {
                        long j4 = jArr2[i6];
                        if ((((~j4) << c2) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i7 = 8 - ((~(i6 - length2)) >>> 31);
                            for (int i8 = 0; i8 < i7; i8++) {
                                if ((j4 & 255) < 128) {
                                    arrayList3.add(Integer.valueOf(iArr[(i6 << 3) + i8]));
                                }
                                j4 >>= 8;
                            }
                            if (i7 != 8) {
                                break;
                            }
                        }
                        if (i6 == length2) {
                            break;
                        }
                        i6++;
                        c2 = 7;
                    }
                }
                ArrayList arrayList4 = new ArrayList(arrayList3.size());
                int size2 = arrayList3.size();
                for (int i9 = 0; i9 < size2; i9++) {
                    arrayList4.add(Long.valueOf(((Number) arrayList3.get(i9)).intValue()));
                }
                contentCaptureSessionCompat.e(u.a1(arrayList4));
                mutableIntSet.c();
            }
        }
    }

    public final void f() {
        q0.a aVar;
        this.f14747h = TranslateStatus.f14758a;
        IntObjectMap b2 = b();
        Object[] objArr = b2.f1441c;
        long[] jArr = b2.f1439a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j2 = jArr[i2];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j2) < 128) {
                        SemanticsConfiguration semanticsConfiguration = ((SemanticsNodeWithAdjustedBounds) objArr[(i2 << 3) + i4]).f16596a.d;
                        if (SemanticsConfigurationKt.a(semanticsConfiguration, SemanticsProperties.x) != null) {
                            Object obj = semanticsConfiguration.f16815a.get(SemanticsActions.f16802l);
                            if (obj == null) {
                                obj = null;
                            }
                            AccessibilityAction accessibilityAction = (AccessibilityAction) obj;
                            if (accessibilityAction != null && (aVar = (q0.a) accessibilityAction.f16773b) != null) {
                            }
                        }
                    }
                    j2 >>= 8;
                }
                if (i3 != 8) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }

    public final void g(long[] jArr, int[] iArr, Consumer consumer) {
        ViewTranslationHelperMethods.f14761a.b(this, jArr, iArr, consumer);
    }

    public final void h() {
        l lVar;
        this.f14747h = TranslateStatus.f14758a;
        IntObjectMap b2 = b();
        Object[] objArr = b2.f1441c;
        long[] jArr = b2.f1439a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j2 = jArr[i2];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j2) < 128) {
                        SemanticsConfiguration semanticsConfiguration = ((SemanticsNodeWithAdjustedBounds) objArr[(i2 << 3) + i4]).f16596a.d;
                        if (p0.a.g(SemanticsConfigurationKt.a(semanticsConfiguration, SemanticsProperties.x), Boolean.TRUE)) {
                            Object obj = semanticsConfiguration.f16815a.get(SemanticsActions.f16801k);
                            if (obj == null) {
                                obj = null;
                            }
                            AccessibilityAction accessibilityAction = (AccessibilityAction) obj;
                            if (accessibilityAction != null && (lVar = (l) accessibilityAction.f16773b) != null) {
                            }
                        }
                    }
                    j2 >>= 8;
                }
                if (i3 != 8) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }

    public final void i() {
        l lVar;
        this.f14747h = TranslateStatus.f14759b;
        IntObjectMap b2 = b();
        Object[] objArr = b2.f1441c;
        long[] jArr = b2.f1439a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j2 = jArr[i2];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j2) < 128) {
                        SemanticsConfiguration semanticsConfiguration = ((SemanticsNodeWithAdjustedBounds) objArr[(i2 << 3) + i4]).f16596a.d;
                        if (p0.a.g(SemanticsConfigurationKt.a(semanticsConfiguration, SemanticsProperties.x), Boolean.FALSE)) {
                            Object obj = semanticsConfiguration.f16815a.get(SemanticsActions.f16801k);
                            if (obj == null) {
                                obj = null;
                            }
                            AccessibilityAction accessibilityAction = (AccessibilityAction) obj;
                            if (accessibilityAction != null && (lVar = (l) accessibilityAction.f16773b) != null) {
                            }
                        }
                    }
                    j2 >>= 8;
                }
                if (i3 != 8) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }

    public final void k(SemanticsNode semanticsNode, SemanticsNodeCopy semanticsNodeCopy) {
        List h2 = SemanticsNode.h(semanticsNode, true, 4);
        int size = h2.size();
        for (int i2 = 0; i2 < size; i2++) {
            SemanticsNode semanticsNode2 = (SemanticsNode) h2.get(i2);
            if (b().a(semanticsNode2.f16823g) && !semanticsNodeCopy.f16595b.a(semanticsNode2.f16823g)) {
                m(semanticsNode2);
            }
        }
        MutableIntObjectMap mutableIntObjectMap = this.f14754o;
        int[] iArr = mutableIntObjectMap.f1440b;
        long[] jArr = mutableIntObjectMap.f1439a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j2 = jArr[i3];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j2) < 128) {
                            int i6 = iArr[(i3 << 3) + i5];
                            if (!b().a(i6)) {
                                MutableIntObjectMap mutableIntObjectMap2 = this.d;
                                if (mutableIntObjectMap2.b(i6)) {
                                    mutableIntObjectMap2.h(i6);
                                } else {
                                    this.f14745f.b(i6);
                                }
                            }
                        }
                        j2 >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        List h3 = SemanticsNode.h(semanticsNode, true, 4);
        int size2 = h3.size();
        for (int i7 = 0; i7 < size2; i7++) {
            SemanticsNode semanticsNode3 = (SemanticsNode) h3.get(i7);
            if (b().a(semanticsNode3.f16823g)) {
                int i8 = semanticsNode3.f16823g;
                if (mutableIntObjectMap.a(i8)) {
                    Object c2 = mutableIntObjectMap.c(i8);
                    if (c2 == null) {
                        InlineClassHelperKt.c("node not present in pruned tree before this change");
                        throw null;
                    }
                    k(semanticsNode3, (SemanticsNodeCopy) c2);
                } else {
                    continue;
                }
            }
        }
    }

    public final void l(SemanticsNode semanticsNode, SemanticsNodeCopy semanticsNodeCopy) {
        MutableIntSet mutableIntSet = new MutableIntSet();
        List h2 = SemanticsNode.h(semanticsNode, true, 4);
        int size = h2.size();
        int i2 = 0;
        while (true) {
            d1.b bVar = this.f14750k;
            b0 b0Var = b0.f30125a;
            ArraySet arraySet = this.f14749j;
            LayoutNode layoutNode = semanticsNode.f16821c;
            if (i2 >= size) {
                MutableIntSet mutableIntSet2 = semanticsNodeCopy.f16595b;
                int[] iArr = mutableIntSet2.f1444b;
                long[] jArr = mutableIntSet2.f1443a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j2 = jArr[i3];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8;
                            int i5 = 8 - ((~(i3 - length)) >>> 31);
                            for (int i6 = 0; i6 < i5; i6++) {
                                if ((j2 & 255) < 128) {
                                    if (!mutableIntSet.a(iArr[(i3 << 3) + i6])) {
                                        if (arraySet.add(layoutNode)) {
                                            bVar.b(b0Var);
                                            return;
                                        }
                                        return;
                                    }
                                    i4 = 8;
                                }
                                j2 >>= i4;
                            }
                            if (i5 != i4) {
                                break;
                            }
                        }
                        if (i3 == length) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
                List h3 = SemanticsNode.h(semanticsNode, true, 4);
                int size2 = h3.size();
                for (int i7 = 0; i7 < size2; i7++) {
                    SemanticsNode semanticsNode2 = (SemanticsNode) h3.get(i7);
                    if (b().a(semanticsNode2.f16823g)) {
                        Object c2 = this.f14754o.c(semanticsNode2.f16823g);
                        if (c2 == null) {
                            InlineClassHelperKt.c("node not present in pruned tree before this change");
                            throw null;
                        }
                        l(semanticsNode2, (SemanticsNodeCopy) c2);
                    }
                }
                return;
            }
            SemanticsNode semanticsNode3 = (SemanticsNode) h2.get(i2);
            if (b().a(semanticsNode3.f16823g)) {
                MutableIntSet mutableIntSet3 = semanticsNodeCopy.f16595b;
                int i8 = semanticsNode3.f16823g;
                if (!mutableIntSet3.a(i8)) {
                    if (arraySet.add(layoutNode)) {
                        bVar.b(b0Var);
                        return;
                    }
                    return;
                }
                mutableIntSet.b(i8);
            }
            i2++;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v50 android.view.autofill.AutofillId, still in use, count: 2, list:
          (r7v50 android.view.autofill.AutofillId) from 0x0091: IF  (r7v50 android.view.autofill.AutofillId) == (null android.view.autofill.AutofillId)  -> B:78:0x0186 A[HIDDEN]
          (r7v50 android.view.autofill.AutofillId) from 0x0097: PHI (r7v5 android.view.autofill.AutofillId) = (r7v4 android.view.autofill.AutofillId), (r7v50 android.view.autofill.AutofillId) binds: [B:77:0x0095, B:24:0x0091] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:114)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    /* JADX WARN: Multi-variable type inference failed */
    public final void m(androidx.compose.ui.semantics.SemanticsNode r21) {
        /*
            Method dump skipped, instructions count: 549
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.contentcapture.AndroidContentCaptureManager.m(androidx.compose.ui.semantics.SemanticsNode):void");
    }

    public final void n(SemanticsNode semanticsNode) {
        if (d()) {
            int i2 = semanticsNode.f16823g;
            MutableIntObjectMap mutableIntObjectMap = this.d;
            if (mutableIntObjectMap.b(i2)) {
                mutableIntObjectMap.h(i2);
            } else {
                this.f14745f.b(i2);
            }
            List h2 = SemanticsNode.h(semanticsNode, true, 4);
            int size = h2.size();
            for (int i3 = 0; i3 < size; i3++) {
                n((SemanticsNode) h2.get(i3));
            }
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(LifecycleOwner lifecycleOwner) {
        this.f14744c = (ContentCaptureSessionCompat) this.f14743b.invoke();
        m(this.f14742a.getSemanticsOwner().a());
        e();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner lifecycleOwner) {
        n(this.f14742a.getSemanticsOwner().a());
        e();
        this.f14744c = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f14751l.removeCallbacks(this.f14757r);
        this.f14744c = null;
    }
}
