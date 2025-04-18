package ng;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.plantcare.ai.identifier.plantid.R;
import com.plantcare.ai.identifier.plantid.domains.ImageDomain;
import com.plantcare.ai.identifier.plantid.ui.component.plan_identifier.camera.PlantIdentifierActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class e extends Lambda implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22769b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PlantIdentifierActivity f22770c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(PlantIdentifierActivity plantIdentifierActivity, int i10) {
        super(2);
        this.f22769b = i10;
        this.f22770c = plantIdentifierActivity;
    }

    public final void a(ImageDomain imageDomain) {
        int i10 = this.f22769b;
        Unit unit = null;
        PlantIdentifierActivity plantIdentifierActivity = this.f22770c;
        switch (i10) {
            case 0:
                Intrinsics.checkNotNullParameter(imageDomain, "imageDomain");
                String path = imageDomain.getPath();
                Bitmap bitmap = PlantIdentifierActivity.f16673q;
                plantIdentifierActivity.getClass();
                Bitmap decodeFile = BitmapFactory.decodeFile(path);
                if (decodeFile != null) {
                    PlantIdentifierActivity.f16673q = decodeFile;
                    PlantIdentifierActivity.I(plantIdentifierActivity);
                    unit = Unit.INSTANCE;
                }
                if (unit == null) {
                    com.bumptech.glide.d.E(plantIdentifierActivity, R.string.some_thing_went_wrong);
                    return;
                }
                return;
            default:
                Intrinsics.checkNotNullParameter(imageDomain, "imageDomain");
                String path2 = imageDomain.getPath();
                Bitmap bitmap2 = PlantIdentifierActivity.f16673q;
                plantIdentifierActivity.getClass();
                Bitmap decodeFile2 = BitmapFactory.decodeFile(path2);
                if (decodeFile2 != null) {
                    PlantIdentifierActivity.f16673q = decodeFile2;
                    PlantIdentifierActivity.I(plantIdentifierActivity);
                    unit = Unit.INSTANCE;
                }
                if (unit == null) {
                    com.bumptech.glide.d.E(plantIdentifierActivity, R.string.some_thing_went_wrong);
                    return;
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f22769b) {
            case 0:
                ((Number) obj2).intValue();
                a((ImageDomain) obj);
                return Unit.INSTANCE;
            default:
                ((Number) obj2).intValue();
                a((ImageDomain) obj);
                return Unit.INSTANCE;
        }
    }
}
