package com.applovin.mediation.adapters;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.Nullable;
import com.applovin.impl.mediation.MaxRewardImpl;
import com.applovin.impl.sdk.j;
import com.applovin.impl.sdk.n;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.sdk.AppLovinMediationProvider;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class MediationAdapterRouter {
    private static final Map<String, MediationAdapterRouter> sharedInstances = new HashMap();
    private static final Object sharedInstancesLock = new Object();
    private final Map<String, List<MediationAdapterRouterListenerWrapper>> listeners;
    private final Object listenersLock;
    private final Set<MaxAdapter> loadedAdapters;
    protected MaxAdapter.OnCompletionListener mOnCompletionListener;
    private j mSdk;
    private final String mTag;
    private final Set<MaxAdapter> showingAdapters;

    /* loaded from: classes3.dex */
    public final class MediationAdapterRouterListenerWrapper {
        private View mAdView;
        private final MaxAdapter mAdapter;
        private final MaxAdapterListener mListener;
        private final RouterAdLoadType mLoadType;

        public MediationAdapterRouterListenerWrapper(MaxAdapter maxAdapter, MaxAdapterListener maxAdapterListener, RouterAdLoadType routerAdLoadType, View view) {
            this.mAdapter = maxAdapter;
            this.mListener = maxAdapterListener;
            this.mLoadType = routerAdLoadType;
            this.mAdView = view;
        }

        public View getAdView() {
            return this.mAdView;
        }

        public MaxAdapter getAdapter() {
            return this.mAdapter;
        }

        public MaxAdapterListener getListener() {
            return this.mListener;
        }

        public RouterAdLoadType getLoadType() {
            return this.mLoadType;
        }

        public void setAdView(View view) {
            this.mAdView = view;
        }
    }

    /* loaded from: classes3.dex */
    public enum RouterAdLoadType {
        INTERSTITIAL,
        APPOPEN,
        REWARDED,
        ADVIEW
    }

    public MediationAdapterRouter() {
        String simpleName = getClass().getSimpleName();
        this.mTag = simpleName;
        this.listeners = new HashMap();
        this.listenersLock = new Object();
        this.loadedAdapters = Collections.synchronizedSet(new HashSet());
        this.showingAdapters = Collections.synchronizedSet(new HashSet());
        if (AppLovinMediationProvider.MAX.equalsIgnoreCase(j.f26635v0.O())) {
            this.mSdk = j.f26635v0;
        } else {
            n.h(simpleName, "Invalid mediation provider detected. Please set AppLovin SDK mediation provider to MAX via AppLovinSdk.getInstance(context).setMediationProvider( AppLovinMediationProvider.MAX )");
        }
    }

    private void addAdapter(MaxAdapter maxAdapter, MaxAdapterListener maxAdapterListener, String str, RouterAdLoadType routerAdLoadType, View view) {
        synchronized (this.listenersLock) {
            try {
                MediationAdapterRouterListenerWrapper mediationAdapterRouterListenerWrapper = new MediationAdapterRouterListenerWrapper(maxAdapter, maxAdapterListener, routerAdLoadType, view);
                List<MediationAdapterRouterListenerWrapper> arrayList = this.listeners.get(str) != null ? this.listeners.get(str) : new ArrayList<>(1);
                arrayList.add(mediationAdapterRouterListenerWrapper);
                this.listeners.put(str, arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private List<MediationAdapterRouterListenerWrapper> getListenerWrappers(String str) {
        if (this.listeners.containsKey(str)) {
            return new ArrayList(this.listeners.get(str));
        }
        return null;
    }

    private List<MediationAdapterRouterListenerWrapper> getLoadingListenerWrappers(String str) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.listenersLock) {
            try {
                List<MediationAdapterRouterListenerWrapper> listenerWrappers = getListenerWrappers(str);
                if (listenerWrappers == null || listenerWrappers.size() <= 0) {
                    return null;
                }
                for (MediationAdapterRouterListenerWrapper mediationAdapterRouterListenerWrapper : listenerWrappers) {
                    if (!isAdLoaded(mediationAdapterRouterListenerWrapper.getAdapter())) {
                        arrayList.add(mediationAdapterRouterListenerWrapper);
                    }
                }
                return arrayList;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static MediationAdapterRouter getSharedInstance(Class cls) {
        MediationAdapterRouter mediationAdapterRouter;
        synchronized (sharedInstancesLock) {
            try {
                String name = cls.getName();
                mediationAdapterRouter = sharedInstances.get(name);
                if (mediationAdapterRouter == null) {
                    try {
                        Constructor declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
                        declaredConstructor.setAccessible(true);
                        mediationAdapterRouter = (MediationAdapterRouter) declaredConstructor.newInstance(new Object[0]);
                    } catch (Throwable unused) {
                    }
                    sharedInstances.put(name, mediationAdapterRouter);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediationAdapterRouter;
    }

    private List<MediationAdapterRouterListenerWrapper> getShowingListenerWrappers(String str) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.listenersLock) {
            try {
                List<MediationAdapterRouterListenerWrapper> listenerWrappers = getListenerWrappers(str);
                if (listenerWrappers == null || listenerWrappers.size() <= 0) {
                    return null;
                }
                for (MediationAdapterRouterListenerWrapper mediationAdapterRouterListenerWrapper : listenerWrappers) {
                    if (isAdShowing(mediationAdapterRouterListenerWrapper.getAdapter())) {
                        arrayList.add(mediationAdapterRouterListenerWrapper);
                    }
                }
                return arrayList;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private boolean isAdLoaded(MaxAdapter maxAdapter) {
        return this.loadedAdapters.contains(maxAdapter);
    }

    private boolean isAdShowing(MaxAdapter maxAdapter) {
        return this.showingAdapters.contains(maxAdapter);
    }

    public void addAdViewAdapter(MaxAdapter maxAdapter, MaxAdViewAdapterListener maxAdViewAdapterListener, String str, View view) {
        addAdapter(maxAdapter, maxAdViewAdapterListener, str, RouterAdLoadType.ADVIEW, view);
    }

    public void addAppOpenAdapter(MaxAdapter maxAdapter, MaxAppOpenAdapterListener maxAppOpenAdapterListener, String str) {
        addAdapter(maxAdapter, maxAppOpenAdapterListener, str, RouterAdLoadType.APPOPEN, null);
    }

    public void addInterstitialAdapter(MaxAdapter maxAdapter, MaxInterstitialAdapterListener maxInterstitialAdapterListener, String str) {
        addAdapter(maxAdapter, maxInterstitialAdapterListener, str, RouterAdLoadType.INTERSTITIAL, null);
    }

    public void addRewardedAdapter(MaxAdapter maxAdapter, MaxRewardedAdapterListener maxRewardedAdapterListener, String str) {
        addAdapter(maxAdapter, maxRewardedAdapterListener, str, RouterAdLoadType.REWARDED, null);
    }

    public void addShowingAdapter(MaxAdapter maxAdapter) {
        this.showingAdapters.add(maxAdapter);
    }

    public MaxReward getReward(String str) {
        synchronized (this.listenersLock) {
            try {
                List<MediationAdapterRouterListenerWrapper> listenerWrappers = getListenerWrappers(str);
                if (listenerWrappers != null && listenerWrappers.size() > 0) {
                    MaxAdapter adapter = listenerWrappers.get(0).getAdapter();
                    if (adapter instanceof MediationAdapterBase) {
                        return ((MediationAdapterBase) adapter).getReward();
                    }
                }
                return MaxRewardImpl.createDefault();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void initialize(MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity, MaxAdapter.OnCompletionListener onCompletionListener);

    public void log(String str) {
        j jVar = this.mSdk;
        if (jVar != null) {
            jVar.J();
            if (n.a()) {
                this.mSdk.J().d(this.mTag, str);
            }
        }
    }

    public void onAdClicked(String str) {
        List<MediationAdapterRouterListenerWrapper> showingListenerWrappers = getShowingListenerWrappers(str);
        if (showingListenerWrappers == null || showingListenerWrappers.size() <= 0) {
            return;
        }
        for (MediationAdapterRouterListenerWrapper mediationAdapterRouterListenerWrapper : showingListenerWrappers) {
            RouterAdLoadType loadType = mediationAdapterRouterListenerWrapper.getLoadType();
            MaxAdapterListener listener = mediationAdapterRouterListenerWrapper.getListener();
            if (loadType == RouterAdLoadType.INTERSTITIAL) {
                log("Interstitial clicked");
                ((MaxInterstitialAdapterListener) listener).onInterstitialAdClicked();
            } else if (loadType == RouterAdLoadType.APPOPEN) {
                log("App open clicked");
                ((MaxAppOpenAdapterListener) listener).onAppOpenAdClicked();
            } else if (loadType == RouterAdLoadType.REWARDED) {
                log("Rewarded clicked");
                ((MaxRewardedAdapterListener) listener).onRewardedAdClicked();
            } else if (loadType == RouterAdLoadType.ADVIEW) {
                log("AdView clicked");
                ((MaxAdViewAdapterListener) listener).onAdViewAdClicked();
            }
        }
    }

    public void onAdDisplayFailed(String str, MaxAdapterError maxAdapterError) {
        List<MediationAdapterRouterListenerWrapper> showingListenerWrappers = getShowingListenerWrappers(str);
        if (showingListenerWrappers == null || showingListenerWrappers.size() <= 0) {
            return;
        }
        for (MediationAdapterRouterListenerWrapper mediationAdapterRouterListenerWrapper : showingListenerWrappers) {
            RouterAdLoadType loadType = mediationAdapterRouterListenerWrapper.getLoadType();
            MaxAdapterListener listener = mediationAdapterRouterListenerWrapper.getListener();
            if (loadType == RouterAdLoadType.INTERSTITIAL) {
                log("Interstitial failed to display with error: " + maxAdapterError.toString());
                ((MaxInterstitialAdapterListener) listener).onInterstitialAdDisplayFailed(maxAdapterError);
            } else if (loadType == RouterAdLoadType.APPOPEN) {
                log("App open failed to display with error: " + maxAdapterError.toString());
                ((MaxAppOpenAdapterListener) listener).onAppOpenAdDisplayFailed(maxAdapterError);
            } else if (loadType == RouterAdLoadType.REWARDED) {
                log("Rewarded failed to display with error: " + maxAdapterError.toString());
                ((MaxRewardedAdapterListener) listener).onRewardedAdDisplayFailed(maxAdapterError);
            } else if (loadType == RouterAdLoadType.ADVIEW) {
                log("AdView failed to display with error: " + maxAdapterError.toString());
                ((MaxAdViewAdapterListener) listener).onAdViewAdDisplayFailed(maxAdapterError);
            }
        }
    }

    public void onAdDisplayed(String str) {
        onAdDisplayed(str, null);
    }

    public void onAdHidden(String str) {
        List<MediationAdapterRouterListenerWrapper> showingListenerWrappers = getShowingListenerWrappers(str);
        if (showingListenerWrappers == null || showingListenerWrappers.size() <= 0) {
            return;
        }
        for (MediationAdapterRouterListenerWrapper mediationAdapterRouterListenerWrapper : showingListenerWrappers) {
            RouterAdLoadType loadType = mediationAdapterRouterListenerWrapper.getLoadType();
            MaxAdapterListener listener = mediationAdapterRouterListenerWrapper.getListener();
            if (loadType == RouterAdLoadType.INTERSTITIAL) {
                log("Interstitial hidden");
                ((MaxInterstitialAdapterListener) listener).onInterstitialAdHidden();
            } else if (loadType == RouterAdLoadType.APPOPEN) {
                log("App open hidden");
                ((MaxAppOpenAdapterListener) listener).onAppOpenAdHidden();
            } else if (loadType == RouterAdLoadType.REWARDED) {
                log("Rewarded hidden");
                ((MaxRewardedAdapterListener) listener).onRewardedAdHidden();
            } else if (loadType == RouterAdLoadType.ADVIEW) {
                log("AdView hidden");
                ((MaxAdViewAdapterListener) listener).onAdViewAdHidden();
            }
        }
    }

    public void onAdLoadFailed(String str, MaxAdapterError maxAdapterError) {
        List<MediationAdapterRouterListenerWrapper> loadingListenerWrappers = getLoadingListenerWrappers(str);
        if (loadingListenerWrappers == null || loadingListenerWrappers.size() <= 0) {
            return;
        }
        for (MediationAdapterRouterListenerWrapper mediationAdapterRouterListenerWrapper : loadingListenerWrappers) {
            RouterAdLoadType loadType = mediationAdapterRouterListenerWrapper.getLoadType();
            MaxAdapterListener listener = mediationAdapterRouterListenerWrapper.getListener();
            if (loadType == RouterAdLoadType.INTERSTITIAL) {
                log("Interstitial failed to load with error: " + maxAdapterError.toString());
                ((MaxInterstitialAdapterListener) listener).onInterstitialAdLoadFailed(maxAdapterError);
            } else if (loadType == RouterAdLoadType.APPOPEN) {
                log("App open failed to load with error: " + maxAdapterError.toString());
                ((MaxAppOpenAdapterListener) listener).onAppOpenAdLoadFailed(maxAdapterError);
            } else if (loadType == RouterAdLoadType.REWARDED) {
                log("Rewarded failed to load with error: " + maxAdapterError.toString());
                ((MaxRewardedAdapterListener) listener).onRewardedAdLoadFailed(maxAdapterError);
            } else if (loadType == RouterAdLoadType.ADVIEW) {
                log("AdView failed to load with error: " + maxAdapterError.toString());
                ((MaxAdViewAdapterListener) listener).onAdViewAdLoadFailed(maxAdapterError);
            }
        }
    }

    public void onAdLoaded(String str) {
        onAdLoaded(str, null);
    }

    public void onAdViewAdCollapsed(String str) {
        List<MediationAdapterRouterListenerWrapper> showingListenerWrappers = getShowingListenerWrappers(str);
        if (showingListenerWrappers == null || showingListenerWrappers.size() <= 0) {
            return;
        }
        for (MediationAdapterRouterListenerWrapper mediationAdapterRouterListenerWrapper : showingListenerWrappers) {
            RouterAdLoadType loadType = mediationAdapterRouterListenerWrapper.getLoadType();
            MaxAdapterListener listener = mediationAdapterRouterListenerWrapper.getListener();
            if (loadType == RouterAdLoadType.ADVIEW) {
                log("AdView collapsed");
                ((MaxAdViewAdapterListener) listener).onAdViewAdCollapsed();
            }
        }
    }

    public void onAdViewAdExpanded(String str) {
        List<MediationAdapterRouterListenerWrapper> showingListenerWrappers = getShowingListenerWrappers(str);
        if (showingListenerWrappers == null || showingListenerWrappers.size() <= 0) {
            return;
        }
        for (MediationAdapterRouterListenerWrapper mediationAdapterRouterListenerWrapper : showingListenerWrappers) {
            RouterAdLoadType loadType = mediationAdapterRouterListenerWrapper.getLoadType();
            MaxAdapterListener listener = mediationAdapterRouterListenerWrapper.getListener();
            if (loadType == RouterAdLoadType.ADVIEW) {
                log("AdView expanded");
                ((MaxAdViewAdapterListener) listener).onAdViewAdExpanded();
            }
        }
    }

    public void onUserRewarded(String str, MaxReward maxReward) {
        List<MediationAdapterRouterListenerWrapper> showingListenerWrappers = getShowingListenerWrappers(str);
        if (showingListenerWrappers == null || showingListenerWrappers.size() <= 0) {
            return;
        }
        for (MediationAdapterRouterListenerWrapper mediationAdapterRouterListenerWrapper : showingListenerWrappers) {
            RouterAdLoadType loadType = mediationAdapterRouterListenerWrapper.getLoadType();
            MaxAdapterListener listener = mediationAdapterRouterListenerWrapper.getListener();
            if (loadType == RouterAdLoadType.REWARDED) {
                log("Rewarded user with reward: " + maxReward);
                ((MaxRewardedAdapterListener) listener).onUserRewarded(maxReward);
            }
        }
    }

    public void removeAdapter(MaxAdapter maxAdapter, String str) {
        MediationAdapterRouterListenerWrapper mediationAdapterRouterListenerWrapper;
        this.loadedAdapters.remove(maxAdapter);
        this.showingAdapters.remove(maxAdapter);
        synchronized (this.listenersLock) {
            try {
                List<MediationAdapterRouterListenerWrapper> list = this.listeners.get(str);
                if (list != null && list.size() > 0) {
                    Iterator<MediationAdapterRouterListenerWrapper> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            mediationAdapterRouterListenerWrapper = null;
                            break;
                        } else {
                            mediationAdapterRouterListenerWrapper = it.next();
                            if (mediationAdapterRouterListenerWrapper.getAdapter() == maxAdapter) {
                            }
                        }
                    }
                    if (mediationAdapterRouterListenerWrapper != null) {
                        list.remove(mediationAdapterRouterListenerWrapper);
                    }
                }
            } finally {
            }
        }
    }

    public boolean shouldAlwaysRewardUser(String str) {
        synchronized (this.listenersLock) {
            try {
                List<MediationAdapterRouterListenerWrapper> listenerWrappers = getListenerWrappers(str);
                if (listenerWrappers != null && listenerWrappers.size() > 0) {
                    MaxAdapter adapter = listenerWrappers.get(0).getAdapter();
                    if (adapter instanceof MediationAdapterBase) {
                        return ((MediationAdapterBase) adapter).shouldAlwaysRewardUser();
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void updateAdView(View view, String str) {
        synchronized (this.listenersLock) {
            try {
                List<MediationAdapterRouterListenerWrapper> listenerWrappers = getListenerWrappers(str);
                if (listenerWrappers != null && listenerWrappers.size() > 0) {
                    Iterator<MediationAdapterRouterListenerWrapper> it = listenerWrappers.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        MediationAdapterRouterListenerWrapper next = it.next();
                        if (next.getAdView() == null) {
                            next.setAdView(view);
                            break;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void log(String str, Throwable th) {
        j jVar = this.mSdk;
        if (jVar != null) {
            jVar.J();
            if (n.a()) {
                this.mSdk.J().a(this.mTag, str, th);
            }
        }
    }

    public void onAdDisplayed(String str, @Nullable Bundle bundle) {
        List<MediationAdapterRouterListenerWrapper> showingListenerWrappers = getShowingListenerWrappers(str);
        if (showingListenerWrappers == null || showingListenerWrappers.size() <= 0) {
            return;
        }
        for (MediationAdapterRouterListenerWrapper mediationAdapterRouterListenerWrapper : showingListenerWrappers) {
            RouterAdLoadType loadType = mediationAdapterRouterListenerWrapper.getLoadType();
            MaxAdapterListener listener = mediationAdapterRouterListenerWrapper.getListener();
            if (loadType == RouterAdLoadType.INTERSTITIAL) {
                log("Interstitial shown");
                ((MaxInterstitialAdapterListener) listener).onInterstitialAdDisplayed(bundle);
            } else if (loadType == RouterAdLoadType.APPOPEN) {
                log("App open shown");
                ((MaxAppOpenAdapterListener) listener).onAppOpenAdDisplayed(bundle);
            } else if (loadType == RouterAdLoadType.REWARDED) {
                log("Rewarded shown");
                ((MaxRewardedAdapterListener) listener).onRewardedAdDisplayed(bundle);
            } else if (loadType == RouterAdLoadType.ADVIEW) {
                log("AdView shown");
                ((MaxAdViewAdapterListener) listener).onAdViewAdDisplayed(bundle);
            }
        }
    }

    public void onAdLoaded(String str, @Nullable Bundle bundle) {
        List<MediationAdapterRouterListenerWrapper> loadingListenerWrappers = getLoadingListenerWrappers(str);
        if (loadingListenerWrappers == null || loadingListenerWrappers.size() <= 0) {
            return;
        }
        for (MediationAdapterRouterListenerWrapper mediationAdapterRouterListenerWrapper : loadingListenerWrappers) {
            this.loadedAdapters.add(mediationAdapterRouterListenerWrapper.getAdapter());
            RouterAdLoadType loadType = mediationAdapterRouterListenerWrapper.getLoadType();
            MaxAdapterListener listener = mediationAdapterRouterListenerWrapper.getListener();
            if (loadType == RouterAdLoadType.INTERSTITIAL) {
                log("Interstitial loaded");
                ((MaxInterstitialAdapterListener) listener).onInterstitialAdLoaded(bundle);
            } else if (loadType == RouterAdLoadType.APPOPEN) {
                log("App open loaded");
                ((MaxAppOpenAdapterListener) listener).onAppOpenAdLoaded(bundle);
            } else if (loadType == RouterAdLoadType.REWARDED) {
                log("Rewarded loaded");
                ((MaxRewardedAdapterListener) listener).onRewardedAdLoaded(bundle);
            } else if (loadType == RouterAdLoadType.ADVIEW) {
                log("AdView loaded");
                ((MaxAdViewAdapterListener) listener).onAdViewAdLoaded(mediationAdapterRouterListenerWrapper.getAdView(), bundle);
            }
        }
    }
}
