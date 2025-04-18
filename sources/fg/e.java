package fg;

import android.content.SharedPreferences;
import android.widget.TextView;
import com.plantcare.ai.identifier.plantid.R;
import com.plantcare.ai.identifier.plantid.data.network.dto.res.ResponseWeatherDto;
import com.plantcare.ai.identifier.plantid.domains.WeatherDomain;
import com.plantcare.ai.identifier.plantid.ui.component.main.MainActivity;
import java.util.Iterator;
import kf.u;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import v8.u0;

/* loaded from: classes4.dex */
public final class e extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainActivity f17867b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(MainActivity mainActivity) {
        super(1);
        this.f17867b = mainActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object obj2;
        Object obj3;
        Object obj4;
        boolean areEqual;
        boolean areEqual2;
        boolean areEqual3;
        boolean areEqual4;
        boolean areEqual5;
        boolean areEqual6;
        boolean areEqual7;
        boolean areEqual8;
        boolean areEqual9;
        boolean areEqual10;
        boolean areEqual11;
        boolean areEqual12;
        boolean areEqual13;
        boolean areEqual14;
        boolean areEqual15;
        boolean areEqual16;
        boolean areEqual17;
        boolean areEqual18;
        boolean areEqual19;
        boolean areEqual20;
        boolean areEqual21;
        boolean areEqual22;
        int i10;
        ResponseWeatherDto responseWeatherDto = (ResponseWeatherDto) obj;
        MainActivity mainActivity = this.f17867b;
        if (responseWeatherDto != null) {
            int i11 = MainActivity.f16644q;
            Iterator it = mainActivity.L().f16654f.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj2 = it.next();
                    if (Intrinsics.areEqual(((WeatherDomain) obj2).getKey(), responseWeatherDto.getData().getCurrent().getConditionCode())) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            WeatherDomain weatherDomain = (WeatherDomain) obj2;
            if (weatherDomain != null) {
                String string = mainActivity.getString(weatherDomain.getValue());
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                TextView tvTapToEnable = ((u) mainActivity.n()).E;
                Intrinsics.checkNotNullExpressionValue(tvTapToEnable, "tvTapToEnable");
                com.bumptech.glide.e.E(tvTapToEnable);
                TextView tvWeatherInformation = ((u) mainActivity.n()).F;
                Intrinsics.checkNotNullExpressionValue(tvWeatherInformation, "tvWeatherInformation");
                com.bumptech.glide.e.V(tvWeatherInformation);
                SharedPreferences o10 = mainActivity.o();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(' ');
                sb2.append(responseWeatherDto.getData().getCurrent().getTempC());
                sb2.append("℃/ ");
                ResponseWeatherDto.Data.Forecast.Day day = responseWeatherDto.getData().getForecast().get(0).getDay();
                if (day == null || (obj3 = day.getMaxtempC()) == null) {
                    obj3 = 79;
                }
                sb2.append(obj3);
                sb2.append((char) 8451);
                u0.i0("LOCATION_WEATHER_INFO", sb2.toString(), o10);
                TextView textView = ((u) mainActivity.n()).F;
                StringBuilder sb3 = new StringBuilder();
                sb3.append(string);
                sb3.append(' ');
                sb3.append(responseWeatherDto.getData().getCurrent().getTempC());
                sb3.append("℃/ ");
                ResponseWeatherDto.Data.Forecast.Day day2 = responseWeatherDto.getData().getForecast().get(0).getDay();
                if (day2 == null || (obj4 = day2.getMaxtempC()) == null) {
                    obj4 = 79;
                }
                sb3.append(obj4);
                sb3.append((char) 8451);
                textView.setText(sb3.toString());
                if (Intrinsics.areEqual(string, mainActivity.getString(R.string.state_weather_1000_d))) {
                    i10 = R.string.notification_content_sunny;
                } else {
                    boolean z10 = true;
                    if (Intrinsics.areEqual(string, mainActivity.getString(R.string.state_weather_1192))) {
                        areEqual = true;
                    } else {
                        areEqual = Intrinsics.areEqual(string, mainActivity.getString(R.string.state_weather_1195));
                    }
                    if (areEqual) {
                        areEqual2 = true;
                    } else {
                        areEqual2 = Intrinsics.areEqual(string, mainActivity.getString(R.string.state_weather_1240));
                    }
                    if (areEqual2) {
                        areEqual3 = true;
                    } else {
                        areEqual3 = Intrinsics.areEqual(string, mainActivity.getString(R.string.state_weather_1243));
                    }
                    if (areEqual3) {
                        areEqual4 = true;
                    } else {
                        areEqual4 = Intrinsics.areEqual(string, mainActivity.getString(R.string.state_weather_1246));
                    }
                    if (areEqual4) {
                        areEqual5 = true;
                    } else {
                        areEqual5 = Intrinsics.areEqual(string, mainActivity.getString(R.string.state_weather_1273));
                    }
                    if (areEqual5) {
                        areEqual6 = true;
                    } else {
                        areEqual6 = Intrinsics.areEqual(string, mainActivity.getString(R.string.state_weather_1276));
                    }
                    if (areEqual6) {
                        i10 = R.string.notification_content_heavy_rain;
                    } else {
                        if (Intrinsics.areEqual(string, mainActivity.getString(R.string.state_weather_1222))) {
                            areEqual7 = true;
                        } else {
                            areEqual7 = Intrinsics.areEqual(string, mainActivity.getString(R.string.state_weather_1225));
                        }
                        if (areEqual7) {
                            areEqual8 = true;
                        } else {
                            areEqual8 = Intrinsics.areEqual(string, mainActivity.getString(R.string.state_weather_1258));
                        }
                        if (areEqual8) {
                            areEqual9 = true;
                        } else {
                            areEqual9 = Intrinsics.areEqual(string, mainActivity.getString(R.string.state_weather_1069));
                        }
                        if (areEqual9) {
                            areEqual10 = true;
                        } else {
                            areEqual10 = Intrinsics.areEqual(string, mainActivity.getString(R.string.state_weather_1204));
                        }
                        if (areEqual10) {
                            areEqual11 = true;
                        } else {
                            areEqual11 = Intrinsics.areEqual(string, mainActivity.getString(R.string.state_weather_1207));
                        }
                        if (areEqual11) {
                            areEqual12 = true;
                        } else {
                            areEqual12 = Intrinsics.areEqual(string, mainActivity.getString(R.string.state_weather_1249));
                        }
                        if (areEqual12) {
                            areEqual13 = true;
                        } else {
                            areEqual13 = Intrinsics.areEqual(string, mainActivity.getString(R.string.state_weather_1252));
                        }
                        if (areEqual13) {
                            areEqual14 = true;
                        } else {
                            areEqual14 = Intrinsics.areEqual(string, mainActivity.getString(R.string.state_weather_1279));
                        }
                        if (areEqual14) {
                            areEqual15 = true;
                        } else {
                            areEqual15 = Intrinsics.areEqual(string, mainActivity.getString(R.string.state_weather_1282));
                        }
                        if (areEqual15) {
                            i10 = R.string.notification_content_heavy_snow;
                        } else {
                            if (Intrinsics.areEqual(string, mainActivity.getString(R.string.state_weather_1114))) {
                                areEqual16 = true;
                            } else {
                                areEqual16 = Intrinsics.areEqual(string, mainActivity.getString(R.string.state_weather_1117));
                            }
                            if (areEqual16) {
                                areEqual17 = true;
                            } else {
                                areEqual17 = Intrinsics.areEqual(string, mainActivity.getString(R.string.state_weather_1237));
                            }
                            if (areEqual17) {
                                areEqual18 = true;
                            } else {
                                areEqual18 = Intrinsics.areEqual(string, mainActivity.getString(R.string.state_weather_1261));
                            }
                            if (areEqual18) {
                                areEqual19 = true;
                            } else {
                                areEqual19 = Intrinsics.areEqual(string, mainActivity.getString(R.string.state_weather_1264));
                            }
                            if (areEqual19) {
                                areEqual20 = true;
                            } else {
                                areEqual20 = Intrinsics.areEqual(string, mainActivity.getString(R.string.state_weather_1072));
                            }
                            if (areEqual20) {
                                areEqual21 = true;
                            } else {
                                areEqual21 = Intrinsics.areEqual(string, mainActivity.getString(R.string.state_weather_1168));
                            }
                            if (areEqual21) {
                                areEqual22 = true;
                            } else {
                                areEqual22 = Intrinsics.areEqual(string, mainActivity.getString(R.string.state_weather_1171));
                            }
                            if (!areEqual22) {
                                z10 = Intrinsics.areEqual(string, mainActivity.getString(R.string.state_weather_1201));
                            }
                            if (z10) {
                                i10 = R.string.notification_content_freezing;
                            } else {
                                i10 = R.string.notification_content_weather;
                            }
                        }
                    }
                }
                ac.e.t(Integer.valueOf(weatherDomain.getValue()), "title_notify");
                ac.e.t(Integer.valueOf(i10), "description_notify");
            } else {
                TextView tvTapToEnable2 = ((u) mainActivity.n()).E;
                Intrinsics.checkNotNullExpressionValue(tvTapToEnable2, "tvTapToEnable");
                com.bumptech.glide.e.E(tvTapToEnable2);
                TextView tvWeatherInformation2 = ((u) mainActivity.n()).F;
                Intrinsics.checkNotNullExpressionValue(tvWeatherInformation2, "tvWeatherInformation");
                com.bumptech.glide.e.V(tvWeatherInformation2);
                ((u) mainActivity.n()).F.setText(mainActivity.getString(R.string.unknown));
            }
        } else {
            TextView tvTapToEnable3 = ((u) mainActivity.n()).E;
            Intrinsics.checkNotNullExpressionValue(tvTapToEnable3, "tvTapToEnable");
            com.bumptech.glide.e.E(tvTapToEnable3);
            TextView tvWeatherInformation3 = ((u) mainActivity.n()).F;
            Intrinsics.checkNotNullExpressionValue(tvWeatherInformation3, "tvWeatherInformation");
            com.bumptech.glide.e.V(tvWeatherInformation3);
            ((u) mainActivity.n()).F.setText(mainActivity.getString(R.string.unknown));
        }
        return Unit.INSTANCE;
    }
}
