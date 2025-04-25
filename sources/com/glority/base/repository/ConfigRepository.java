package com.glority.base.repository;

import androidx.lifecycle.LiveData;
import com.glority.android.repository.BaseRepository;
import com.glority.base.viewmodel.AppViewModel;
import com.glority.component.generatedAPI.kotlinAPI.user.GetConfigMessage;
import com.glority.network.model.Resource;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: ConfigRepository.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005H\u0007J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¨\u0006\n"}, d2 = {"Lcom/glority/base/repository/ConfigRepository;", "Lcom/glority/android/repository/BaseRepository;", "<init>", "()V", "getClientConfigMethod", "Landroidx/lifecycle/LiveData;", "Lcom/glority/network/model/Resource;", "Lcom/glority/component/generatedAPI/kotlinAPI/user/GetConfigMessage;", "getClientConfigMethodBlocking", "Companion", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class ConfigRepository extends BaseRepository {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Lazy<ConfigRepository> instance$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<ConfigRepository>() { // from class: com.glority.base.repository.ConfigRepository$Companion$instance$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final ConfigRepository invoke() {
            return new ConfigRepository();
        }
    });

    /* compiled from: ConfigRepository.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/glority/base/repository/ConfigRepository$Companion;", "", "<init>", "()V", "instance", "Lcom/glority/base/repository/ConfigRepository;", "getInstance", "()Lcom/glority/base/repository/ConfigRepository;", "instance$delegate", "Lkotlin/Lazy;", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ConfigRepository getInstance() {
            return (ConfigRepository) ConfigRepository.instance$delegate.getValue();
        }
    }

    public final LiveData<Resource<GetConfigMessage>> getClientConfigMethod() {
        return BaseRepository.INSTANCE.getAppServer().sendMessage(new GetConfigMessage(AppViewModel.INSTANCE.getInstance().getLanguageCode(), AppViewModel.INSTANCE.getInstance().getCountryCode()));
    }

    public final Resource<GetConfigMessage> getClientConfigMethodBlocking() {
        return BaseRepository.INSTANCE.getAppServer().sendMessageBlocking(new GetConfigMessage(AppViewModel.INSTANCE.getInstance().getLanguageCode(), AppViewModel.INSTANCE.getInstance().getCountryCode()));
    }
}
