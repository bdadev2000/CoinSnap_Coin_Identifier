package og;

import a4.s;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.plantcare.ai.identifier.plantid.ui.component.main.MainActivity;
import com.plantcare.ai.identifier.plantid.ui.component.plan_identifier.camera.PlantIdentifierActivity;
import com.plantcare.ai.identifier.plantid.ui.component.plan_identifier.preview.PreviewIdentifyActivity;
import com.plantcare.ai.identifier.plantid.ui.component.plan_identifier.preview.PreviewModel;
import eb.j;
import java.io.ByteArrayOutputStream;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import wh.a0;
import wh.c0;
import wh.g0;
import wh.i0;
import wh.j0;
import wh.q0;
import wh.r0;
import wh.s0;

/* loaded from: classes4.dex */
public final class b extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23319b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PreviewIdentifyActivity f23320c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(PreviewIdentifyActivity previewIdentifyActivity, int i10) {
        super(1);
        this.f23319b = i10;
        this.f23320c = previewIdentifyActivity;
    }

    public final void a(View view) {
        String secretKey;
        Job launch$default;
        int i10 = this.f23319b;
        PreviewIdentifyActivity previewIdentifyActivity = this.f23320c;
        switch (i10) {
            case 1:
                if (com.bumptech.glide.d.q(previewIdentifyActivity)) {
                    int i11 = PreviewIdentifyActivity.f16681n;
                    if (PlantIdentifierActivity.f16673q != null) {
                        if (com.bumptech.glide.d.q(previewIdentifyActivity)) {
                            Bitmap bitmap = PlantIdentifierActivity.f16673q;
                            Intrinsics.checkNotNull(bitmap);
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            r0 r0Var = s0.Companion;
                            Intrinsics.checkNotNull(byteArray);
                            Pattern pattern = g0.f27059d;
                            q0 body = r0.d(r0Var, byteArray, a0.E("image/jpeg"), 0, 6);
                            Intrinsics.checkNotNullParameter("image", "name");
                            Intrinsics.checkNotNullParameter(body, "body");
                            StringBuilder m10 = j.m("form-data; name=");
                            g0 g0Var = j0.f27080e;
                            c0.b(m10, "image");
                            m10.append("; filename=");
                            c0.b(m10, "uploaded_image.jpg");
                            String value = m10.toString();
                            Intrinsics.checkNotNullExpressionValue(value, "StringBuilder().apply(builderAction).toString()");
                            s sVar = new s();
                            Intrinsics.checkNotNullParameter("Content-Disposition", "name");
                            Intrinsics.checkNotNullParameter(value, "value");
                            qc.s0.e("Content-Disposition");
                            sVar.c("Content-Disposition", value);
                            i0 image = a0.l(sVar.d(), body);
                            PreviewModel I = previewIdentifyActivity.I();
                            String packageName = previewIdentifyActivity.getPackageName();
                            Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
                            String string = previewIdentifyActivity.o().getString("KEY_SECRET_KEY", "");
                            if (string == null) {
                                secretKey = "";
                            } else {
                                secretKey = string;
                            }
                            I.getClass();
                            Intrinsics.checkNotNullParameter(packageName, "packageName");
                            Intrinsics.checkNotNullParameter("115", "versionCode");
                            Intrinsics.checkNotNullParameter("yo6d9b8wb9186369um2ky4aea39", "internalKey");
                            Intrinsics.checkNotNullParameter(secretKey, "secretKey");
                            Intrinsics.checkNotNullParameter(image, "image");
                            launch$default = BuildersKt__Builders_commonKt.launch$default(I.f22242c, null, null, new g(I, packageName, "115", "yo6d9b8wb9186369um2ky4aea39", secretKey, image, null), 3, null);
                            previewIdentifyActivity.f16684l = launch$default;
                            return;
                        }
                        sf.g gVar = previewIdentifyActivity.f16683k;
                        if (gVar != null) {
                            gVar.show();
                            Unit unit = Unit.INSTANCE;
                            return;
                        }
                        return;
                    }
                    return;
                }
                sf.g gVar2 = previewIdentifyActivity.f16683k;
                if (gVar2 != null) {
                    gVar2.show();
                    return;
                }
                return;
            case 2:
                ((kf.g0) previewIdentifyActivity.n()).u.performClick();
                return;
            case 3:
                previewIdentifyActivity.finish();
                return;
            default:
                previewIdentifyActivity.startActivity(new Intent(previewIdentifyActivity, (Class<?>) MainActivity.class));
                previewIdentifyActivity.finishAffinity();
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f23319b) {
            case 0:
                Boolean bool = (Boolean) obj;
                Intrinsics.checkNotNull(bool);
                boolean booleanValue = bool.booleanValue();
                PreviewIdentifyActivity previewIdentifyActivity = this.f23320c;
                if (booleanValue) {
                    LinearLayout layoutLoading = ((kf.g0) previewIdentifyActivity.n()).f20766z;
                    Intrinsics.checkNotNullExpressionValue(layoutLoading, "layoutLoading");
                    com.bumptech.glide.e.V(layoutLoading);
                    LinearLayout btnPlantIdentifier = ((kf.g0) previewIdentifyActivity.n()).f20762v;
                    Intrinsics.checkNotNullExpressionValue(btnPlantIdentifier, "btnPlantIdentifier");
                    com.bumptech.glide.e.E(btnPlantIdentifier);
                    ImageView scanLine = ((kf.g0) previewIdentifyActivity.n()).B;
                    Intrinsics.checkNotNullExpressionValue(scanLine, "scanLine");
                    com.bumptech.glide.e.V(scanLine);
                    ImageView icBack = ((kf.g0) previewIdentifyActivity.n()).f20764x;
                    Intrinsics.checkNotNullExpressionValue(icBack, "icBack");
                    com.bumptech.glide.e.D(icBack);
                    ObjectAnimator objectAnimator = previewIdentifyActivity.f16685m;
                    if (objectAnimator != null) {
                        objectAnimator.start();
                    }
                } else {
                    LinearLayout layoutLoading2 = ((kf.g0) previewIdentifyActivity.n()).f20766z;
                    Intrinsics.checkNotNullExpressionValue(layoutLoading2, "layoutLoading");
                    com.bumptech.glide.e.E(layoutLoading2);
                    LinearLayout btnPlantIdentifier2 = ((kf.g0) previewIdentifyActivity.n()).f20762v;
                    Intrinsics.checkNotNullExpressionValue(btnPlantIdentifier2, "btnPlantIdentifier");
                    com.bumptech.glide.e.V(btnPlantIdentifier2);
                    ImageView scanLine2 = ((kf.g0) previewIdentifyActivity.n()).B;
                    Intrinsics.checkNotNullExpressionValue(scanLine2, "scanLine");
                    com.bumptech.glide.e.E(scanLine2);
                    ImageView icBack2 = ((kf.g0) previewIdentifyActivity.n()).f20764x;
                    Intrinsics.checkNotNullExpressionValue(icBack2, "icBack");
                    com.bumptech.glide.e.V(icBack2);
                    ObjectAnimator objectAnimator2 = previewIdentifyActivity.f16685m;
                    if (objectAnimator2 != null) {
                        objectAnimator2.cancel();
                    }
                }
                return Unit.INSTANCE;
            case 1:
                a((View) obj);
                return Unit.INSTANCE;
            case 2:
                a((View) obj);
                return Unit.INSTANCE;
            case 3:
                a((View) obj);
                return Unit.INSTANCE;
            default:
                a((View) obj);
                return Unit.INSTANCE;
        }
    }
}
