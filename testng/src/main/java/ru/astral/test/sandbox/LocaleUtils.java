package ru.astral.test.sandbox;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.StringTokenizer;
/**
 * Created by Fedor on 19.11.2016.
 */
public abstract class LocaleUtils {

    public static final Locale ROOT_LOCALE = new Locale("");

    private static final String LOCALE_SEPARATOR = "_";

    /**
     * Gets locale for specified string value.
     *
     * @param value string value to convert
     * @return converted from string locale or null if can not be converted
     */
    public static Locale parseLocale(final String value) {
      if (value != null) {
        final StringTokenizer tokens = new StringTokenizer(value, LOCALE_SEPARATOR);
        final String language = tokens.hasMoreTokens() ? tokens.nextToken() : "";
        final String country = tokens.hasMoreTokens() ? tokens.nextToken() : "";
        String variant = "";
        String sep = "";
        while (tokens.hasMoreTokens()) {
          variant += sep + tokens.nextToken();
          sep = LOCALE_SEPARATOR;
        }
        return new Locale(language, country, variant);
      }
      return null;
    }

    /**
     * Gets locale candidates for specified locale.
     *
     * @param locale locale
     * @return locale candidates for specified locale
     */
    public static List<Locale> getCandidateLocales(final Locale locale) {
      final List<Locale> locales = new ArrayList<Locale>();
      if (locale != null) {
        final String language = locale.getLanguage();
        final String country = locale.getCountry();
        final String variant = locale.getVariant();

        if (variant.length() > 0) {
          locales.add(locale);
        }
        if (country.length() > 0) {
          locales.add((locales.size() == 0) ? locale : new Locale(language, country));
        }
        if (language.length() > 0) {
          locales.add((locales.size() == 0) ? locale : new Locale(language));
        }
      }
      locales.add(ROOT_LOCALE);
      return locales;
    }
  }
}
