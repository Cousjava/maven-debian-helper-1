package org.debian.maven.plugin;

/**
 * Install pom and jar files into the debian/ directory
 *
 * @goal install
 */
public class InstallMojo extends SysInstallMojo
{
  // ----------------------------------------------------------------------
  // Public methods
  // ----------------------------------------------------------------------

  // ----------------------------------------------------------------------
  // Private methods
  // ----------------------------------------------------------------------

  /* returns e.g. $CURDIR/debian/libfoobar-java
   */

  protected String packagePath()
  {
    return getDebianDir() + "/" + getDebianPackage();
  }
}
