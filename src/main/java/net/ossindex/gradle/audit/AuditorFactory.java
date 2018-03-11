package net.ossindex.gradle.audit;

import java.util.List;
import java.util.Set;

import net.ossindex.gradle.input.ArtifactGatherer;
import net.ossindex.gradle.input.GradleArtifact;

/**
 * Using a factory to make testing easier.
 */
public class AuditorFactory
{
  public DependencyAuditor getDependencyAuditor(Set< GradleArtifact > gradleArtifacts, List<Proxy> proxies) {
    return new DependencyAuditor(gradleArtifacts, proxies);
  }

  public ArtifactGatherer getGatherer() {
    ArtifactGatherer gatherer = new ArtifactGatherer();
    return gatherer;
  }
}
