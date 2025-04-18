package dg;

import com.plantcare.ai.identifier.plantid.ui.component.language.LanguageActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class b extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17034b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LanguageActivity f17035c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(LanguageActivity languageActivity, int i10) {
        super(1);
        this.f17034b = i10;
        this.f17035c = languageActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LanguageActivity languageActivity = this.f17035c;
        int i10 = this.f17034b;
        switch (i10) {
            case 0:
                switch (i10) {
                    case 0:
                        int i11 = LanguageActivity.f16634p;
                        languageActivity.J();
                        break;
                    default:
                        languageActivity.onBackPressed();
                        break;
                }
                return Unit.INSTANCE;
            default:
                switch (i10) {
                    case 0:
                        int i12 = LanguageActivity.f16634p;
                        languageActivity.J();
                        break;
                    default:
                        languageActivity.onBackPressed();
                        break;
                }
                return Unit.INSTANCE;
        }
    }
}
