package com.glority.android.picturexx.recognize.repository;

import com.glority.android.repository.BaseRepository;
import com.glority.component.generatedAPI.kotlinAPI.item.UpdateItemOriginalDetImageUrlMessage;
import com.glority.network.model.Resource;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NewRecognizeRepository.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0007¨\u0006\r"}, d2 = {"Lcom/glority/android/picturexx/recognize/repository/NewRecognizeRepository;", "Lcom/glority/android/repository/BaseRepository;", "<init>", "()V", "uploadItemOriginalImageMethod", "Lcom/glority/network/model/Resource;", "Lcom/glority/component/generatedAPI/kotlinAPI/item/UpdateItemOriginalDetImageUrlMessage;", "itemId", "", "imageUrl", "", "sha1", "Companion", "recognize_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class NewRecognizeRepository extends BaseRepository {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Lazy<NewRecognizeRepository> instance$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<NewRecognizeRepository>() { // from class: com.glority.android.picturexx.recognize.repository.NewRecognizeRepository$Companion$instance$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final NewRecognizeRepository invoke() {
            return new NewRecognizeRepository();
        }
    });

    /* compiled from: NewRecognizeRepository.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/glority/android/picturexx/recognize/repository/NewRecognizeRepository$Companion;", "", "<init>", "()V", "instance", "Lcom/glority/android/picturexx/recognize/repository/NewRecognizeRepository;", "getInstance", "()Lcom/glority/android/picturexx/recognize/repository/NewRecognizeRepository;", "instance$delegate", "Lkotlin/Lazy;", "recognize_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final NewRecognizeRepository getInstance() {
            return (NewRecognizeRepository) NewRecognizeRepository.instance$delegate.getValue();
        }
    }

    public final Resource<UpdateItemOriginalDetImageUrlMessage> uploadItemOriginalImageMethod(long itemId, String imageUrl, String sha1) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(sha1, "sha1");
        return BaseRepository.INSTANCE.getAppServer().sendMessageBlocking(new UpdateItemOriginalDetImageUrlMessage(itemId, imageUrl, sha1, null, null, null, null));
    }
}
